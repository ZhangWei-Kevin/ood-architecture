package asia.wavelet.parkson.data.schedule;

import java.util.Calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("DataSyncService")

public class DataSyncService {
	private static final Logger logger = LoggerFactory.getLogger(DataSyncService.class);
	
	@Transactional
	public void doRun(){
		logger.info("DataSyncService running: " + Calendar.getInstance().getTimeInMillis());
		System.out.println("DataSyncService running: " + Calendar.getInstance().getTimeInMillis());
	}
	
}
