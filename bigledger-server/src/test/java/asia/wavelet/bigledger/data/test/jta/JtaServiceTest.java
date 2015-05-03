package asia.wavelet.bigledger.data.test.jta;


import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;

import asia.wavelet.bigledger.service.test.jta.IJTAService;

@ContextConfiguration(locations = { "/applicationContext-jboss.xml" })
public class JtaServiceTest extends SpringJtaTestCase {
	private static final Logger logger = LoggerFactory.getLogger(JtaServiceTest.class);
	
	@Autowired
	private IJTAService jtaService;

	@Test
	@Rollback(true)
	public void add() throws Exception {
		jtaService.add();
	}
}
