package com.cg;
import java.util.*;

public class AddressBookBuilder {
	private List<ContactDetailsBuilder> addBook = new ArrayList<>();
	
	public void setAddressBookBuilder(List<ContactDetailsBuilder> contact) {
		this.addBook = contact;
	}
	
	public List<ContactDetailsBuilder> getAddressBookBuilder() {
		return this.addBook;
	}
	
	public void addContact(ContactDetailsBuilder contactObj) {
		addBook.add(contactObj);
	}
	
	public List<ContactDetailsBuilder> showContact() {
		return addBook;
	}
}
