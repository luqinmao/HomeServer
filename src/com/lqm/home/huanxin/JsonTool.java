package com.lqm.home.huanxin;
import java.text.SimpleDateFormat;
import java.text.SimpleDateFormat;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

public class JsonTool {
	public static String write(Object data) throws Exception {
		if(data==null){
			return null;
		}
		ObjectMapper mapper = new ObjectMapper();
		init(mapper);
		return mapper.writeValueAsString(data);
	}
	public static Object read(String json, Class<?>clz) throws Exception {
		if(json==null||json.equals("")||clz==null){
			return null;
		}
		ObjectMapper mapper = new ObjectMapper();
		init(mapper);
		return mapper.readValue(json,clz);
	}
	private static void init(ObjectMapper mapper) {
		mapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES,false);
		mapper.configure(SerializationConfig.Feature.WRAP_EXCEPTIONS,true);
		mapper.configure(SerializationConfig.Feature.WRITE_DATES_AS_TIMESTAMPS,false);
		mapper.configure(SerializationConfig.Feature.WRITE_NULL_MAP_VALUES,false);
		mapper.setSerializationInclusion(Inclusion.NON_DEFAULT);
		mapper.setSerializationInclusion(Inclusion.NON_EMPTY);
		mapper.setSerializationInclusion(Inclusion.NON_NULL);
		mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
	}
}