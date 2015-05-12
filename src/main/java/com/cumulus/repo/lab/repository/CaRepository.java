package com.cumulus.repo.lab.repository;

import com.cumulus.repo.lab.domain.Ca;
import org.springframework.data.jpa.repository.*;

import java.util.List;

/**
 * Spring Data JPA repository for the Ca entity.
 */
public interface CaRepository extends JpaRepository<Ca,Long> {
	Ca findOneByName(String name);

}
