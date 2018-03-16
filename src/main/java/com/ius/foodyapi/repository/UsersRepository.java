package com.ius.foodyapi.repository;

import com.ius.foodyapi.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UsersRepository extends PagingAndSortingRepository<User, Long> { }
