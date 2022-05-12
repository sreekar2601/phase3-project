package com.springapps.phase3project.dao;

import java.util.List;

import com.springapps.phase3project.entity.User;

public interface UserDao {

	List<User> findUsers();

}
