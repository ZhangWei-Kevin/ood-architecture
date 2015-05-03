package asia.wavelet.bigledger.service.impl.test.remote;

import org.springframework.stereotype.Service;

import asia.wavelet.bigledger.service.test.remote.IRemoteService;
import asia.wavelet.bigledger.system.common.DateHelper;

@Service
public class RemoteServiceImpl implements IRemoteService {

	@Override
	public String getRemoteTime() {
		return DateHelper.toDateTimeString(DateHelper.getCurrentDateTime());
	}

}
