package asia.wavelet.bigledger.service.test.remote;

import asia.wavelet.bigledger.system.annotation.SpringRemotingService;

@SpringRemotingService
public interface IRemoteService {
	public String getRemoteTime();
}
