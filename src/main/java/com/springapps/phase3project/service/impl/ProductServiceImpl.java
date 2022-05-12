package com.springapps.phase3project.service.impl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springapps.phase3project.dao.ProductDao;
import com.springapps.phase3project.entity.Admin;
import com.springapps.phase3project.entity.Product;
import com.springapps.phase3project.entity.User;
import com.springapps.phase3project.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao productDao;

	Session session;
	
	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return productDao.findproducts();
	}



	@Override
	@Transactional
	public String save(Product product) {
		return productDao.create(product);
	}



	@Override
	@Transactional
	public void update(Product product) {
		productDao.update(product);
		
		
	}



	@Override
	@Transactional
	public void delete(Product product) {
		productDao.delete(product);
		
		
	}



	/*@Override
	public List<Product> get(String category) {
		return productDao.find(category);
	}
	*/



	@Override
	public Product get1(String category) {
		// TODO Auto-generated method stub
		return productDao.find(category);
	}


	
	
}
