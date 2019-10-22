package com.harshsanjay.spring.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.harshsanjay.spring.model.Contact;

@Repository
public class ContactDAOImpl implements ContactDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public void saveContact(Contact contact) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Contact> listContacts() {
		List<Contact> list = sessionFactory.getCurrentSession().createQuery("from Contact").list();
		return list;
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
