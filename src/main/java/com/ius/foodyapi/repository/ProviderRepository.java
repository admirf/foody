package com.ius.foodyapi.repository;

import com.ius.foodyapi.model.Provider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "provider", path = "providers")
public interface ProviderRepository extends JpaRepository<Provider, Long> { }
