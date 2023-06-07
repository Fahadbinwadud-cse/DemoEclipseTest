package ParallelTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGParallelTest {
	WebDriver driver = null;
	@Test(threadPoolSize=3,invocationCount=3,timeOut=1000)
	public void test1() throws InterruptedException
	{
		System.out.println("This is first test case 1 | " +Thread.currentThread().getId());
		/*System.setProperty("webdriver.chrome.driver","C:\\Users\\Fahad\\Documents\\Eclipse\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);*/
		
		
	}
	@Test
	public void test2() throws InterruptedException
	{
		System.out.println("This is Second test case 2 | "+Thread.currentThread().getId());
		/*System.setProperty("webdriver.chrome.driver","C:\\Users\\Fahad\\Documents\\Eclipse\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://translate.google.com/?sl=en&tl=bn&text=trainee&op=translate");
		Thread.sleep(5000);*/
	}
}
