package asia.wavelet.domain;

import asia.wavelet.common.Period;

public interface IDomainObject {
	 Long getId();
	 Integer getVersion();
	 Period getLifecycle();
	 String getName();
	 String getCode();
	 Integer getSerialNumber();
}