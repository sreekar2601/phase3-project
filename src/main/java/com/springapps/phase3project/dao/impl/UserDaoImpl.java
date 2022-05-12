package com.springapps.phase3project.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.springapps.phase3project.dao.UserDao;
import com.springapps.phase3project.entity.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private HibernateTemplate hibernatetemplate;

	@Override
	public List<User> findUsers() {
		return hibernatetemplate.loadAll(User.class);
		
	}
}
