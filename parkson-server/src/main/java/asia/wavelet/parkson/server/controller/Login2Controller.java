package asia.wavelet.parkson.server.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import asia.wavelet.parkson.data.entity.account.local.AppConfigCustomFieldEntity;
import asia.wavelet.parkson.data.repository.local.AppConfigCustomFieldEntityDao2;
import asia.wavelet.parkson.data.service.account.ITestService;

@Controller
@RequestMapping(value = "/login2")
public class Login2Controller {
	private static final Logger logger = LoggerFactory.getLogger(Login2Controller.class);

/*	@Autowired
	private ILoginService loginService;*/
	
	@Autowired
	private ITestService testService;
	
	@Autowired
	private AppConfigCustomFieldEntityDao2 appConfigCustomFieldEntityDao2;

	/*@RequestMapping(method = RequestMethod.GET)
	public String login() {
		System.out.println("Login2Controller.login()2");
		System.out.println("Login2Controller.login():loginService="
				+ loginService);
		
		 * try { // TransactionManager transactionManager = (TransactionManager)
		 * new InitialContext() // .lookup("java:/TransactionManager");
		 * 
		 * javax.sql.DataSource ds = (DataSource) new InitialContext()
		 * .lookup("java:/oracle_1");
		 * 
		 * System.out.println("Login2Controller.login() === " + ds);
		 * 
		 * 
		 * } catch (Exception e) { e.printStackTrace(); }
		 

		loginService.login("a", "b");
		
		return "account/login";

	}*/
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test() {
		testService.test();
		return "account/login";
		
	}
	@RequestMapping(value = "/test2", method = RequestMethod.GET)
	public String test2() {
		List<AppConfigCustomFieldEntity> entities = appConfigCustomFieldEntityDao2.findByName("abc", new   PageRequest(2, 2, Direction.ASC, "guid"));
		for (AppConfigCustomFieldEntity entity : entities) {
			logger.info("guid = [{}], name = [{}]", entity.getGuid(), entity.getName());
		}
		
		return "account/login";
		
	}
	public ITestService getTestService() {
		return testService;
	}
	public void setTestService(ITestService testService) {
		this.testService = testService;
	}
	public AppConfigCustomFieldEntityDao2 getAppConfigCustomFieldEntityDao2() {
		return appConfigCustomFieldEntityDao2;
	}
	public void setAppConfigCustomFieldEntityDao2(
			AppConfigCustomFieldEntityDao2 appConfigCustomFieldEntityDao2) {
		this.appConfigCustomFieldEntityDao2 = appConfigCustomFieldEntityDao2;
	}
	
	
	
	
	
}
