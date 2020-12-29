package com.vastika.uis.service;

import java.util.List;

import com.vastika.uis.model.User;

public interface UserService {
	int saveUserInfo(User user);
  int updateUserInfo(User updatedUser);
  int deletUserInfo(int id);
  List<User> getAllUserInfo();
  
	User getUserById(int id);
}
