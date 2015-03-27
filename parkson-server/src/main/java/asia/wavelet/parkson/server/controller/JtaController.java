package asia.wavelet.parkson.server.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import asia.wavelet.bigledger.data.service.test.jta.IJTAService;

@Controller
@RequestMapping(value = "/jta")
public class JtaController {
	private static final Logger logger = LoggerFactory.getLogger(JtaController.class);

	@Autowired
	private IJTAService service;
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String add(){
		service.add();
		return "account/login";
	}
	
}
