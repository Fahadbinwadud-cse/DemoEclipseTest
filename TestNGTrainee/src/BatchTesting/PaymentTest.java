package BatchTesting;

import org.testng.annotations.Test;

public class PaymentTest {
	@Test
	public void paymentInDoller()
	{
		System.out.println("This payment method is Doller");
	}
	@Test
	public void paymentInTaka()
	{
		System.out.println("This method by using Taka method");
	}

}
