package com.springapps.phase3project.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springapps.phase3project.dao.AdminDao;
import com.springapps.phase3project.dao.ProductDao;
import com.springapps.phase3project.entity.Admin;
import com.springapps.phase3project.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private AdminDao adminDao;

	@Override
	@Transactional
	public void change(Admin admin) {
		adminDao.change(admin);
	}

}
