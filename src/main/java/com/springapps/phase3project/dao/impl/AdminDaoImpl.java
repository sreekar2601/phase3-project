package com.springapps.phase3project.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.springapps.phase3project.dao.AdminDao;
import com.springapps.phase3project.entity.Admin;

@Repository
public class AdminDaoImpl implements AdminDao {
	@Autowired
	private HibernateTemplate hibernatetemplate;

	@Override
	public void change(Admin admin) {
		hibernatetemplate.update(admin);
	}

}
