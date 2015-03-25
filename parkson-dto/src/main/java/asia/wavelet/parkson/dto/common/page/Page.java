package asia.wavelet.parkson.dto.common.page;

import java.util.List;

import asia.wavelet.parkson.dto.common.Dto;

public class Page<X extends Dto> {
	private List<X> results;
	
	
	

	public List<X> getResults() {
		return results;
	}

	public void setResults(List<X> results) {
		this.results = results;
	}

}
