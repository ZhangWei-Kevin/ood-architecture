package asia.wavelet.bigledger.test.service.remote;




import org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean;

import asia.wavelet.bigledger.service.test.remote.IRemoteService;

public class HttpInvokerTest {

	public static void main(String args[]) {
		clientJavaTest();
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

	}

}
