//Rule2-atleast 1 uppercase

package bridgelabz;

public class Regexuc6 {
	public static void main(String[] args) {
		String password="Abcdegtr";
		System.out.println(password.matches("^[A-Za-z]{8}$"));
	}
}
