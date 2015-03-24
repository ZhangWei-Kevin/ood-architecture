package asia.wavelet.bigledger.data.test.crud;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.util.Assert;

import asia.wavelet.bigledger.data.entity.test.Person;
import asia.wavelet.bigledger.data.repository.test.PersonDao;
import asia.wavelet.bigledger.data.test.common.SpringTransactionalTestCase;

@ContextConfiguration(locations = { "/applicationContext.xml" })
public class PersonDaoTest extends SpringTransactionalTestCase {
	private static final Logger logger = LoggerFactory.getLogger(PersonDaoTest.class);

	@Autowired
	private PersonDao personDao;

	@Test
	public void findTasksByUserId() throws Exception {
		Iterable<Person> persons = personDao.findAll();
		for (Person person : persons) {
			logger.info("    ===>>" + person.getGuid());
        }
		 
		Assert.isTrue(persons.iterator().hasNext());
	}
}
