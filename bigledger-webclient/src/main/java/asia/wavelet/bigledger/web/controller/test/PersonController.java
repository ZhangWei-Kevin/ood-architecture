package asia.wavelet.bigledger.web.controller.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import asia.wavelet.bigledger.web.controller.common.BaseController;

@Controller
@RequestMapping(value = "/testPerson")
public class PersonController extends BaseController{
	
	@RequestMapping("/testFind")
	public String test() {
		return "login";
	}

	/*@Autowired
	private ITestService testService;
	
	@RequestMapping("/testFind")
	public String test(){
		testService.findBy();
		return "login";
	}
	
	@RequestMapping("/find2")
	public String find2(){
		testService.findByUserDefine();
		return "login";
	}
	@RequestMapping("/testAdd")
	public String testAdd(){
		testService.add();
		return "login";
	}
	
	@RequestMapping("/testRemove")
	public String testModify(){
		testService.remove();
		return "login";
	}*/
	
}
