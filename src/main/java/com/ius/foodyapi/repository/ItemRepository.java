package com.ius.foodyapi.repository;

import com.ius.foodyapi.model.Item;
import com.vividsolutions.jts.geom.Point;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "item", path = "items")
public interface ItemRepository extends JpaRepository<Item, Long> {
    public List<Item> findByPriceBetweenAndCategoryIn(Double minPrice, double maxPrice, List<String> categories);
}
