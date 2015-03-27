package asia.wavelet.bigledger.data.service.impl.test.jta;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import asia.wavelet.bigledger.data.entity.test.jtaA.TableA;
import asia.wavelet.bigledger.data.entity.test.jtaB.TableB;
import asia.wavelet.bigledger.data.repository.test.jtaA.Jta1Dao;
import asia.wavelet.bigledger.data.repository.test.jtaB.Jta2Dao;
import asia.wavelet.bigledger.data.service.test.jta.IJTAService;

@Service
@Transactional(propagation=Propagation.REQUIRED)
public class JTAService implements IJTAService {

	@Autowired
	private Jta1Dao jta1Dao;
	
	@Autowired
	private Jta2Dao jta2Dao;
	
	@Override
	public void add() {
		TableA a = new TableA(Calendar.getInstance().getTimeInMillis(), "a");
		
		TableB b = new TableB(Calendar.getInstance().getTimeInMillis(), "b");
		
		jta1Dao.save(a);
		jta2Dao.save(b);
		
	}

}
