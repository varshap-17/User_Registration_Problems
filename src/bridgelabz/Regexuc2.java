//As a User need to enter a valid Last Name

package bridgelabz;

public class Regexuc2 {
	public static void main(String[] args) {
		String name="Last Name";
		System.out.println(name.matches("^[A-Z a-z]*$"));
	}
}
