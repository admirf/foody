package com.ius.foodyapi.repository;

import com.ius.foodyapi.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "item", path = "items")
public interface ItemRepository extends JpaRepository<Item, Long> { }
