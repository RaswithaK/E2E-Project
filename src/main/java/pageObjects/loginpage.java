package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpage {
WebDriver driver;

public loginpage(WebDriver driver)
{
	this.driver=driver;
}
By email=By.xpath("//*[@type='email']");
By passward=By.xpath("//*[@type='password']");
By login=By.xpath("//*[@type='submit']");
public WebElement Email()
{
	return driver.findElement(email);
}
public WebElement Password()
{
	return driver.findElement(passward);
}
public WebElement Login()
{
	return driver.findElement(login);
}
}
