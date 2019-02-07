package com.revature.views;

import com.revature.util.P0InputUtil;

public class P0MainMenu implements P0View{
	
	public int inputValue; //was private when I had it made automatically

	public void showMenu() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Bank App!");
		System.out.println("1. Register");
		System.out.println("2. Login");
		System.out.println("3. Quit");
		
	}

	public P0View process() {
		// TODO Auto-generated method stub
		switch (inputValue) {
		case 1:
			return new P0PeopleMenu();
		case 2:
			return new P0LoggedInMenu(); //P0LogMenu(); 
		case 3:
			System.out.println("Goodbye. Thank you for choosing the Bank App.");
			return null;
		}
		return null;
	}

	public void getUserInput() {
		// TODO Auto-generated method stub
		this.inputValue = P0InputUtil.getIntChoice(3);
	}

}
