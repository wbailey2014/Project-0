package com.revature.views;

public interface P0View {
	
	/**
	 * Display a menu of options to the user
	 * Every view should have this option so that we can present them
	 * with the landing page for that particular View
	 */
	void showMenu();
	
	/**
	 * Hooks user choice into a functional service process
	 * @return
	 */
	P0View process();
	
	/**
	 * Standard method for getting user input regarding the
	 * menu shown in {@link #shownMenu()}
	 */
	void getUserInput();
	
	

}
