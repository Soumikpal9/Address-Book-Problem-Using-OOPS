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
	
	public String updateContact(ContactDetailsBuilder contact) {
		int count = 0;
		for(ContactDetailsBuilder i : addBook) {
			if(i.firstName.equalsIgnoreCase(contact.firstName)) {
				addBook.remove(i);
				addBook.add(contact);
				count++;
			}
		}
		if(count == 0) {
			return "No contact to update";
		}
		else {
			return "Contact updated successfully";
		}
	}
}
