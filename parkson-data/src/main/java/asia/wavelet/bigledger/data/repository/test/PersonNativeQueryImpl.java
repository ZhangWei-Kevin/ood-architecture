package asia.wavelet.bigledger.data.repository.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Repository;

import asia.wavelet.parkson.dto.test.PersonInfo;

@Repository
public class PersonNativeQueryImpl implements PersonNativeQuery {
	private static final Logger logger = LoggerFactory.getLogger(PersonNativeQueryImpl.class);

	@PersistenceContext
	private EntityManager em;

	@Override
	public List<PersonInfo> findBy(PageRequest pageRequest) {
		String sql = 
				"SELECT p.code person_code , p.name person_name, p.start_lifecycle, c.code country_code , c.name country_name, c.area\n" +
						"FROM   persons p\n" + 
						"JOIN   countries c\n" + 
						"ON     p.country_id = c.guid\n" +
						"ORDER BY p.name \n";
						/*+ 
						"WHERE  c.area LIKE 'a%' ";*/

		Query query =  em.createNativeQuery(sql);
		query.setFirstResult((pageRequest.getPageNumber() - 1) * pageRequest.getPageSize());
		query.setMaxResults(pageRequest.getPageSize());
		
//		logger.info("query result size = {}", query.getMaxResults());
		
		
		Page<Object[]> page = new PageImpl<Object[]>(query.getResultList(),new PageRequest(0,1), 0);  
//		
		logger.info("query result size = {}", query.getResultList().size());
		return null;
	}

}
