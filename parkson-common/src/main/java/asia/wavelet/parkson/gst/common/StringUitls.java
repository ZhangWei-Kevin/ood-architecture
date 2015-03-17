package asia.wavelet.parkson.gst.common;

import java.util.Calendar;


public class StringUitls {

	public static String getHello(){
		return "hello_:" + Calendar.getInstance().getTimeInMillis();
	}

}
