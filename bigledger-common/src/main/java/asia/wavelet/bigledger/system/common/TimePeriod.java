package asia.wavelet.bigledger.system.common;

import java.text.MessageFormat;
import java.util.Calendar;


public class TimePeriod {

	private Calendar startTime;

	private Calendar endTime;

	public TimePeriod() {
		super();
		this.startTime = DateHelper.getCurrentDateTime();
		this.endTime = DateHelper.getMax();
	}

	public TimePeriod(Calendar startTime) {
		super();
		this.startTime = startTime;
		this.endTime = DateHelper.getMax();
	}

	public TimePeriod(Calendar startTime, Calendar endTime) {
		assert startTime != null : "startTime is null";
		assert endTime != null : "endTime is null";
		assert startTime.compareTo(endTime) <= 0 : MessageFormat.format(
				"startTime must be before than endTime, startTime:{0}; endTime:{1}",
				DateHelper.toDateTimeString(startTime),
				DateHelper.toDateTimeString(endTime));
		this.startTime = startTime;
		this.endTime = endTime;
	}
	
	public static TimePeriod createDefault(){
	    return new TimePeriod(DateHelper.getCurrentDateTime());
	}

	public Calendar getStartTime() {
		return startTime;
	}

	public void setStartTime(Calendar startTime) {
		this.startTime = startTime;
	}

	public Calendar getEndTime() {
		return endTime;
	}

	public void setEndTime(Calendar endTime) {
		this.endTime = endTime;
	}

	@Override
	public String toString() {
		return "Period [startTime="
				+ (startTime == null ? null : DateHelper.toDateTimeString(startTime))
				+ ", endTime=" 
				+ (endTime == null ? null : DateHelper.toDateTimeString(endTime)) + "]";
	}

}
