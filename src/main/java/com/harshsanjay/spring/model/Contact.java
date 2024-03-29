package com.harshsanjay.spring.model;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@NamedNativeQueries({ 
	  @NamedNativeQuery(
	    name = "GetContactDetails", 
	    query = "CALL GetContactDetails(:contactName)", 
	    resultClass = Contact.class) 
})
@Entity(name = "Contact")
public class Contact {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long contactId;
	
	@Column(nullable = false)
	private String contactName;
	
	@Column(nullable = false)
	private String contactType;
	
	@Column(name = "phoneNumber")
	private String phoneNumber;
	
	@Column(nullable = false)
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date birthDate;

	public long getContactId() {
		return contactId;
	}

	public void setContactId(long contactId) {
		this.contactId = contactId;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactType() {
		return contactType;
	}

	public void setContactType(String contactType) {
		this.contactType = contactType;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	@JsonDeserialize
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "Contact [contactId=" + contactId + ", contactName=" + contactName + ", contactType=" + contactType
				+ ", phoneNumber=" + phoneNumber + ", birthDate=" + birthDate + "]";
	}

	
}
