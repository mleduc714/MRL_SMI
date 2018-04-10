package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;

public class MRLTest {
	
	@Given("^I open a browser$")
	public void i_open_a_browser() throws Throwable {
	    System.out.println("TEST1");
	}

	@Given("^I am on the student access page$")
	public void i_am_on_the_student_access_page() throws Throwable {
	    System.out.println("TEST2");
	}

}
