package com.ius.foodyapi.repository;

import com.ius.foodyapi.model.Business;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "business", path = "businesses")
public interface BusinessRepository extends PagingAndSortingRepository<Business, Long> {
}
