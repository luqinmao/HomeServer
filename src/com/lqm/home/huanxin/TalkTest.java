package com.lqm.home.huanxin;
public class TalkTest {
	public static Authentic.Token TEST_TOKEN = new Authentic.Token("YWMt4EPcDvVpEeWmTm2uJUQPcwAAAVT1s8Bmn-wB5wwM9nqr6HgljAvlo79iDX8",1465203701330L);
	public static String TEST_USERNAME = "username1";
	public static String TEST_PASSWORD = "123456";
	public static void main1(String[] args) throws Exception {
		//初始服务端Token
		Authentic.Token token = new Authentic(new TalkHttpServiceImplApache()).getToken();
		System.out.println(token.getToken());
		System.out.println(token.getExpire()+"L");
	}
	public static void main(String[] args) throws Exception {
		//通过构造方法注入http请求业务以实现数据业务
		TalkDataService service = new TalkDataServiceImpl(new TalkHttpServiceImplApache());
		//修改数据业务Token
		service.setToken(TEST_TOKEN);
		
		//删除
		System.out.println("删除="+JsonTool.write(service.userDrop(TEST_USERNAME))+"\n");
		//注册
		System.out.println("注册="+JsonTool.write(service.userSave(TEST_USERNAME,TEST_PASSWORD,"用户昵称"))+"\n");
		//登录
		//System.out.println("登录="+JsonTool.write(service.login(TEST_USERNAME,TEST_USERNAME))+"\n");
	}
	
	//TODO 尚未验证成功！
	//TalkDataService.messageList()
	//TalkDataService.blackDrop()
}