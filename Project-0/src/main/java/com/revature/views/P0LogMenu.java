package com.revature.views;

import com.revature.services.P0LoginService;
import com.revature.util.P0InputUtil;

public class P0LogMenu implements P0View {

	public int inputValue;
	private static P0LoginService loginService = new P0LoginService();
	
	@Override
	public void showMenu() {
		// TODO Auto-generated method stub
		System.out.println("You have decided to login.");
		System.out.println("Choose an option: ");
		System.out.println("1. Continue to login");
		System.out.println("2. Back");
	}

	@Override
	public P0View process() {
		// TODO Auto-generated method stub
		switch(this.inputValue) {
		case 1: loginService.getPerson(); break;
		case 2: return new P0MainMenu();
}
		return this; //Incase the application just ends, nothing else implemented
	}

	@Override
	public void getUserInput() {
		// TODO Auto-generated method stub
		inputValue = P0InputUtil.getIntChoice(2);
	}

}
