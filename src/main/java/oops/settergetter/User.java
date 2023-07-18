package oops.settergetter;

class User 
{
	private String firstName;
	private String lastName;
	private String gender;
	private String dateOfBirth;
	private String emailId;
	private long mobileNumber;
	private String password;
	
	public String getFirstName() 
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName() 
	{
		return lastName;
	}

	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}

	public String getGender()
	{
		return gender;
	}

	public void setGender(String gender)
	{
		this.gender = gender;
	}

	public String getDateOfBirth()
	{
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth)
	{
		this.dateOfBirth = dateOfBirth;
	}

	public String getEmailId() 
	{
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getMobileNumber()
	{
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) 
	{
		this.mobileNumber = mobileNumber;
	}

	public String getPassword() 
	{
		return password;
	}

	public void setPassword(String password) 
	{
		this.password = password;
	}

	public static void main(String[] args) 
	{
		User fbUser = new User();
		fbUser.setFirstName("Swapna");
		fbUser.setLastName("Ch");
		fbUser.setGender("Female");
		fbUser.setDateOfBirth("02 Sep 1993");
		fbUser.setEmailId("swapna.ch@gmail.com");
		fbUser.setMobileNumber(9573638397L);
		fbUser.setPassword("@mmu");
		
		System.out.println("User first name is "+fbUser.getFirstName());
		System.out.println("Last Name is "+fbUser.getLastName());
		System.out.println("Gender is "+fbUser.getGender());
		System.out.println("Date of birth is "+fbUser.getDateOfBirth());
		System.out.println("Email Id is "+fbUser.getEmailId());
		System.out.println("Mobile number is "+fbUser.getMobileNumber());
		System.out.println("Password is "+fbUser.getPassword());		
	}
}
