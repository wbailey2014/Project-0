package com.revature.services;

import com.revature.daos.P0PersonDao;
import com.revature.models.P0Person;
import com.revature.util.P0InputUtil;

public class P0PersonService {

private static P0PersonDao personDao = new P0PersonDao();
	
	public void createPerson() {
		
		P0Person person = new P0Person();
		System.out.print("Please enter the person's first name for this account: ");
		person.setFirstName(P0InputUtil.getStringInput(30));
		
		System.out.print("Please enter the person's last name for this account: ");
		person.setLastName(P0InputUtil.getStringInput(30));
		
		System.out.print("Please enter the account's email address: ");
		person.setEmail(P0InputUtil.getStringInput(30));
		
		System.out.print("Please enter the account's password: ");
		person.setPassword(P0InputUtil.getStringInput(30));
		
		person = personDao.insertPerson(person);
		System.out.println(person);
	}
	
	
}
