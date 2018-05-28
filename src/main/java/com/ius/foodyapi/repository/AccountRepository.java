package com.ius.foodyapi.repository;

import com.ius.foodyapi.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * This is the Account Repository which gets provided a default implementation
 * automatically by Spring.
 * Because our repository extends the JpaRepository it automatically
 * defines necessary rest operations and maps them to default routes
 * based on the path you provide in the annotation
 * We additionally defined the findByUsername method which is used
 * by the authentication process
 */
@RepositoryRestResource(collectionResourceRel = "account", path = "accounts")
public interface AccountRepository  extends JpaRepository<Account, Long> {
    public Account findByUsername(String username);
}
