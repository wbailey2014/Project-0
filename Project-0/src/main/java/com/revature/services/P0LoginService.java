package com.revature.services;

import com.revature.daos.P0LoginDao;
//import com.revature.daos.P0PersonDao;
import com.revature.models.P0Person;
import com.revature.util.P0InputUtil;

public class P0LoginService {
	
	private static P0LoginDao loginDao = new P0LoginDao();
	
	public void getPerson() {
		
		P0Person person = new P0Person();
		
		System.out.print("Please enter the account's email address: ");
		person.setEmail(P0InputUtil.getStringInput(30));
		
		System.out.print("Please enter the account's password: ");
		person.setPassword(P0InputUtil.getStringInput(30));
		
		person = loginDao.getPerson(person);
		
	}
	

}
