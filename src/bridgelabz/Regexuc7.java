//rule3-numeric characters

package bridgelabz;

public class Regexuc7 {
	public static void main(String[] args) {
		String password="Abcde526";
		System.out.println(password.matches("^[A-Za-z0-9]{8}$"));
	}
}
