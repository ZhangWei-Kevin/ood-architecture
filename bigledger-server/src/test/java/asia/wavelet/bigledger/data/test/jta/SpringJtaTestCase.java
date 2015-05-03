package asia.wavelet.bigledger.data.test.jta;

import java.sql.SQLException;

import javax.naming.NamingException;

import oracle.jdbc.xa.client.OracleXADataSource;

import org.junit.BeforeClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mock.jndi.SimpleNamingContextBuilder;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

public abstract class SpringJtaTestCase extends AbstractTransactionalJUnit4SpringContextTests {
	private static Logger logger = LoggerFactory.getLogger(SpringJtaTestCase.class);

	@BeforeClass
	public static void init() throws NamingException, SQLException {
		OracleXADataSource serverDataSource = null;
		serverDataSource = new OracleXADataSource();
		serverDataSource.setURL("jdbc:oracle:thin:@localhost:1521:orcl");
		serverDataSource.setUser("pntest");
		serverDataSource.setPassword("wavelet");
		
		SimpleNamingContextBuilder builderServer = null;
		builderServer = SimpleNamingContextBuilder.emptyActivatedContextBuilder();
		builderServer.bind("java:/oracle_1", serverDataSource);
		
		OracleXADataSource queueDataSource = null;
		queueDataSource = new OracleXADataSource();
		queueDataSource.setURL("jdbc:oracle:thin:@localhost:1521:orcl");
		queueDataSource.setUser("parksonOffice");
		queueDataSource.setPassword("wavelet");
		builderServer.bind("java:/oracle_2", queueDataSource);

		builderServer.activate();

	}

}
