package asia.wavelet.bigledger.service.impl.test.remote;

import asia.wavelet.bigledger.service.common.BaseService;
import asia.wavelet.bigledger.service.test.remote.IRemoteService;
import asia.wavelet.bigledger.system.common.DateHelper;

public class RemoteServiceImpl extends BaseService implements IRemoteService {

	@Override
	public String getRemoteTime() {
		System.out.println("RemoteServiceImpl.getRemoteTime()  <<calling>>");
		return DateHelper.toDateTimeString(DateHelper.getCurrentDateTime());
	}

}
