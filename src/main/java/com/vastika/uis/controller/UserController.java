package com.vastika.uis.controller;



import java.util.List;

import javax.swing.JOptionPane;

import com.vastika.uis.model.User;
import com.vastika.uis.service.UserService;
import com.vastika.uis.service.UserServiceImp;

public class UserController {

	public static void main(String[] args) {
		
		
		UserService userService = new UserServiceImp();
		String decision="";
		do {
		String choice=JOptionPane.showInputDialog("Enter choice: save|update|delete|list|get");
		
		switch (choice) {
		case "save":
			User user = getUser();
			
			

			int saved = userService.saveUserInfo(user);
			if (saved >= 1) {
				JOptionPane.showMessageDialog(null, "user info is updated sucessfully in db");
			} else {
				JOptionPane.showMessageDialog(null, "Error in db.");
			}
			
			break;
			
		case "update":
			User updatedUser = getUser();
			
			int id=Integer.parseInt(JOptionPane.showInputDialog("Enter id:"));
           updatedUser.setId(id);
			int updated = userService.updateUserInfo(updatedUser);
			if (updated >= 1) {
				JOptionPane.showMessageDialog(null, "user info is saved sucessfully in db");
			} else {
				JOptionPane.showMessageDialog(null, "Error in db.");
			}
			
			break;
			
		case "delete":
			//User deletUserInfo=getUser();
			id=Integer.parseInt(JOptionPane.showInputDialog("Enter id:"));
			//deletUserInfo.setId(idNo);
			int deleted=userService.deletUserInfo(id);
			if(deleted>=1) {
				JOptionPane.showMessageDialog(null,"user info is deleted from the database");
			}else {
				JOptionPane.showMessageDialog(null,"Erron in database");
			}
			break;
		case"list":
			List<User> userList=userService.getAllUserInfo();		
			for(User  u: userList) {
				System.out.println("user id is: "+u.getId());
				System.out.println("user name is: "+u.getUsername());
				System.out.println("password is: "+u.getPassword());
				System.out.println("user mobile no is: "+u.getmobileNo());
				System.out.println("user salary is: "+u.getSalary());
				System.out.println(" is user active? "+u.getisActive());
				System.out.println("=====================");
			}
			break;
		case"get":
			id=Integer.parseInt(JOptionPane.showInputDialog("Enter id:"));
			User  u=userService.getUserById(id);		
			
				System.out.println("user id is: "+u.getId());
				System.out.println("user name is: "+u.getUsername());
				System.out.println("password is: "+u.getPassword());
				System.out.println("user mobile no is: "+u.getmobileNo());
				System.out.println("user salary is: "+u.getSalary());
				System.out.println(" is user active? "+u.getisActive());
				System.out.println("=====================");
			
			break;
		default:
					JOptionPane.showMessageDialog(null, "wrong choice");
			
		break;
		}
		decision=JOptionPane.showInputDialog("do you want to perform next operation? Enter yes|no");
		}while(decision.equalsIgnoreCase("yes"));
		JOptionPane.showMessageDialog(null,"bye bye !!! happy coding ....... see you.");
		}

	public static User getUser() {
		User user = new User();
		String username = JOptionPane.showInputDialog("Enter username: ");
		String password = JOptionPane.showInputDialog("Enter password: ");
		long mobileNo = Long.parseLong(JOptionPane.showInputDialog("Enter mobile number: "));
		double salary = Double.parseDouble(JOptionPane.showInputDialog("Enter salary: "));
		boolean isActive = Boolean.parseBoolean(JOptionPane.showInputDialog("Enter is user active: "));
		user.setUsername(username);
		user.setPassword(password);
		user.setmobileNo(mobileNo);
		user.setisActive(isActive);
		user.setSalary(salary);
		return user;

	}
}
