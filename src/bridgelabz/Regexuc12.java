package bridgelabz;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
class Regexuc12{

	@Test
	void firstnametest() throws CustomException{
		String actualvalue="FirstName";
		boolean expectedvalue=actualvalue.matches("^[a-z A-Z]*$");
		System.out.println(expectedvalue);
		@SuppressWarnings("unused")
		InvalidUser iu= new InvalidUser();
		Assert.assertEquals(actualvalue, expectedvalue);
	}
	@Test
	void lastnametest() throws CustomException{
		String actualvalue="LastName";
		boolean expectedvalue=actualvalue.matches("^[A-Z a-z]*$");
		System.out.println(expectedvalue);
		@SuppressWarnings("unused")
		InvalidUser iu= new InvalidUser();
		Assert.assertEquals(actualvalue,expectedvalue);
	}
	@Test
	void emailtest() throws CustomException{
		String actualvalue="abc.xyz@bl.co.in";
		boolean expectedvalue=actualvalue.matches("^[a-z]*(.)[a-z]*@[a-z]*(.)[a-z]*(.)[a-z]*$");
		System.out.println(expectedvalue);
		@SuppressWarnings("unused")
		InvalidUser iu= new InvalidUser();
		Assert.assertEquals(actualvalue, expectedvalue);
	}
	@Test
	void mobiletest() throws CustomException{
		String actualvalue="91 9184482235";
		boolean expectedvalue=actualvalue.matches("^[0-9]*\s[0-9]*$");
		System.out.println(expectedvalue);
		@SuppressWarnings("unused")
		InvalidUser iu= new InvalidUser();
		Assert.assertEquals(actualvalue,expectedvalue);
	}
	@Test
	void passwordtest() throws CustomException{
		String actualvalue="Abcde526@";
		boolean expectedvalue=actualvalue.matches("^[A-Za-z]*[0-9]*@$");
		System.out.println(expectedvalue);
		@SuppressWarnings("unused")
		InvalidUser iu= new InvalidUser();
		Assert.assertEquals(actualvalue,expectedvalue);
	}
	@Test
	void Firstnametest() {
		String name="Name";
		System.out.println(name.matches("^[A-Z a-z]*$"));
		Assert.assertEquals(name, name);
	}
	@Test
	void Lastnametest() {
		String name="Last Name";
		System.out.println(name.matches("^[A-Z a-z]*$"));
		Assert.assertEquals(name, name);
	}
	@Test
	void Emailtest(){
	String name="abc.xyz@bl.co.in";
	System.out.println(name.matches("^[a-z]*(.)[a-z]*@[a-z]*(.)[a-z]*(.)[a-z]*$"));
	Assert.assertEquals(name, name);
    }
	@Test
	void Mobilenumtest() {
		String number="91 9184482235";
		System.out.println(number.matches("^[0-9]*\s[0-9]*$"));
		Assert.assertEquals(number, number);
	}
	@Test
	void Passwordtest() {
		String password="Abcde526@";
		System.out.println(password.matches("^[A-Za-z]*[0-9]*@$"));
		Assert.assertEquals(password, password);
	}
}