package asia.wavelet.parkson.dto.test;

import java.util.Calendar;

import asia.wavelet.bigledger.system.common.DateHelper;
import asia.wavelet.parkson.dto.common.Dto;

public class PersonInfo extends Dto {
    
    private static final long serialVersionUID = 5340536344077793894L;
    
	private String code;
    private String name;
    private String countryArea;
    private Calendar startLifecycle;
    
    
    
	public PersonInfo() {
	    super();
    }
	public PersonInfo(String code, String name, Calendar startLifecycle, String countryArea) {
	    super();
	    this.code = code;
	    this.name = name;
	    this.startLifecycle = startLifecycle;
	    this.countryArea = countryArea;
    }
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountryArea() {
		return countryArea;
	}
	public void setCountryArea(String countryArea) {
		this.countryArea = countryArea;
	}
	public Calendar getStartLifecycle() {
		return startLifecycle;
	}
	public void setStartLifecycle(Calendar startLifecycle) {
		this.startLifecycle = startLifecycle;
	}
	@Override
    public String toString() {
	    return "PersonInfo [code=" + code + ", name=" + name + ", countryArea=" + countryArea + ", startLifecycle="
	            + DateHelper.toDateTimeString(startLifecycle) + "]";
    }
	
	
}
