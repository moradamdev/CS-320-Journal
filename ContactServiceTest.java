package Module3MilestoneTests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import Module3Milestone.Contact;
import Module3Milestone.ContactService;

public class ContactServiceTest {
	@Test
	void testAddContact() {
		ContactService contacts = new ContactService();
		contacts.addContact("0", "John", "Doe", "5555555555", "1 Place Drive");
		if (contacts.getContactId("0") == "-1") {
			fail("id is not in list");
		}
	}
}
