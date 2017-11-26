package com.rj.rrm.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rj.rrm.model.Restaurant;
import com.rj.rrm.model.Table;

@RestController
public class RestServiceController {
	
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/restaurant")
	public List<Restaurant> getRestaurants() {
		List<Table> tables = new ArrayList<>();
		tables.add(new Table(4,1));
		tables.add(new Table(4,2));
		tables.add(new Table(4,3));
		tables.add(new Table(4,4));
		List<Restaurant> restaurants = new ArrayList<>();
		restaurants.add(new Restaurant(counter.getAndIncrement(), "Restaurant 1", tables));
		restaurants.add(new Restaurant(counter.getAndIncrement(), "Restaurant 2", tables));
		restaurants.add(new Restaurant(counter.getAndIncrement(), "Restaurant 3", tables));
		return restaurants;
	}
	
	@RequestMapping("/restaurant/{id}")
	public Restaurant getRestaurant(@PathVariable(value="id") long id) {
		return new Restaurant(id, "Restaurant 1", null);
	}

}
