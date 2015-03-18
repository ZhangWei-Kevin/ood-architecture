package asia.wavelet.parkson.data.service.impl.account;

import java.util.Calendar;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import asia.wavelet.parkson.data.entity.account.local.UserEntity;
import asia.wavelet.parkson.data.entity.account.remote.TestJtaEntity;
import asia.wavelet.parkson.data.repository.local.UserEntityDao;
import asia.wavelet.parkson.data.repository.remote.TestJtaEntityDao;
import asia.wavelet.parkson.data.service.account.ILoginService;

@Service
@Transactional
public class LoginService implements ILoginService {
	
	@Autowired
	private UserEntityDao userEntityDao;
	
	@Autowired
	private TestJtaEntityDao testJtaEntityDao;
	
	public LoginService() {
		super();
	}

	@Override
	@Transactional
	public void login(String username, String passoword){
		System.out.println("LoginService.login()3");
		Iterable<UserEntity> userEntities = userEntityDao.findAll();
		Iterator<UserEntity> iterator = userEntities.iterator();
		while(iterator.hasNext()){
			System.out.println("LoginService.login()==" + iterator.next().getUsername());
		}
		
		Iterable<TestJtaEntity> jtaEntities = testJtaEntityDao.findAll();
		Iterator<TestJtaEntity> jtaEntitiesIterator = jtaEntities.iterator();
		while(jtaEntitiesIterator.hasNext()){
			System.out.println("LoginService.login()==" + jtaEntitiesIterator.next().getName());
		}
		
		//oracle1
		 UserEntity userEntity = new UserEntity();
		 userEntity.setGuid(Calendar.getInstance().getTimeInMillis() + "");
		 userEntity.setUsername("abc");
		 userEntityDao.save(userEntity);
		 
		 //oracle2
		 TestJtaEntity testJtaEntity = new TestJtaEntity();
		 testJtaEntity.setGuid(Calendar.getInstance().getTimeInMillis() * 8 + "");
		 testJtaEntity.setName("xyz");
		 testJtaEntityDao.save(testJtaEntity);
		 
//		 int i = 8 /0;
		 
		System.out.println("LoginService------------------------end------------------");
	}

	public UserEntityDao getUserEntityDao() {
		return userEntityDao;
	}

	public void setUserEntityDao(UserEntityDao userEntityDao) {
		this.userEntityDao = userEntityDao;
	}

	public TestJtaEntityDao getTestJtaEntityDao() {
		return testJtaEntityDao;
	}

	public void setTestJtaEntityDao(TestJtaEntityDao testJtaEntityDao) {
		this.testJtaEntityDao = testJtaEntityDao;
	}
	
	
}
