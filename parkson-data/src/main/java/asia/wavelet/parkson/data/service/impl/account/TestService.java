package asia.wavelet.parkson.data.service.impl.account;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import asia.wavelet.parkson.data.entity.account.local.AppConfigCustomFieldEntity;
import asia.wavelet.parkson.data.repository.local.AppConfigCustomFieldEntityDao;
import asia.wavelet.parkson.data.service.account.ITestService;

@Service
@Transactional
public class TestService implements ITestService {

	@Autowired
	private AppConfigCustomFieldEntityDao customFieldEntityDao;
	
	@Override
	public void test() {
		AppConfigCustomFieldEntity cfe = new AppConfigCustomFieldEntity();
		cfe.setGuid(Calendar.getInstance().getTimeInMillis() + "");
		cfe.setName("abc");
		
		customFieldEntityDao.save(cfe);
	}

	public AppConfigCustomFieldEntityDao getCustomFieldEntityDao() {
		return customFieldEntityDao;
	}

	public void setCustomFieldEntityDao(
			AppConfigCustomFieldEntityDao customFieldEntityDao) {
		this.customFieldEntityDao = customFieldEntityDao;
	}
	
	

}
