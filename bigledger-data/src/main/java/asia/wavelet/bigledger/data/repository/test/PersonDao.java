package asia.wavelet.bigledger.data.repository.test;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import asia.wavelet.bigledger.data.entity.test.Person;

public interface PersonDao extends CrudRepository<Person, String> {
	@Query("select p from Person p where p.guid = ?1")
	public Person findByXXId(String id);
	
	@Query("select p from Person p where p.name like %:name%")
	public List<Person> findByYY(@Param("name")String name);
	
}
