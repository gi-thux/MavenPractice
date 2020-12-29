package com.vastika.uis.dao;

import java.util.List;

import com.vastika.uis.model.User;

public interface UserDao {

	int saveUserInfo(User user);

	int updateUserInfo(User updatedUser);

	int deletUserInfo(int id);

	List<User> getAllUserInfo();

	User getUserById(int id);

}
