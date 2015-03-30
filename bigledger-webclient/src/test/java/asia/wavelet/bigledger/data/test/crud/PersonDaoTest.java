//package asia.wavelet.bigledger.data.test.crud;
//
//import java.util.List;
//
//import org.junit.Test;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Sort.Direction;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.util.Assert;
//
//import asia.wavelet.bigledger.data.entity.test.Person;
//import asia.wavelet.bigledger.data.repository.test.PersonDao;
//import asia.wavelet.bigledger.data.repository.test.PersonNativeQuery;
//import asia.wavelet.bigledger.data.repository.test.PersonPageDao;
//import asia.wavelet.bigledger.data.test.common.SpringTransactionalTestCase;
//import asia.wavelet.parkson.dto.test.PersonInfo;
//
//@ContextConfiguration(locations = { "/applicationContext.xml" })
//public class PersonDaoTest extends SpringTransactionalTestCase {
//	private static final Logger logger = LoggerFactory.getLogger(PersonDaoTest.class);
//
//	@Autowired
//	private PersonDao personDao;
//	@Autowired
//	private PersonPageDao personPageDao;
//	@Autowired
//	private PersonNativeQuery p2Dao;
//
//	@Test
//	public void findTasksByUserId() throws Exception {
//		Iterable<Person> persons = personDao.findAll();
//		for (Person person : persons) {
//			logger.info("    ===>>" + person.getGuid());
//        }
//		 
//		Assert.isTrue(persons.iterator().hasNext());
//	}
//	@Test
//	public void findNativeQuery() throws Exception {
//		List<PersonInfo> personInfos = p2Dao.findBy(new PageRequest(3, 2));
//		logger.info("    ===personInfos==== " + personInfos);
//		Assert.isTrue(personInfos.size() > 0);
//	}
//	
//	@Test
//	public void findPagable() throws Exception {
//		Page<Person> personByPage = personPageDao.findByDescriptionLike("%00%", new PageRequest(2, 3, Direction.ASC, "name"));
//		Assert.isTrue(personByPage.getContent().size() > 0);
//	}
// }
