package bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexuc13 {
	public static void main(String[] args) {
		//First name
		lambdaConcept validate = (name)-> { 
			 Pattern p=Pattern.compile("Firstname");
			 Matcher m=p.matcher("^[A-Z a-z]*$");
			 boolean b=m.matches();
			 System.out.println(b);
	        };
	     //Last name   
	     lambdaConcept validate1=(name)->{
	    	 Pattern p=Pattern.compile("Lastname");
			 Matcher m=p.matcher("^[A-Z a-z]*$");
			 boolean b=m.matches();
			 System.out.println(b);
	     };
	     //Email
	     lambdaConcept validate2=(name)->{
	    	 Pattern p=Pattern.compile("abc.xyz@bl.co.in");
			 Matcher m=p.matcher("^[a-z]*(.)[a-z]*@[a-z]*(.)[a-z]*(.)[a-z]*$");
			 boolean b=m.matches();
			 System.out.println(b);
	     };
	     //Mobile number
	     lambdaConcept validate3=(name)->{
	    	 Pattern p=Pattern.compile("91 9184482235");
			 Matcher m=p.matcher("^[0-9]*\\s[0-9]*$");
			 boolean b=m.matches();
			 System.out.println(b);
	     };
	     //Password
	     lambdaConcept validate4=(name)->{
	    	 Pattern p=Pattern.compile("Abcde526@");
			 Matcher m=p.matcher("^[A-Za-z]*[0-9]*@$");
			 boolean b=m.matches();
			 System.out.println(b);
	     };
	            System.out.println(validate);
	            System.out.println(validate1);
	            System.out.println(validate2);
	            System.out.println(validate3);
	            System.out.println(validate4);
	}
}
