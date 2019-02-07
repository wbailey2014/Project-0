package com.revature.views;

import com.revature.services.P0PersonService;
import com.revature.util.P0InputUtil;

public class P0PeopleMenu implements P0View{

	public int inputValue;
	private static P0PersonService personService = new P0PersonService();

	public void showMenu() {
		// TODO Auto-generated method stub
		System.out.println("You have decided to register a new account.");
		System.out.println("If you finish making an acoount, you will");
		System.out.println("be brought back to this menu if you wish");
		System.out.println("to create another account.");
		System.out.println("Choose an option: ");
		System.out.println("1. Continue to create an account");
		System.out.println("2. Back");
	}

	public P0View process() {
		// TODO Auto-generated method stub
		switch(this.inputValue) {
		case 1: personService.createPerson(); break;
		case 2: return new P0MainMenu();
}
		return this; //Incase the application just ends, nothing else implemented
	}

	public void getUserInput() {
		// TODO Auto-generated method stub
		inputValue = P0InputUtil.getIntChoice(2);
	}
	
	
}
