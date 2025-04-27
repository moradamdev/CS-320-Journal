package Module3Milestone;
import java.util.ArrayList;

public class ContactService {
	ArrayList<Contact> contacts = new ArrayList<Contact>();
	
	
	public void addContact(String id, String firstName, String lastName, String phoneNumber, String address) {
		
		Contact contact = new Contact(id, firstName, lastName, phoneNumber, address);
		contacts.add(contact);

	}
	
	public void deleteContact(String id) {
		for(int i = 0; i < contacts.size(); i ++) {
			if(contacts.get(i).getId().equals(id)) {
				contacts.remove(i);
			}
		}
	}
	
	public void updateFirstName(String newName, String id) {
		if(newName.length() <= 10) {
			for(int i = 0; i < contacts.size(); i ++) {
				if(contacts.get(i).getId().equals(id)) {
					contacts.get(i).setFirstName(newName);
				}
			}
		}else {
			System.out.println("Invalid Name");
		}
	}
	
	public void updateLastName(String newName, String id) {
		if(newName.length() <= 10) {
			for(int i = 0; i < contacts.size(); i ++) {
				if(contacts.get(i).getId().equals(id)) {
					contacts.get(i).setLastName(newName);
				}
			}
		}else {
			System.out.println("Invalid Name");
		}
	}
	
	public void updatePhoneNumber(String newNumber, String id) {
		if(newNumber.length() == 10) {
			for(int i = 0; i < contacts.size(); i ++) {
				if(contacts.get(i).getId().equals(id)) {
					contacts.get(i).setPhoneNumber(newNumber);
				}
			}
		}else {
			System.out.println("Invalid Number");
		}
	}
	
	public void updateAddress(String newAddress, String id) {
		if(newAddress.length() <= 30) {
			for(int i = 0; i < contacts.size(); i ++) {
				if(contacts.get(i).getId().equals(id)) {
					contacts.get(i).setAddress(newAddress);
				}
			}
		}else {
			System.out.println("Invalid Address");
		}
	}
	
	public String getContactId(String id) {
		for(int i = 0; i < contacts.size(); i ++) {
			if(contacts.get(i).getId().equals(id)) {
				return id;
			}
		}
		return "-1";
	}
}
