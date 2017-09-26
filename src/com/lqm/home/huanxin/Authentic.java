package com.lqm.home.huanxin;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpRequestBase;
public class Authentic {
	private static Token token = new Token();
	private TalkHttpService service;
	public Authentic(TalkHttpService service) {
		this.service = service;
	}
	public Authentic(TalkHttpService service, Token token) {
		this.service = service;
		if(token!=null){
			Authentic.token = token;
		}
	}
	public Token getToken() {
		this.flush();
		return token;
	}
	public void task() {
		//TODO 定时刷新服务端TOKEN
		this.flush();
	}
	public void applyAuthentication(HttpEntityEnclosingRequestBase request) {
		this.flush();
		request.addHeader("Authorization","Bearer "+token.toString());
	}
	public void applyAuthentication(HttpRequestBase request) {
		this.flush();
		request.addHeader("Authorization","Bearer "+token.toString());
	}
	private void flush() {
		synchronized(Authentic.class){
			try{
				if(token.isExpire()){
					if(_Global.APP_CLIENT_ID!=null&&_Global.APP_CLIENT_SECRET!=null){
						Map<String,Object>param = new HashMap<String,Object>();
						param.put("grant_type","client_credentials");
						param.put("client_id",_Global.APP_CLIENT_ID);
						param.put("client_secret",_Global.APP_CLIENT_SECRET);
						TalkNode res = service.request(_Global.URR_TOKEN,_Global.HTTP_METHOD_POST,param,null,null);
						if(res!=null&&res.getAccess_token()!=null&&res.getExpires_in()!=null&&res.getExpires_in()>0){
							token = new Token(res.getAccess_token(),res.getExpires_in()*1000+System.currentTimeMillis());
						}
					}
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	public static class Token {
		private String token;
		private Long expire;
		public Token() {}
		public Token(String token, long expire) {
			this.token = token;
			this.expire = expire;
		}
		public String getToken() {
			return token;
		}
		public void setToken(String token) {
			this.token = token;
		}
		public Long getExpire() {
			return expire;
		}
		public void setExpire(Long expire) {
			this.expire = expire;
		}
		public boolean isExpire() {
			return expire==null||System.currentTimeMillis()>expire;
		}
		@Override
		public String toString() {
			return token;
		}
	}
}