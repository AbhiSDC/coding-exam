//Author: Abhishek Nayyar
//Desc: Implementing a code for expense based on items

package com.hsbc.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import com.hsbc.exception.UserNotFoundException;
import com.hsbc.model.beans.Apparel;
import com.hsbc.model.beans.Electronics;
import com.hsbc.model.beans.FoodItems;
import com.hsbc.model.business.ApparelCategoryInterface;
import com.hsbc.model.business.CategoryService;
import com.hsbc.model.business.ElecCategoryInterface;
import com.hsbc.model.business.FoodCategoryInterface;
import com.hsbc.model.utility.Category;
import com.hsbc.model.utility.Type;
import com.hsbc.model.utility.UserFactory;

public class MainViewController {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		FoodCategoryInterface foodService = (FoodCategoryInterface) UserFactory.getInstance(Type.FOODSERVICE);
		ApparelCategoryInterface appService = (ApparelCategoryInterface) UserFactory.getInstance(Type.APPARELSERVICE);
		ElecCategoryInterface elecService = (ElecCategoryInterface) UserFactory.getInstance(Type.ELECSERVICE);
		int option = 0;
		do {
			System.out.println("*****************************************************************************************");
			System.out.println("Select an option: \n 1: Store Items 2: Fetch Data 3: Exit");
			System.out.println("*****************************************************************************************");
			option = scanner.nextInt();
			switch(option) {
			case 1: 
				Object obj = null;
				System.out.println("Select the category:");
				Category category = Category.valueOf(scanner.nextLine());
				switch(category) {
				case FOOD:
					FoodItems foodItem = new FoodItems();
					foodItem.setItemCode(scanner.nextInt());
					foodItem.setItemName(scanner.nextLine());
					foodItem.setUnitPrice(scanner.nextDouble());
					foodItem.setDateOfManufacture(LocalDate.parse(scanner.nextLine()));
					foodItem.setDateOfExpiry(LocalDate.parse(scanner.nextLine()));
					foodItem.setVeg(scanner.nextLine());
					foodItem.setQuantity(scanner.nextLong());
					
					foodService.store(foodItem);
					break;
				case APPAREL:
					Apparel apparel = new Apparel();
					apparel.setItemCode(scanner.nextInt());
					apparel.setItemName(scanner.nextLine());
					apparel.setUnitPrice(scanner.nextDouble());
					apparel.setSize(scanner.nextLine());
					apparel.setMaterial(scanner.nextLine());
					apparel.setQuantity(scanner.nextLong());
					
					appService.store(apparel);
					break;
				case ELECTRONICS:
					Electronics electronic = new Electronics();
					electronic.setItemCode(scanner.nextInt());
					electronic.setItemName(scanner.nextLine());
					electronic.setUnitPrice(scanner.nextDouble());
					electronic.setWarranty(scanner.nextInt());
					electronic.setQuantity(scanner.nextLong());
					
					elecService.store(electronic);
					break;
					
				}
				break;
				//fetch the reports of itms based on category
			case 2: 
				String report = scanner.nextLine();
				if(report.equals("Food")) {
					List<FoodItems> items = foodService.getItems();
				}
				else if(report.equals("Apparel")) {
					List<Apparel> items = appService.getItems();
				}
				else if(report.equals("Electronics")) {
					List<Electronics> items = elecService.getItems();
				}
			}
		} while(option != 6);
		
		scanner.close();
	}

}
