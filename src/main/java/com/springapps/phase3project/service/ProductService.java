package com.springapps.phase3project.service;

import java.util.List;


import com.springapps.phase3project.entity.Admin;
import com.springapps.phase3project.entity.Product;
import com.springapps.phase3project.entity.User;

public interface ProductService {
	


	String save(Product product);
	
	void update(Product product);
	
	void delete(Product product);
	

	Product get1(String category);
	
	//List<Product> get(String category);

	List<Product> getProducts();



	

}
