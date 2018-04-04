package com.ius.foodyapi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

public interface AccountRepository {
    @RepositoryRestResource(collectionResourceRel = "account", path = "accounts")
    public interface Account extends PagingAndSortingRepository<Account, Long> { }
}
