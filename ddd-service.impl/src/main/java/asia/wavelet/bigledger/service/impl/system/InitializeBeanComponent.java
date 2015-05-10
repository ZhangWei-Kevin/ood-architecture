//package asia.wavelet.bigledger.service.impl.system;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.config.BeanDefinition;
//import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
//import org.springframework.beans.factory.support.BeanDefinitionBuilder;
//import org.springframework.beans.factory.support.DefaultListableBeanFactory;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.ApplicationListener;
//import org.springframework.context.event.ContextRefreshedEvent;
//import org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;
//import org.springframework.web.context.support.XmlWebApplicationContext;
//
//@Component
//public class InitializeBeanComponent implements ApplicationListener<ContextRefreshedEvent> {
//	private static Logger logger = LoggerFactory.getLogger(InitializeBeanComponent.class);
//
//	private String XML_WEB_APPLICATION_CONTEXT_NAME = "WebApplicationContext for namespace 'springServlet-servlet'";
//	private String XML_WEB_APPLICATION_CONTEXT_NAME_ROOT = "Root WebApplicationContext";
//
//	@Override
//	public void onApplicationEvent(ContextRefreshedEvent event) {
//		logger.info("InitializeBeanComponment.onApplicationEvent() = "
//		        + event.getApplicationContext().getClass().getSimpleName() + ":"
//		        + event.getApplicationContext().getDisplayName());
//		ApplicationContext applicationContext = event.getApplicationContext();
//		
//		
//		
//		
//		
//		if (XML_WEB_APPLICATION_CONTEXT_NAME.equals(event.getApplicationContext().getDisplayName())) {
//			System.out.println("InitializeBeanComponent.onApplicationEvent()  XML_WEB_APPLICATION_CONTEXT_NAME");
//			initRemoteService((XmlWebApplicationContext) applicationContext);
//			
//			XmlWebApplicationContext xmlApp = (XmlWebApplicationContext) applicationContext;
//			ConfigurableListableBeanFactory beanFact = xmlApp.getBeanFactory();
////			try {
////				BeanFactory beanFactParent = beanFact.getParentBeanFactory();
////				logger.info("beanFactParent class = "+ beanFactParent.getClass().getName());
////				Object bdRmoteService2 = beanFact.getParentBeanFactory().getBean("/remoting/IRemoteService2");
////			} catch (Exception e) {
////				e.printStackTrace();
////				// TODO: handle exception
////			}
//			for (String iterable_element : applicationContext.getBeanNamesForType(HttpInvokerServiceExporter.class)) {
//				logger.info("检查 bean = "+ iterable_element);
//				BeanDefinition bDef = xmlApp.getBeanFactory().getBeanDefinition(iterable_element);
//				if(bDef != null){
//					
//				}
//				
//			}
//		}
//		
//		
//		
//	}
//
//	private void initRemoteService(XmlWebApplicationContext applicationContext) {
//		System.out.println("InitializeBeanComponent.initRemoteService() XmlWebApplicationContext applicationContext");
//		
//		DefaultListableBeanFactory defaultListableBeanFactory = (DefaultListableBeanFactory) applicationContext
//		        .getBeanFactory();
//		
//		DefaultListableBeanFactory pBeanFactory = (DefaultListableBeanFactory) defaultListableBeanFactory.getParentBeanFactory();
//		if(pBeanFactory != null){
//			logger.info("defaultListableBeanFactory parent =" + pBeanFactory.getClass().getName());
//		}
//
//		Map<Class<?>, String> remotingServiceInt = new HashMap<Class<?>, String>();
//		Map<String, String> needRegist = new HashMap<String, String>();
//
//		String[] ServiceAnnos = pBeanFactory.getBeanNamesForAnnotation(Service.class);
//		logger.info("ServiceAnnos =" + ServiceAnnos);
//		if(ServiceAnnos != null){
//			logger.info("ServiceAnnos length=" + ServiceAnnos.length);
//		}
//		for (String bName : ServiceAnnos) {
//			BeanDefinition beanDefinition = pBeanFactory.getBeanDefinition(bName);
//			
//			needRegist.put(bName, beanDefinition.getBeanClassName());
//			
//			logger.info("bName=" + bName);
//			logger.info("clzz=" + beanDefinition.getBeanClassName());
//			try {
//				Class<?> beanClass = Class.forName(beanDefinition.getBeanClassName());
//				Class<?>[] interfaces = beanClass.getInterfaces();
//				for (Class<?> intf : interfaces) {
//					logger.info("clzz -> interface = " + intf.getName());
//					remotingServiceInt.put(intf, bName);
//				}
//			} catch (ClassNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//
//		}
//
//		for (String beanName : needRegist.keySet()) {
//			BeanDefinitionBuilder beanDefinitionBuilder  = BeanDefinitionBuilder.genericBeanDefinition(needRegist.get(beanName));
//			defaultListableBeanFactory.registerBeanDefinition(beanName,
//			        beanDefinitionBuilder.getRawBeanDefinition());
//
//        }
//		
//		for (Class<?> interfaceClass : remotingServiceInt.keySet()) {
//			logger.info("-----------------register start-------------------------->>>>>>>>>>>>>>");
//			
//			logger.info("registerBeanDefinition service Reference= " + remotingServiceInt.get(interfaceClass));
//			logger.info("registerBeanDefinition interfaceClass.getName() = " + interfaceClass.getName());
//			logger.info("registerBeanDefinition interfaceClass.getSimpleName() = " + interfaceClass.getSimpleName());
//			BeanDefinitionBuilder beanDefinitionBuilder  = BeanDefinitionBuilder.genericBeanDefinition(HttpInvokerServiceExporter.class);
//			beanDefinitionBuilder.addPropertyReference("service", remotingServiceInt.get(interfaceClass));
//			beanDefinitionBuilder.addPropertyValue("serviceInterface", interfaceClass.getName());
//
//			// 注册bean
//			defaultListableBeanFactory.registerBeanDefinition("/remoting/" + interfaceClass.getSimpleName(),
//			        beanDefinitionBuilder.getRawBeanDefinition());
//
//			logger.info("--------------------register end----------------------->>>>>>>>>>>>>>");
//		}
//		
//
//	}
//
//}
