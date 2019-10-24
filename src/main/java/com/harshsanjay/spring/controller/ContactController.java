package com.harshsanjay.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.harshsanjay.spring.model.Contact;
import com.harshsanjay.spring.service.ContactService;

@CrossOrigin("*")
@RestController
public class ContactController {

	@Autowired
	private ContactService contactService;
	
	//get all contacts
	@GetMapping(path = "/contact", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<List<Contact>> getContacts() {

		List<Contact> list = contactService.listContacts();

		return ResponseEntity.ok().body(list);
		
	}
	
	//save the contact
	//@CrossOrigin(origins="http://localhost:4200")
	@PostMapping(path = "/contact", consumes = "application/json")
	@ResponseBody
	public ResponseEntity<?> saveContact(@RequestBody Contact contact) {
		
		long id = contactService.saveContact(contact);
		
		return ResponseEntity.ok().body("Contact created successfully! "+id);
	}
	
	//get single contact
	@GetMapping("/contact/{id}")
	public ResponseEntity<Contact> getContact(@PathVariable("id") long id) {
		
		Contact contact = contactService.getContact(id);
		
		return ResponseEntity.ok().body(contact);
		
	}
	
	//update contact details
	@PutMapping("/contact/{id}")
	public ResponseEntity<?> updateContact(@PathVariable("id")long id, @RequestBody Contact contact){
		
		contactService.updateContact(id, contact);
		
		return ResponseEntity.ok().body("Contact updated successfully!");
	}
	
	//delete contact details
	@DeleteMapping("/contact/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") long id) {
		contactService.deleteContact(id);
		return ResponseEntity.ok().body("Contact has been deleted successfully!");
	}
}
