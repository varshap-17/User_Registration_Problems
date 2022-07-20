//Email samples

package bridgelabz;

public class Regexuc9 {
	public static void main(String[] args) {
		String password1="abc@yahoo.com";
		System.out.println(password1.matches("^[a-z]*@[a-z]*(.)[a-z]*$"));
		String password2="abc-100@yahoo.com";
		System.out.println(password2.matches("^\\D*-\\d*@\\D*(.)\\D*$"));
		String password3="abc.100@yahoo.com";
		System.out.println(password3.matches("^\\D*(.)\\d*@\\D*(.)\\D*$"));
		String password4="abc111@abc.com";
		System.out.println(password4.matches("^\\D*\\d*@\\D*(.)\\D*$"));
		String password5="abc-100@abc.net";
		System.out.println(password5.matches("^[a-c]*-[0-9]*@[a-c]*(.)[a-z]*$"));
		String password6="abc.100@abc.com.au";
		System.out.println(password6.matches("^[a-c]*(.)[0-9]*@[a-c]*(.)[a-z]*(.)[a-u]*$"));
		String password7="abc@1.com";
		System.out.println(password7.matches("^[a-c]*@[0-9](.)[a-z]*$"));
		String password8="abc@gmail.com.com";
		System.out.println(password8.matches("^[a-c]*@[a-z]*(.)[a-z]*(.)[a-z]*$"));
		String password9="abc+100@gmail.com";
		System.out.println(password9.matches("^[a-c]*.[0-9]*@[a-z]*(.)[a-z]*$"));
	}
}
