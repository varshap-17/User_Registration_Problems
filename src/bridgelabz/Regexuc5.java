//As a User need to follow pre-defined Password rules.Rule1 – minimum 8 Characters

package bridgelabz;

public class Regexuc5 {
	public static void main(String[] args) {
		String password="abcdesdx";
		System.out.println(password.matches("^[a-z]{8}$"));
	}
}
