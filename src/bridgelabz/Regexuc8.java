//rule4-atleast one special character

package bridgelabz;

public class Regexuc8 {
	public static void main(String[] args) {
	String password="Abcde526@";
	System.out.println(password.matches("^[A-Za-z]*[0-9]*@$"));
	}
}
