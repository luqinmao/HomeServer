package com.lqm.home.yunxin;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.HttpVersion;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.AllowAllHostnameVerifier;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.PoolingClientConnectionManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.CoreConnectionPNames;
import org.apache.http.params.CoreProtocolPNames;
import org.apache.http.params.HttpParams;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 带连接池的HTTP
 */

public class HttpClientUtil {

    private static final String TAG_CHARSET = "charset=";

    private final static Logger logger = LoggerFactory.getLogger(HttpClientUtil.class);

    private static final int CONNECTION_TIMEOUT = 3000;// 连接超时时间
    private static final int SO_TIMEOUT = 5000;// 等待数据超时时间
    private PoolingClientConnectionManager pool = null;
    private int maxConnection = 32;
    private static final String DEFAULT_CHARSET = "UTF-8";
    private int conntimeout = CONNECTION_TIMEOUT;
    private int sotimeout = SO_TIMEOUT;
    private String reqCharset = DEFAULT_CHARSET;
    private String resCharset = DEFAULT_CHARSET;
    private String agentHeader = "Netease/0.1";

    public HttpClientUtil() {

    }

    public HttpClientUtil(int conntimeout, int sotimeout) {
        this.sotimeout = sotimeout;
        this.conntimeout = conntimeout;
    }

    public HttpClientUtil(int maxConnection, int conntimeout, int sotimeout) {
        this(conntimeout, sotimeout);
        this.maxConnection = maxConnection;
    }

    public HttpClientUtil(int maxConnection, String charset, int conntimeout, int sotimeout) {
        this(conntimeout, sotimeout);
        this.maxConnection = maxConnection;
        this.reqCharset = charset;
    }

    public HttpClientUtil(int maxConnection) {
        this.maxConnection = maxConnection;
    }

    public HttpClientUtil(int maxConnection, String charset) {
        this.maxConnection = maxConnection;
        this.reqCharset = charset;
    }

    public HttpClientUtil(int maxConnection, String charset, String resCharset) {
        this.maxConnection = maxConnection;
        this.reqCharset = charset;
        this.resCharset = resCharset;
    }

    private HttpParams getParams() {
        HttpParams params = new BasicHttpParams();
        params.setParameter(CoreProtocolPNames.PROTOCOL_VERSION, HttpVersion.HTTP_1_1);
        params.setParameter(CoreConnectionPNames.SO_TIMEOUT, sotimeout);
        params.setParameter(CoreConnectionPNames.CONNECTION_TIMEOUT, conntimeout);
        return params;
    }

    private HttpClient httpClient;

    public HttpClient getHttpClient() {
        if (httpClient == null) {
            synchronized (this) {
                if (httpClient == null) {
                    httpClient = new DefaultHttpClient(getPool(), getParams());
                }
            }
        }
        return httpClient;
    }

    public HttpClient getHttpClient(boolean forcenew) {
        if (forcenew) {
            return new DefaultHttpClient(getPool(), getParams());
        } else {
            return getHttpClient();
        }
    }

    @PreDestroy
    public void destroy() throws Exception {
        logger.info("Http connection pool will destory...");
        if (pool != null) {
            pool.shutdown();
        }
        logger.info("Http connection pool destroyed!");
    }

    @PostConstruct
    public void afterPropertiesSet() throws Exception {
        getPool();
    }

    private PoolingClientConnectionManager getPool() {
        if (pool == null) {
            synchronized (this) {
                SchemeRegistry schemeRegistry = new SchemeRegistry();
                schemeRegistry.register(new Scheme("http", 80, PlainSocketFactory.getSocketFactory()));
                try {
                    schemeRegistry.register(new Scheme("https", 443, createSSL()));
                } catch (KeyManagementException e) {
                    logger.error("error register 443 scheme support", e);
                } catch (NoSuchAlgorithmException e) {
                    logger.error("error register 443 scheme support", e);
                }
                pool = new PoolingClientConnectionManager(schemeRegistry, 60, TimeUnit.SECONDS);
                pool.setMaxTotal(maxConnection);
                pool.setDefaultMaxPerRoute(maxConnection);
            }
        }
        return pool;
    }

    public SSLSocketFactory createSSL() throws KeyManagementException, NoSuchAlgorithmException {
        TrustManager easyTrustManager = new X509TrustManager() {

            public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
                // 哦，这很简单！
            }

            @Override
            public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
                // 哦，这很简单！
            }

            @Override
            public X509Certificate[] getAcceptedIssuers() {
                return null;
            }
        };
        SSLContext sslcontext = SSLContext.getInstance("TLS");
        sslcontext.init(null, new TrustManager[] { easyTrustManager }, null);
        SSLSocketFactory sf = new SSLSocketFactory(sslcontext, new AllowAllHostnameVerifier());

        return sf;
    }

    /**
     * 直接返回字符
     *
     * @param url
     * @return
     * @throws java.io.IOException
     */
    public String getData(String url, List<NameValuePair> params) throws IOException {
        return fetchData(createGet(url, params, null));
    }

    public String getData(String url) throws IOException {
        return fetchData(createGet(url, Collections.EMPTY_LIST, null));
    }

    public String getData(String url, ApplicationType type) throws IOException {
        return fetchData(createGet(url, Collections.EMPTY_LIST, type));
    }

    public String getData(String url, List<NameValuePair> params, ApplicationType type) throws IOException {
        return fetchData(createGet(url, params, type));
    }

    public String putData(String url, List<NameValuePair> params) throws IOException {
        return fetchData(createPut(url, params, null));
    }

    public String putData(String url, List<NameValuePair> params, ApplicationType type) throws IOException {
        return fetchData(createPut(url, params, type));
    }

    public String deleteData(String url, List<NameValuePair> params) throws IOException {
        return fetchData(createDelete(url, params, null));
    }

    public String deleteData(String url, List<NameValuePair> params, ApplicationType type) throws IOException {
        return fetchData(createDelete(url, params, type));
    }

    public String postData(String url, final HttpEntity entity, ApplicationType type) throws IOException {
        return fetchData(this.createPost(url, entity, type));
    }

    public String postData(String url, final HttpEntity entity) throws IOException {
        return fetchData(this.createPost(url, entity, null));
    }

    public String postData(String url, final List<NameValuePair> params) throws IOException {
        return fetchData(this.createPost(url, params, null));
    }

    public String postData(String url, final List<NameValuePair> params, ApplicationType type) throws IOException {
        return fetchData(this.createPost(url, params, type));
    }

    public String fetchData(HttpRequestBase request) {
        String result = null;
        if (request == null)
            return result;
        HttpClient client = null;
        long watch = System.nanoTime();
        try {
            client = decHttpClient(request);
            HttpResponse response = client.execute(request);
            HttpEntity rsentity = response.getEntity();
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                Charset rescharset = ContentType.getOrDefault(rsentity).getCharset();
                if (rescharset != null && rescharset.name().equals("ISO-8859-1")) {
                    result = EntityUtils.toString(rsentity);
                    if (resCharset == null) {
                        result = new String(result.getBytes(rescharset), DEFAULT_CHARSET);
                    } else {
                        result = new String(result.getBytes(rescharset), resCharset);
                    }
                } else {
                    if (resCharset != null) {
                        result = EntityUtils.toString(rsentity, resCharset);
                    } else {
                        result = EntityUtils.toString(rsentity);
                    }
                }
                if (logger.isDebugEnabled()) {
                    logger.debug(" fetch request {} ", result);
                }
            } else {
                logger.error("fetch request return error status:{} code:{}", request.getURI(), response.getStatusLine().getStatusCode());
            }
            // EntityUtils.consume(rsentity);
        } catch (ClientProtocolException e) {
            logger.error("fetch request error {} msg {}", request.getURI(), e.getMessage());
        } catch (ParseException e) {
            logger.error("fetch request error {} msg {}", request.getURI(), e.getMessage());
        } catch (IOException e) {
            logger.error("fetch request error {} msg {}", request.getURI(), e.getMessage());
        } finally {
            request.releaseConnection();
            if (logger.isDebugEnabled())
                logger.debug("fetch url:{} consume:{} ", request.getURI(), (System.nanoTime() - watch) / 1000);
        }
        return result;
    }

    private HttpClient decHttpClient(HttpRequestBase request) {
        HttpClient client;
        client = getHttpClient();
        request.addHeader("User-Agent", agentHeader);
        return client;
    }

    public static void addHeader(HttpRequestBase request, String key, String val) {
        request.addHeader(key, val);
    }

    /**
     * 创建post请求
     *
     *            路径
     * @return 请求
     * @throws java.io.UnsupportedEncodingException
     */
    public HttpPost createPost(String url, final List<NameValuePair> params, ApplicationType type) throws UnsupportedEncodingException {
        UrlEncodedFormEntity entity = new UrlEncodedFormEntity(params, reqCharset);
        return createPost(url, entity, type);
    }

    public HttpPost createPost(String url, final List<NameValuePair> params) throws UnsupportedEncodingException {
        return createPost(url, params, null);
    }

    public HttpPost createPost(String url, HttpEntity entity) {
        return createPost(url, entity, null);
    }

    public HttpPost createPost(String url, HttpEntity entity, ApplicationType accept) {
        HttpPost method = new HttpPost(url);
        if (null != accept) {
            method.addHeader("accept", accept.val());
        }
        method.setEntity(entity);
        return method;
    }

    public HttpGet createGet(String url, final List<NameValuePair> params) throws IOException {
        return createGet(url, params, null);
    }

    public HttpGet createGet(String url, final List<NameValuePair> params, ApplicationType accept) throws IOException {
        HttpGet method = new HttpGet(urlEncode(url, params));
        if (null != accept) {
            method.addHeader("accept", accept.val());
        }
        return method;
    }

    private String urlEncode(String url, final List<NameValuePair> params) {
        if (params == null)
            return url;
        String param = URLEncodedUtils.format(params, reqCharset);
        if (url.indexOf("?") == -1) {
            url += "?" + param;
        } else {
            url += param;
        }
        return url;
    }

    public HttpPut createPut(String url, final List<NameValuePair> params, ApplicationType accept) throws IOException {
        HttpPut method = new HttpPut(url);
        if (params != null) {
            UrlEncodedFormEntity entity = new UrlEncodedFormEntity(params, reqCharset);
            method.setEntity(entity);
        }
        if (null != accept) {
            method.addHeader("accept", accept.val());
        }
        return method;
    }

    public HttpPut createPut(String url, final List<NameValuePair> params) throws IOException {
        return createPut(url, params, null);
    }

    public HttpDelete createDelete(String url, final List<NameValuePair> params) throws IOException {
        return createDelete(url, params, null);
    }

    public HttpDelete createDelete(String url, final List<NameValuePair> params, ApplicationType accept) throws IOException {
        HttpDelete method = new HttpDelete(urlEncode(url, params));
        if (null != accept) {
            method.addHeader("accept", accept.val());
        }
        return method;
    }

    public String getAgentHeader() {
        return agentHeader;
    }

    public void setAgentHeader(String agentHeader) {
        this.agentHeader = agentHeader;
    }

}