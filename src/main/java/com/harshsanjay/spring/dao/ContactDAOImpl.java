package com.harshsanjay.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.harshsanjay.spring.model.Contact;

@Repository
public class ContactDAOImpl implements ContactDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public long saveContact(Contact contact) {
		sessionFactory.getCurrentSession().save(contact);
		return contact.getContactId();
	}

	@Override
	public List<Contact> listContacts() {
		List<Contact> list = sessionFactory.getCurrentSession().createQuery("from Contact").list();
		return list;
	}

	@Override
	public Contact getContact(long id) {
		return sessionFactory.getCurrentSession().get(Contact.class, id);
	}

	@Override
	public void updateContact(long id, Contact contact) {
		
		Session session = sessionFactory.getCurrentSession();
		Contact oldContact = session.byId(Contact.class).load(id);
		oldContact.setContactName(contact.getContactName());
		oldContact.setContactType(contact.getContactType());
		oldContact.setPhoneNumber(contact.getPhoneNumber());
		oldContact.setBirthDate(contact.getBirthDate());
		
		session.flush();
		
	}

	@Override
	public void deleteContact(long id) {
		
		Session session = sessionFactory.getCurrentSession();
		Contact contact = session.byId(Contact.class).load(id);
		session.delete(contact);
		
	}

}
