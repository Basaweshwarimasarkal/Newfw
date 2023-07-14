package runner;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.Base_script;
import pom.Pomfb;
public class Fb_run extends Base_script{
	@Test(dataProvider = "testData")
	public void test(String d1,String d2) throws InterruptedException
	{
		Pomfb p=new Pomfb(driver);
		p.passun(d1);
		p.passpwd(d2);
		Thread.sleep(2000);
		p.btn();
		//Assert.fail();
		
	}
	@DataProvider(name="testData")
	
	public Object[][] createData1()
	{
		return new Object[][]
		{
			{"basava","admin"},
			{"basava1","manager"},
		};
	}
}
