package com.ty.food.controller;

import com.ty.food.dto.User;
import com.ty.food.services.UserServices;

public class TestSaveUser {

	public static void main(String[] args) {
		UserServices userServices = new UserServices();
		User user = new User();
		user.setName("Peter");
		user.setEmail("peter@mail.com");
		user.setPassword("12100");
		user.setPhone(11119999);

		User user2 = userServices.saveUser(user);
		if (user2 != null) {
			System.out.println("Inserted");
		} else {
			System.out.println("Not Inserted");
		}

	}

}
