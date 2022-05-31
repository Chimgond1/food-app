package com.ty.food.controller;

import java.util.ArrayList;

import java.util.List;

import com.ty.food.dto.Foodorder;
import com.ty.food.dto.Item;
import com.ty.food.services.FoodorderServices;

public class TestSaveFoodorderController {

	public static void main(String[] args) {

		FoodorderServices foodorderServices = new FoodorderServices();

		Foodorder foodorder = new Foodorder();
		foodorder.setName("Peter");
		foodorder.setPhone(1241112);

		Item item1 = new Item();
		item1.setName("Chicken Burger");
		item1.setItemId(100);
		item1.setQuantity(2);
		item1.setFoodorder(foodorder);

		Item item2 = new Item();
		item2.setName("coke");
		item2.setItemId(102);
		item2.setQuantity(2);
		item2.setFoodorder(foodorder);

		/*
		 * Item item3 = new Item(); item3.setName("Coke"); item3.setQuantity(2);
		 * item3.setCost(200); item3.setFoodorder(foodorder);
		 */

		List<Item> items = new ArrayList<Item>();
		items.add(item1);
		items.add(item2);
		// items.add(item3);
		foodorder.setItem(items);

		foodorderServices.saveOrder(foodorder);

	}

}
