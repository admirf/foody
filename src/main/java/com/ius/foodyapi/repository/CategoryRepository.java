package com.ius.foodyapi.repository;

import com.ius.foodyapi.model.Category;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "category", path = "categories")
public interface CategoryRepository extends PagingAndSortingRepository<Category, Long> { }
