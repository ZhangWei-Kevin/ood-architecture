package asia.wavelet.bigledger.system.common;

import java.util.Calendar;


public class StringUitls {

	public static String getHello(){
		return "hello_123:" + Calendar.getInstance().getTimeInMillis();
	}

}
