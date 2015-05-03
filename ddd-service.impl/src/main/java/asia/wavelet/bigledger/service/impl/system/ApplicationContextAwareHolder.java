/*package asia.wavelet.bigledger.service.impl.system;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.XmlWebApplicationContext;

@Component
@Service
public class ApplicationContextAwareHolder implements ApplicationContextAware {
	private static Logger logger = LoggerFactory.getLogger(ApplicationContextAwareHolder.class);

	private String XML_WEB_APPLICATION_CONTEXT_NAME = "WebApplicationContext for namespace 'springServlet-servlet'";

	public  static ApplicationContext applicationContext;
	
	public static int count = 0;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("ApplicationContextAwareHolder.setApplicationContext()");
		this.applicationContext = applicationContext;
		
		logger.info("ApplicationContextAwareHolder.setApplicationContext() = " + applicationContext.getClass().getName());
		logger.info("ApplicationContextAwareHolder.setApplicationContext() count= " + (++ count));
		
		initRemoteService((XmlWebApplicationContext) applicationContext);
		

	}

	private void initRemoteService(XmlWebApplicationContext applicationContext) {
		System.out.println("InitializeBeanComponent.initRemoteService() XmlWebApplicationContext applicationContext");
		DefaultListableBeanFactory defaultListableBeanFactory = (DefaultListableBeanFactory) applicationContext
		        .getBeanFactory();

		Map<Class<?>, String> remotingServiceInt = new HashMap<Class<?>, String>();

		String[] ServiceAnnos = defaultListableBeanFactory.getBeanNamesForAnnotation(Service.class);
		logger.info("ServiceAnnos =" + ServiceAnnos);
		if(ServiceAnnos != null){
			logger.info("ServiceAnnos length=" + ServiceAnnos.length);
		}
		for (String bName : ServiceAnnos) {
			BeanDefinition beanDefinition = defaultListableBeanFactory.getBeanDefinition(bName);
			logger.info("bName=" + bName);
			logger.info("clzz=" + beanDefinition.getBeanClassName());
			try {
				Class<?> beanClass = Class.forName(beanDefinition.getBeanClassName());
				Class<?>[] interfaces = beanClass.getInterfaces();
				for (Class<?> intf : interfaces) {
					logger.info("clzz -> interface = " + intf.getName());
					remotingServiceInt.put(intf, bName);
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		for (Class<?> interfaceClass : remotingServiceInt.keySet()) {
			logger.info("-----------------register start-------------------------->>>>>>>>>>>>>>");
			
			logger.info("service Reference= " + remotingServiceInt.get(interfaceClass));
			logger.info("interfaceClass.getName() = " + interfaceClass.getName());
			logger.info("interfaceClass.getSimpleName() = " + interfaceClass.getSimpleName());
			BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder
			        .genericBeanDefinition(HttpInvokerServiceExporter.class);
			beanDefinitionBuilder.addPropertyReference("service", remotingServiceInt.get(interfaceClass));
			beanDefinitionBuilder.addPropertyValue("serviceInterface", interfaceClass.getName());

			// 注册bean
			defaultListableBeanFactory.registerBeanDefinition("/remoting/" + interfaceClass.getSimpleName(),
			        beanDefinitionBuilder.getRawBeanDefinition());

			logger.info("--------------------register end----------------------->>>>>>>>>>>>>>");
		}

	}
}
*/