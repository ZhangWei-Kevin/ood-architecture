package asia.wavelet.bigledger.data.service.impl.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
		Person person = new Person(new Random().nextInt() + "", "", new Random().nextInt(1000) + "");
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

	@Override
    public void findByUserDefine() {
		Person p = personDao.findByXXId("fe2afc13-65d4-4a86-bd1a-2b431803cad4");
		System.out.println("TestServiceImpl.findByUserDefine()  = " + p);
		Person p2 = personDao.findByXXId("xx");
		System.out.println("TestServiceImpl.findByUserDefine() p2 = " + p2);
		
		
		List<Person> p3s = personDao.findByYY("1");
		System.out.println("TestServiceImpl.findByUserDefine() p3s = " + p3s);
		
		
		List<Person> p4s = personDao.findByYY("2");
		System.out.println("TestServiceImpl.findByUserDefine() p4s = " + p4s);
    }

}
