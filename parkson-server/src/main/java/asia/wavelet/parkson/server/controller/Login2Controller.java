package asia.wavelet.parkson.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import asia.wavelet.parkson.data.service.account.ILoginService;

@Controller
@RequestMapping(value = "/login2")
public class Login2Controller {

	@Autowired
	private ILoginService loginService;

	@RequestMapping(method = RequestMethod.GET)
	public String login() {
		System.out.println("Login2Controller.login()2");
		System.out.println("Login2Controller.login():loginService="
				+ loginService);
		/*
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
		 */

		loginService.login("a", "b");
		
		return "account/login";

	}
}
