package com.cumulus.repo.lab.repository;

import com.cumulus.repo.lab.domain.Propertyattribute;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Spring Data JPA repository for the Propertyattribute entity.
 */
public interface PropertyattributeRepository extends JpaRepository<Propertyattribute,Long> {
	public final static String FIND_BY_NAME_AND_ID_QUERY = "SELECT pa " + 
            "FROM Propertyattribute pa LEFT JOIN pa.propertys p " +
            "WHERE p.id=:pid AND pa.name=:paname";

	List<Propertyattribute> findByName(String name);
    @Query(FIND_BY_NAME_AND_ID_QUERY)
    public List<Propertyattribute> findByParamAtt(@Param("pid") Long pid,@Param("paname") String pname);

}
