package BatchTesting;

import org.testng.annotations.Test;

public class SignupTest {
	@Test
	public void signUpByEmail()
	{
		System.out.println("Sign up by email account");
	}
	
	@Test
	public void  signUpByFacebook()
	{
		System.out.println("Sign up By facebook account");
	}
	
	@Test
	public void signUpByTwitter()
	{
		System.out.println("Sign up by twitter account");
	}

}
