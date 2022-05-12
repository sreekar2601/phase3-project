package com.springapps.phase3project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springapps.phase3project.dao.UserDao;
import com.springapps.phase3project.entity.User;
import com.springapps.phase3project.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return userDao.findUsers();
	}
	
	

}
