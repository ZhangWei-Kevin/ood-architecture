package asia.wavelet.parkson.data.schedule;

import java.util.Calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service("DataSyncService")
public class DataSyncService {
	private static final Logger logger = LoggerFactory.getLogger(DataSyncService.class);
	
	public void doRun(){
		logger.info("DataSyncService running: " + Calendar.getInstance().getTimeInMillis());
		System.out.println("DataSyncService running: " + Calendar.getInstance().getTimeInMillis());
	}
	
}
