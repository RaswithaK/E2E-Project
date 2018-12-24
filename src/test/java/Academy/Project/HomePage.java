package Academy.Project;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.landingpage;
import pageObjects.loginpage;
import resources.base;

public class HomePage extends base{
	@BeforeTest
	public void diveropen() throws IOException
	{
		driver=intializeDriver();
		 //base b=new base();
		 //b.getScreenshot(result);
		//driver= b.intializeDriver();
		//result=getScreenshot(result);
		
		driver.get(prop.getProperty("URL"));
		
	Actions a=new Actions(driver);
		
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"homepage\"]/div[5]/div[2]/div/div/div/span/div/div[7]/div/div/div[2]"))).click().build().perform();
	}
@Test(dataProvider="getData")
public void basepagenavigation( String username,String password) throws IOException
{
	driver.get(prop.getProperty("URL"));
	//Actions a=new Actions(driver);
		
		//a.moveToElement(driver.findElement(By.xpath("//*[@id='homepage']/div[5]/div[2]/div/div/div/span/div/div[7]/div/div/div[2]"))).click().build().perform();
	landingpage l=new landingpage(driver);
	
	//l.Title().getText();
	l.Signin().click();
	//compare text from the browser with actual value
	
	loginpage in=new loginpage(driver);
	in.Email().sendKeys(username);;
	in.Password().sendKeys(password);
	in.Login().click();
	in.Email().clear();
	
}
@DataProvider
public Object[][] getData()
{
	//row stand for how many different data types tests should
	//column stands for how many values for each test
	Object[][] data=new Object[2][2];
	data[0][0]="nonrestricteduser@go.com";
			data[0][1]="123456";
			data[1][0]="restricteduser@go.com";
			data[1][1]="456789";		
	return data;
}
@AfterTest
public void endofTest()
{
	driver.close();
	driver=null;
}
}
