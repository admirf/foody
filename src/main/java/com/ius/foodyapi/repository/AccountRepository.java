package com.ius.foodyapi.repository;

import com.ius.foodyapi.model.Account;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "account", path = "accounts")
public interface AccountRepository extends PagingAndSortingRepository<Account, Long> { }