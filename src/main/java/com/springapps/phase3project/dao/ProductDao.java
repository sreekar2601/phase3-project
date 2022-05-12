package com.springapps.phase3project.dao;

import java.util.List;

import com.springapps.phase3project.entity.Admin;
import com.springapps.phase3project.entity.Product;

public interface ProductDao {

	String create(Product product);
	
	void update(Product product);

	void delete(Product product);
	
	Product find(String category);
	
	//Product find(int id);

	List<Product> findproducts();

	
}
