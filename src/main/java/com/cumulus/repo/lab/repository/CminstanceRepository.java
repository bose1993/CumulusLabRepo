package com.cumulus.repo.lab.repository;

import com.cumulus.repo.lab.domain.Cminstance;
import org.springframework.data.jpa.repository.*;

import java.util.List;

/**
 * Spring Data JPA repository for the Cminstance entity.
 */
public interface CminstanceRepository extends JpaRepository<Cminstance,Long> {

    @Query("select cminstance from Cminstance cminstance where cminstance.user.login = ?#{principal.username}")
    List<Cminstance> findAllForCurrentUser();

}
