/*
 *  Class: CMSC203 CRN 20931
 Program: Assignment #6
 Instructor: Professor Monshi
 Summary of Description: Simulates a beverage shop that sells a variety of types of drinks with many different options
 Due Date: 12/15/2024
 Integrity Pledge: I pledge that I have completed the programming assignment independently.
 I have not copied the code from a student or any source.
Student Name: Siraj Sayeed

 * 
 */
import java.util.*;

public class BevShopDriver {

	public static void main(String[] args) {

		BevShop shop = new BevShop();
		Scanner key = new Scanner(System.in);
		String cName = "";
		int cAge = 0;


		System.out.println("The current order in process can have at most " + BevShopInterface.MAX_ORDER_FOR_ALCOHOL + " alcoholic beverages.");
		System.out.println("The minimum age to order alcohol drink is " + BevShopInterface.MIN_AGE_FOR_ALCOHOL);
		System.out.println("Start please a new order: ");
		System.out.println("Your total order: " + 0.0);
		System.out.print("Would you please enter your name: ");
		cName = key.nextLine();
		System.out.print("Would you please enter your age: ");
		cAge = key.nextInt();

		if(shop.isValidAge(cAge))
			System.out.println("Your age is above 20 and you are eligible to order alcohol");

		shop.startNewOrder(15, Day.FRIDAY, cName, cAge);

		if(shop.isValidAge(cAge)) {

			// first drink, small
			System.out.println("Would you please add an alcohol drink");

			shop.processAlcoholOrder("mohito", Size.SMALL);

			System.out.println("The current order of drinks is " + shop.getNumOfDrink());

			System.out.println("The Total Price on the order is " + shop.totalOrderPrice(shop.getCurrentOrder().getOrderNumber()));

			if(shop.isEligibleForMore()) {
				System.out.println("Your current alcohol drink order is less than 4");
			}

			else
				System.out.println("You have a maximum alcohol drink for this order");

			// second drink, large
			System.out.println("Would you please add a second alcohol drink");

			shop.processAlcoholOrder("mohito", Size.LARGE);

			System.out.println("The current order of drinks is " + shop.getNumOfDrink());

			System.out.println("The Total Price on the order is " + shop.totalOrderPrice(shop.getCurrentOrder().getOrderNumber()));

			if(shop.isEligibleForMore()) {
				System.out.println("Your current alcohol drink order is less than 4");
			}

			else
				System.out.println("You have a maximum alcohol drink for this order");

			// third drink, medium
			System.out.println("Would you please add a second alcohol drink");

			shop.processAlcoholOrder("mohito", Size.MEDIUM);

			System.out.println("The current order of drinks is " + shop.getNumOfDrink());

			System.out.println("The Total Price on the order is " + shop.totalOrderPrice(shop.getCurrentOrder().getOrderNumber()));

			if(shop.isEligibleForMore()) {
				System.out.println("Your current alcohol drink order is less than 4");
			}

			else
				System.out.println("You have a maximum alcohol drink for this order");

		}

		// add coffee to order
		System.out.println("Would you please add a " + Type.COFFEE + " to your order");

		shop.processCoffeeOrder("coffee", Size.SMALL, true, false);

		System.out.println("Total items on your order is " + shop.getCurrentOrder().getTotalItems());
		System.out.println("The Total Price on the order is " + shop.totalOrderPrice(shop.getCurrentOrder().getOrderNumber()));


		System.out.println("#------------------------------------#");

		// new customer, new order
		System.out.println("Would you please start new order");

		key.nextLine();

		System.out.print("Would you please enter your name: ");
		cName = key.nextLine();
		System.out.print("Would you please enter your age: ");
		cAge = key.nextInt();

		shop.startNewOrder(22, Day.FRIDAY, cName, cAge);

		System.out.println("The Total Price on the order is " + shop.totalOrderPrice(shop.getCurrentOrder().getOrderNumber()));

		// second order, smoothie
		System.out.println("Would you please add " + Type.SMOOTHIE + " to order");

		shop.processSmoothieOrder("smoothie", Size.LARGE, 2, true);

		System.out.println("The Total Price on the order is " + shop.totalOrderPrice(shop.getCurrentOrder().getOrderNumber()));

		// second drink, coffee

		System.out.println("Would you please add a " + Type.COFFEE + " to your order");

		shop.processCoffeeOrder("coffee", Size.SMALL, false, false);

		System.out.println("The Total Price on the order is " + shop.totalOrderPrice(shop.getCurrentOrder().getOrderNumber()));

		// third drink, alcohol
		System.out.println("Would you please add a drink");

		if(!shop.isValidAge(shop.getCurrentOrder().getCustomer().getCustomerAge()));
		System.out.println("Your Age is not appropriate for alcohol drink!!");

		// end order
		System.out.println("Total items on your order is " + shop.getCurrentOrder().getTotalItems());
		System.out.println("The Total Price on the order is " + shop.totalOrderPrice(shop.getCurrentOrder().getOrderNumber()));

		System.out.println("Total price on the second order: " + shop.getOrderAtIndex(1).calcOrderTotal());
		System.out.println("Total amount for all Orders: " + shop.totalMonthlySale());




	}

}
