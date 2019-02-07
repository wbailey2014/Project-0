package com.revature.Launch;

import com.revature.views.P0MainMenu;
import com.revature.views.P0View;

public class P0Launcher {
	
public static void main(String[] args) {
		
		P0View view = new P0MainMenu();
		
		do {
			view.showMenu();
			view.getUserInput();
			view = view.process();
		} while(view != null);
		
	}
	

}
