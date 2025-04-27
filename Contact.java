package Module3Milestone;
public class Contact {
	private String id;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	
	
	public Contact(String id, String firstName, String lastName, String phoneNumber, String address) {
		super();
		
		if((id.length() > 10) || (id == null) || (id.length() < 1)) {
			//bad id
		}else {
			this.id = id;
		}
		
		if((firstName != null) && (firstName.length() <= 10)){
			this.firstName = firstName;
		}else if(firstName.length() > 10) {
			this.firstName = firstName.substring(0, 10);//remove this line to test
		}
		
		
		if((lastName != null) && (lastName.length() <= 10)){
			this.lastName = lastName;
		}else if(lastName.length() > 10) {
			this.lastName = lastName.substring(0, 10);//remove this line to test
		}
		
		if((phoneNumber != null) && (phoneNumber.length() == 10)){
			this.phoneNumber = phoneNumber;
		}else if(phoneNumber.length() != 10) {
			this.phoneNumber = phoneNumber.substring(0, 10);//remove this line to test
		}
		
		if((address != null) && (address.length() <= 30)){
			this.address = address;
		}else if(address.length() != 10) {
			this.address = address.substring(0, 30);//remove this line to test
		}
		
		
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		if((firstName != null) && (firstName.length() <= 10)){
			this.firstName = firstName;
		}else if(firstName.length() > 10) {
			this.firstName = firstName.substring(0, 10);//remove this line to test
		}
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		if((lastName != null) && (lastName.length() <= 10)){
			this.lastName = lastName;
		}else if(lastName.length() > 10) {
			this.lastName = lastName.substring(0, 10);//remove this line to test
		}
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		if((phoneNumber != null) && (phoneNumber.length() == 10)){
			this.phoneNumber = phoneNumber;
		}else if(phoneNumber.length() != 10) {
			this.phoneNumber = phoneNumber.substring(0, 10);//remove this line to test
		}
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		if((address != null) && (address.length() <= 30)){
			this.address = address;
		}else if(address.length() != 10) {
			this.address = address.substring(0, 30);//remove this line to test
		}
	}


	public String getId() {
		return id;
	}
	
	
}
