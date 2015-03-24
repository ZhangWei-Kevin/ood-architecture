package asia.wavelet.bigledger.data.test.crud;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;

import asia.wavelet.bigledger.data.service.test.ITestService;
import asia.wavelet.bigledger.data.test.common.SpringTransactionalTestCase;

@ContextConfiguration(locations = { "/applicationContext.xml" })
public class TransactionServiceTest extends SpringTransactionalTestCase {
	private static final Logger logger = LoggerFactory.getLogger(TransactionServiceTest.class);

	@Autowired
	private ITestService testService;

	@Test
	@Rollback(true)
	public void add() throws Exception {
		testService.add();
	}
}
