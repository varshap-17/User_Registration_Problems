package bridgelabz;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
class Regexuc10 {

	@Test
	void firstNametest() {
		String name="Name";
		System.out.println(name.matches("^[A-Z a-z]*$"));
		Assert.assertEquals(name, name);
	}
	@Test
	void lastNametest() {
		String name="Last Name";
		System.out.println(name.matches("^[A-Z a-z]*$"));
		Assert.assertEquals(name, name);
	}
	@Test
	void emailtest() {
		String name="abc.xyz@bl.co.in";
		System.out.println(name.matches("^[a-z]*(.)[a-z]*@[a-z]*(.)[a-z]*(.)[a-z]*$"));
		Assert.assertEquals(name, name);
	}
	@Test
	void mobiletest() {
		String number="91 9184482235";
		System.out.println(number.matches("^[0-9]*\s[0-9]*$"));
		Assert.assertEquals(number, number);
	}
	@Test
	void passwordtest() {
		String password="Abcde526@";
		System.out.println(password.matches("^[A-Za-z]*[0-9]*@$"));
		Assert.assertEquals(password, password);
	}
}
