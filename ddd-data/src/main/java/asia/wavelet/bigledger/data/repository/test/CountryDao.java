package asia.wavelet.bigledger.data.repository.test;

import org.springframework.data.repository.CrudRepository;

import asia.wavelet.bigledger.data.entity.test.Country;


public interface CountryDao extends CrudRepository<Country, String> {
	
}
