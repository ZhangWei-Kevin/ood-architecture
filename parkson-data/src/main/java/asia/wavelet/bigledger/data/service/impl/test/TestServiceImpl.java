package asia.wavelet.bigledger.data.service.impl.test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import asia.wavelet.bigledger.data.entity.test.Person;
import asia.wavelet.bigledger.data.repository.test.PersonDao;
import asia.wavelet.bigledger.data.service.common.BaseService;
import asia.wavelet.bigledger.data.service.test.ITestService;

@Service
@Transactional
public class TestServiceImpl extends BaseService implements ITestService {

	@Autowired
	private PersonDao personDao;

	@Override
	public void justTest() {
	}

	@Transactional(readOnly = true)
	@Override
    public void findBy() {
		personDao.findAll();
    }

	@Override
    public void add() {
		Person person = new Person();
		person.setGuid(UUID.randomUUID().toString());
		person.setVersion(0);
		person.setCode(new Random().nextLong() + "");
		person.setStartLifecycle(Calendar.getInstance());
		person.setEndLifecycle(Calendar.getInstance());
		
		personDao.save(person);
    }

	@Override
    public void modify() {
		Iterable<Person> persons = personDao.findAll();
		List<Person> personList =  new ArrayList<Person>();
		
		for (Person person : persons) {
			person.setName(new Random().nextDouble() + "modify!");
		}
		
		personDao.save(persons);
		
    }

	@Override
    public void remove() {
		personDao.deleteAll();
    }

}
