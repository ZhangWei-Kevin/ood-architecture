package asia.wavelet.bigledger.service.impl.test.jta;

import java.util.Calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import asia.wavelet.bigledger.data.entity.test.jtaA.TableA;
import asia.wavelet.bigledger.data.entity.test.jtaB.TableB;
import asia.wavelet.bigledger.data.repository.test.jtaA.Jta1Dao;
import asia.wavelet.bigledger.data.repository.test.jtaB.Jta2Dao;
import asia.wavelet.bigledger.service.test.jta.IJTAService;

@Service
@Transactional(propagation=Propagation.REQUIRED)
public class JTAService implements IJTAService {
	private static Logger logger = LoggerFactory.getLogger(JTAService.class);

	@Autowired
	private Jta1Dao jta1Dao;
	
	@Autowired
	private Jta2Dao jta2Dao;
	
//	@PersistenceContext(unitName = Constant.ENTITY_UNIT_SERVER)
//	private EntityManager serverEntityManager;
//	
//	@PersistenceContext(unitName = Constant.ENTITY_UNIT_QUEUE)
//	private EntityManager queueEntityManager;
	
	@Override
	public void add() {
		TableA a = new TableA(Calendar.getInstance().getTimeInMillis(), "a");
		
		TableB b = new TableB(Calendar.getInstance().getTimeInMillis(), "b");
		
//		serverEntityManager.find(TableA.class, new Long(1427525301735L));
		
//		serverEntityManager.persist(a);
//		queueEntityManager.persist(b);
//		
		jta1Dao.save(a);
		jta2Dao.save(b);
		
//		logger.info("entityManager = {}", entity  Manager.getEntityManagerFactory().getProperties());
//		Map<String, Object> prs =  entityManager.getEntityManagerFactory().getProperties();
//		for (String key : prs.keySet()) {
//			logger.info("key = {}, value = {}", key, prs.get(key));
//	        
//        }
		
		
	}

}
