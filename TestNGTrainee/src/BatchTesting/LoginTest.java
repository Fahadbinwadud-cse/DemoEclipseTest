package BatchTesting;

import org.testng.annotations.Test;

public class LoginTest {
	@Test
	public void LoginByEmail() 
	{
		System.out.println("This is login by email");
	}
	
	@Test
	public void  LoginByFacebook()
	{
		System.out.println("This is login by facebook");
	}
	
	@Test
	public void LoginByTwitter()
	{
		System.out.println("This  is  login by twitter");
	}

}
