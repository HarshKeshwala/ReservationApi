package com.harshsanjay.spring.model;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity(name = "Contact")
@Table(uniqueConstraints={@UniqueConstraint(columnNames={"contactName"})})
public class Contact {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long contactId;
	
	@Column(nullable = false)
	private String contactName;
	
	@Column(nullable = false)
	private String contactType;
	
	@Column(name = "phoneNumber")
	private Long phoneNumber;
	
	@Column(nullable = false)
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

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "Contact [contactId=" + contactId + ", contactName=" + contactName + ", contactType=" + contactType
				+ ", phoneNumber=" + phoneNumber + ", birthDate=" + birthDate + "]";
	}

	
}
