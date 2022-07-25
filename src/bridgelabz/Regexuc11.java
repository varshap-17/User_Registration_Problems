package bridgelabz;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class Regexuc11 {

	@ParameterizedTest(name="#{index} - Test with Argument={0}")
    @ValueSource(strings = {"abc.xyz@bl.co.in", "abc@yahoo.com", "abc-100@yahoo.com","abc111@abc.com","abc.100@abc.com.au","abc@gmail.com.com"})
    void test_string(String arg) {
      String validate = "abc";
      
      System.out.println("arg => "+arg);
        Assert.assertTrue(arg.contains(validate));
    }
}
