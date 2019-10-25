package com.harshsanjay.spring.service;

import java.util.List;

import com.harshsanjay.spring.model.Contact;

public interface ContactService {
	
		//method to insert a contact
		long saveContact(Contact contact);
		
		//method to get all contacts
		List<Contact> listContacts();
		
		//method to get single contact
		Contact getContact(long id);
		
		//method to update contact
		void updateContact(long id, Contact contact);
		
		//method to delete contact
		void deleteContact(long id);
		
		//method to call stored procedure
		Contact getContactDetail(String name);

}
