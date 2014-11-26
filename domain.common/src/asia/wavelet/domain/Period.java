package asia.wavelet.domain;

import java.util.Calendar;

public class Period {

	private Calendar startTime;

	private Calendar endTime;

	public Period() {
	}

	public Period(Calendar startTime, Calendar endTime) {
		super();
		this.startTime = startTime;
		this.endTime = endTime;
	}

	@Override
	public Period clone() {
		return new Period((Calendar) getStart().clone(), (Calendar) getEnd()
				.clone());
	}

	public Calendar getStart() {
		return null;
	}

	public Calendar getEnd() {
		return null;
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

}
