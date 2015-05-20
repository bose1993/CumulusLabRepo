package com.cumulus.repo.lab.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cumulus.repo.lab.domain.Ca;

/**
 * Spring Data JPA repository for the Ca entity.
 */
public interface CaRepository extends JpaRepository<Ca,Long> {
	Ca findOneByName(String name);
	
	@Query("select ca from Ca ca where ca.user.id= ?1 ")
	List<Ca> findCaByUser(Long id);

}
