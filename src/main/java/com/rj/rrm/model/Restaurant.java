package com.rj.rrm.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Restaurant {

	private long id;
	private String name;
	private List<Table> tables;
	
}
