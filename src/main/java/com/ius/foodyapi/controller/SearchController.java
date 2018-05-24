package com.ius.foodyapi.controller;

import com.ius.foodyapi.model.Item;
import com.ius.foodyapi.repository.ItemRepository;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.Point;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;

@RestController
public class SearchController {
    public ItemRepository repository;

    public SearchController(ItemRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/search")
    public ResponseEntity<List<Item>> searchItems(HttpServletRequest request) {
        System.out.println(request.getQueryString());
        String name = request.getParameter("name");
        String[] priceRange = request.getParameter("price").split(",");
        Double minPrice = Double.parseDouble(priceRange[0]);
        Double maxPrice = Double.parseDouble(priceRange[1]);
        String proximity = request.getParameter("proximity");
        String[] categories = request.getParameter("categories").split(",");

        GeometryFactory gf = new GeometryFactory();

        List<Item> items = repository.findByPriceBetweenAndCategoryIn(
                minPrice,
                maxPrice,
                Arrays.asList(categories)
        );

        return  new ResponseEntity<>(items, HttpStatus.OK);
    }
}
