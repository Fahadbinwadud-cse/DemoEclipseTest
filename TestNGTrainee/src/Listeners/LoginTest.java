package Listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
	@Test()// enabled=false means skip this method when run program
	public void LoginByFb()
	{
		System.out.println("Login by Fb account");
		Assert.assertEquals("Fahad","Fahad");//true
	}
	@Test
	public void LoginByEmail()
	{
		System.out.println("Login By email account");
		Assert.assertEquals("Fahad@gmail.com","fahad@gmail.com");
	}

}
