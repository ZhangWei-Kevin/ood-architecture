



import org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean;

import asia.wavelet.bigledger.service.test.remote.IRemoteService;

public class HttpInvokerTest {

	public static void main(String args[]) {
//		 clientSpringTest();
		clientJavaTest();
//		clientJavaTest2();
	}

/*	public static void clientSpringTest() {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-client.xml");
		IRemoteService helloService = (IRemoteService) context.getBean("helloService");
		System.out.println(helloService.getName("258"));

	}*/

	public static void clientJavaTest() {

		String url = "http://localhost:8080/bigledger-server/remoting/IRemoteService";
		HttpInvokerProxyFactoryBean factory = new HttpInvokerProxyFactoryBean();

		factory.setServiceInterface(IRemoteService.class);
		factory.setServiceUrl(url);
		factory.afterPropertiesSet();

		IRemoteService remoteService = (IRemoteService) factory.getObject();
		System.out.println(remoteService.getRemoteTime());
		/*String url2 = "http://localhost:8080/bigledger-server/remoting/IRemoteService2";
		HttpInvokerProxyFactoryBean factory2 = new HttpInvokerProxyFactoryBean();
		
		factory2.setServiceInterface(IRemoteService2.class);
		factory2.setServiceUrl(url2);
		factory2.afterPropertiesSet();
		
		IRemoteService2 remoteService = (IRemoteService2) factory2.getObject();
		System.out.println(remoteService.sayHello("hello"));*/

	}
//	public static void clientJavaTest2() {
//		
//		String url = "http://localhost:8080/spring-mvc/remoting/IRemoteService2";
//		HttpInvokerProxyFactoryBean factory = new HttpInvokerProxyFactoryBean();
//		
//		factory.setServiceInterface(IRemoteService2.class);
//		factory.setServiceUrl(url);
//		factory.afterPropertiesSet();
//		
//		IRemoteService2 remoteService2 = (IRemoteService2) factory.getObject();
//		System.out.println(remoteService2.generateRandom(900));
//		
//		remoteService2.getDto(new String[]{"3", "4", "5"});
//		
//	}

}
