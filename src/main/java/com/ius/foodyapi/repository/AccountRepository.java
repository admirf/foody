package com.ius.foodyapi.repository;

import com.ius.foodyapi.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "account", path = "accounts")
public interface AccountRepository  extends JpaRepository<Account, Long> {
    public Account findByUsername(String username);
}
