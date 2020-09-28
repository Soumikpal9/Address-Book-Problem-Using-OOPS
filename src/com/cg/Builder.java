package com.cg;
import java.util.*;

//UC6
public class Builder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<AddressBookBuilder> book = new ArrayList<AddressBookBuilder>();
		AddressBookBuilder addressBook = new AddressBookBuilder();
		int a=5;
		int check = 9;
		System.out.println("Welcome to Address Book");
		do {
			System.out.println("Press 8 to add Address Book");
			System.out.println("Press 9 to exit");
			check = sc.nextInt();
			if(check == 8) {
				book.add(addressBook);
				do {
					
					System.out.println("Menu \nPress 1 to Add a contact \nPress 2 to Edit a Contact \nPress 3 to Remove a contact \nPress 4 to View all contact \nPress 5 to Exit");
					a=sc.nextInt();
					switch(a) {
					case 1:
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
						String phone = sc.nextLine();
						System.out.println("Enter email: ");
						String email = sc.nextLine();
						ContactDetailsBuilder contact = new ContactDetailsBuilder(firstName, lastName, address, city, state, zipcode, phone, email);
						addressBook.addContact(contact);
						break;
						
					case 2:
						System.out.println("Update Contact:\nEnter name and all details:");
						System.out.println("Enter first name: ");
						String firstName1 = sc.nextLine();
						System.out.println("Enter last name: ");
						String lastName1 = sc.nextLine();
						System.out.println("Enter address: ");
						String address1 = sc.nextLine();
						System.out.println("Enter city: ");
						String city1 = sc.nextLine();
						System.out.println("Enter state: ");
						String state1 = sc.nextLine();
						System.out.println("Enter zip: ");
						String zipcode1 = sc.nextLine();
						System.out.println("Enter phone number: ");
						String phone1 = sc.nextLine();
						System.out.println("Enter email: ");
						String email1 = sc.nextLine();
						
						ContactDetailsBuilder update = new ContactDetailsBuilder(firstName1, lastName1, address1, city1, state1, zipcode1, phone1, email1);
						String s = addressBook.updateContact(update);
						System.out.println(s);
						break;
					case 3:
						System.out.println("Enter first name of contact to remove: ");
						String fname= sc.nextLine();
						boolean b = addressBook.removeContact(fname);
						if(b)
							System.out.println("Contact removed");
						else
							System.out.println("Contact not found");
						break;
						
					case 4:
						List<ContactDetailsBuilder> contact1 = new ArrayList<ContactDetailsBuilder>();
						contact1=addressBook.showContact();
						for(ContactDetailsBuilder i : contact1) {
							System.out.println(i);
						}
						break;
					
					case 5: break;
						
					}
				
				}while(a!=5);
			}
			book.add(addressBook);
			
		}while(check != 9);
	}
}
