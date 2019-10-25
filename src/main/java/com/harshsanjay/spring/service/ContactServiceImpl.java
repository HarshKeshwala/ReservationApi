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
	@Transactional
	public long saveContact(Contact contact) {
		return contactDAO.saveContact(contact);
	}

	@Override
	@Transactional
	public List<Contact> listContacts() {
		return contactDAO.listContacts();
	}

	@Override
	@Transactional
	public Contact getContact(long id) {
		return contactDAO.getContact(id);
	}

	@Override
	@Transactional
	public void updateContact(long id, Contact contact) {
		contactDAO.updateContact(id, contact);
	}

	@Override
	@Transactional
	public void deleteContact(long id) {
		contactDAO.deleteContact(id);
	}

	@Override
	@Transactional
	public Contact getContactDetail(String name) {
		return contactDAO.getContactDetail(name);
	}

}
