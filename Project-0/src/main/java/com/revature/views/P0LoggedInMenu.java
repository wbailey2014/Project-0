package com.revature.views;

import com.revature.util.P0InputUtil;

public class P0LoggedInMenu implements P0View {
	
	public int inputValue;

	@Override
	public void showMenu() {
		// TODO Auto-generated method stub
		System.out.println("Your login was a success!");
		System.out.println("Choose an option: ");
		System.out.println("1. Deposit into Checking Account");
		System.out.println("2. Deposit into Savings Account");
		System.out.println("3. Withdraw from Checking Account");
		System.out.println("4. Withdraw from Savings Account");
		System.out.println("5. Back");
	}

	@Override
	public P0View process() {
		// TODO Auto-generated method stub
		switch(this.inputValue) {
		case 1: //personService.createPerson(); break;
		case 2: //return new P0MainMenu();
		case 3:
		case 4:
		case 5: return new P0MainMenu();
}
		return this;
		//return null;
	}

	@Override
	public void getUserInput() {
		// TODO Auto-generated method stub
		inputValue = P0InputUtil.getIntChoice(5);
	}

}
