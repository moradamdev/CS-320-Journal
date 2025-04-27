package Module3MilestoneTests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Module3Milestone.Contact;

public class ContactTest {
	@Test
	void testConstructor() {
		Contact contacts = new Contact("0", "John", "Doe", "5555555555", "1 Place Drive");
		assertThat(contacts)
		.hasFieldOrPropertyWithValue("id", "0")
		.hasFieldOrPropertyWithValue("firstName", "John")
		.hasFieldOrPropertyWithValue("lastName", "Doe")
		.hasFieldOrPropertyWithValue("phoneNumber", "5555555555")
		.hasFieldOrPropertyWithValue("address", "1 Place Drive");
	}
	
	@Test
	void testSetters() {
		Contact contacts = new Contact("0", "John", "Doe", "5555555555", "1 Place Drive");
		contacts.setFirstName("Robert");
		contacts.setLastName("Pattinson");
		contacts.setPhoneNumber("5555555551");
		contacts.setAddress("2 Place Drive");
		assertThat(contacts)
		.hasFieldOrPropertyWithValue("firstName", "Robert")
		.hasFieldOrPropertyWithValue("lastName", "Pattinson")
		.hasFieldOrPropertyWithValue("phoneNumber", "5555555551")
		.hasFieldOrPropertyWithValue("address", "2 Place Drive");
		
	}
	
	@Test
	void testIDLength() {
		Contact contacts = new Contact("01234567899999", "John", "Doe", "5555555555", "1 Place Drive");
		if (contacts.getId().length() > 10) {
			fail("id is greater than 10");
		}
	}
	
	
	@Test
	void testFirstNameLength() {//should always pass since I set up a fail safe in case it is greater than 10
		Contact contacts = new Contact("0", "Johnathanius", "Doe", "5555555555", "1 Place Drive");
		if (contacts.getFirstName().length() > 10) {
			fail("name length is greater than 10");
		}else {
			System.out.print("Shortened name is " + contacts.getFirstName());
		}
	}
	
	@Test
	void testLastNameLength() {//also should always pass
		Contact contacts = new Contact("0", "John", "Dobermannnn", "5555555555", "1 Place Drive");
		if (contacts.getLastName().length() > 10) {
			fail("name length is greater than 10");
		}else {
			System.out.print("Shortened name is " + contacts.getLastName());
		}
	}
	
	//All other tests have fail safes to make sure they will never fail
}
