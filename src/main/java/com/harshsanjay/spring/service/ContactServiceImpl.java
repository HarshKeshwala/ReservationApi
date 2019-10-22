package com.harshsanjay.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harshsanjay.spring.model.Contact;
import com.harshsanjay.spring.dao.ContactDAO;

@Service
public class ContactServiceImpl implements ContactService{

	@Autowired
	private ContactDAO contactDAO;
	
	
	@Override
	public void saveContact(Contact contact) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public List<Contact> listContacts() {
		return contactDAO.listContacts();
	}

	@Override
	public Contact getContact(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateContact(long id, Contact contact) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteContact(long id) {
		// TODO Auto-generated method stub
		
	}

}
