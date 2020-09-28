package com.cg;
import java.util.*;

//UC2
public class Builder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AddressBookBuilder addressBook = new AddressBookBuilder();
		
		System.out.println("Welome to Address Book!!!");
		System.out.println("Enter first name: ");
		String firstName = sc.nextLine();
		System.out.println("Enter last name: ");
		String lastName = sc.nextLine();
		System.out.println("Enter address: ");
		String address = sc.nextLine();
		System.out.println("Enter city: ");
		String city = sc.nextLine();
		System.out.println("Enter state: ");
		String state = sc.nextLine();
		System.out.println("Enter zip: ");
		String zipcode = sc.nextLine();
		System.out.println("Enter phone number: ");
		sc.nextLine();
		String phone = sc.nextLine();
		System.out.println("Enter email: ");
		String email = sc.nextLine();
		
		ContactDetailsBuilder contact = new ContactDetailsBuilder(firstName, lastName, address, city, state, zipcode, phone, email);
		addressBook.addContact(contact);
		
		List<ContactDetailsBuilder> contDet = new ArrayList<ContactDetailsBuilder>();
		contDet = addressBook.showContact();
		for(ContactDetailsBuilder i : contDet) {
			System.out.println(i);
		}
	}
}
