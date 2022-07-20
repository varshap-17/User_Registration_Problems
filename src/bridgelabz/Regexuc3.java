//As a User need to enter a valid email - E.g. abc.xyz@bl.co.in

package bridgelabz;

public class Regexuc3 {
	public static void main(String[] args) {
		String name="abc.xyz@bl.co.in";
		System.out.println(name.matches("^[a-z]*(.)[a-z]*@[a-z]*(.)[a-z]*(.)[a-z]*$"));
	}
}
