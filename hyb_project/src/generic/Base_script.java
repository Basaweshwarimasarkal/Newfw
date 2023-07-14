package generic;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class Base_script implements Framework {
	public WebDriver driver;
	@BeforeMethod
	public void Openapp() throws InterruptedException
	{
		System.setProperty(chrome_key,chrome_value);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(base_url);
		
	}
	@AfterMethod
	public void Closeapp() 
	{
		
		driver.close();
	}
}
