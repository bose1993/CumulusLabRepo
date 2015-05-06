package com.cumulus.repo.lab.repository;

import com.cumulus.repo.lab.domain.Cminstance;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.*;
import org.springframework.http.HttpHeaders;

import java.util.List;

/**
 * Spring Data JPA repository for the Cminstance entity.
 */
public interface CminstanceRepository extends JpaRepository<Cminstance,Long> {

    @Query("select cminstance from Cminstance cminstance where cminstance.user.login = ?#{principal.username}")
    List<Cminstance> findAllForCurrentUser();
    
    @Modifying
	@Query("update Cminstance t set t.master = false where t.modelid = ?1")
	int resetAllMaster(String modelId);

	List<Cminstance> findByModelid(String modelid, Sort s);
	
	Cminstance findOneByModelidAndMaster(String modelid,boolean master);

	

}
