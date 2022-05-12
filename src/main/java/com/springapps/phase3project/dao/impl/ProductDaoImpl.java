package com.springapps.phase3project.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.springapps.phase3project.dao.ProductDao;
import com.springapps.phase3project.entity.Admin;
import com.springapps.phase3project.entity.Product;


@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private HibernateTemplate hibernatetemplate;


	

	@Override
	public List<Product> findproducts() {
		// TODO Auto-generated method stub
		return hibernatetemplate.loadAll(Product.class);
	}




	@Override
	public String create(Product product) {
		
		return (String) hibernatetemplate.save(product);
	}




	@Override
	public void update(Product product) {
		hibernatetemplate.update(product);
	}




	@Override
	public void delete(Product product) {
		hibernatetemplate.delete(product);
		
	}




	@Override
	public Product find(String category) {
		// TODO Auto-generated method stub
		return (Product) hibernatetemplate.find(category, null);
	}




/*	@Override
	public List<Product> find(String category) {
		
		return (List<Product>) hibernatetemplate.get(Product.class, category);


	}*/
	
}

