package com.cumulus.repo.lab.repository;

import com.cumulus.repo.lab.domain.Property;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Spring Data JPA repository for the Property entity.
 */
public interface PropertyRepository extends JpaRepository<Property,Long> {

    @Query("select property from Property property left join fetch property.propertyattributes where property.id =:id")
    Property findOneWithEagerRelationships(@Param("id") Long id);

}
