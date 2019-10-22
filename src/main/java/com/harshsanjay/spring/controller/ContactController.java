package com.harshsanjay.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.harshsanjay.spring.model.Contact;
import com.harshsanjay.spring.service.ContactService;

@RestController
public class ContactController {

	@Autowired
	private ContactService contactService;
	
	//get all contacts
	@GetMapping("/contact")
	public ResponseEntity<List<Contact>> getContacts() {
	
		List<Contact> list = contactService.listContacts();
		
		return ResponseEntity.ok().body(list);
		
	}
}
