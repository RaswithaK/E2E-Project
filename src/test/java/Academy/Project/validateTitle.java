package Academy.Project;

import java.io.IOException;

//import org.openqa.selenium.By;
//import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.landingpage;
//import pageObjects.loginpage;
import resources.base;

public class validateTitle extends base{
	@BeforeTest
	public void diveropen() throws IOException
	{
		driver=intializeDriver();
		driver.get(prop.getProperty("URL"));
	//Actions a=new Actions(driver);
		
		//a.moveToElement(driver.findElement(By.xpath("//*[@id='homepage']/div[5]/div[2]/div/div/div/span/div/div[7]/div/div/div[2]"))).click().build().perform();
	}
@Test
public void basepagenavigation(){
	
	landingpage l=new landingpage(driver);

	//l.Signin().click();
	//compare text from the browser with actual value
	
	Assert.assertEquals(l.Title().getText(), "FEATURED COURSES");
	Assert.assertTrue(l.getnavbar().isDisplayed());
	
	/*loginpage in=new loginpage(driver);
	in.Email().sendKeys(username);;
	in.Password().sendKeys(password);
	in.Login().click();
	in.Email().clear();*/
	
}
@AfterTest
public void endofTest()
{
	driver.close();
	driver=null;
}

}

