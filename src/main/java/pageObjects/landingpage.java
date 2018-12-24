package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingpage {

	public WebDriver driver;

	
		By signin=By.xpath("//a[contains(@href,'sign_in')]");
		By title=By.xpath("//*[@id='content']/div/div/h2");
		By navbar=By.xpath("//*[@id='homepage']/header/div[2]/div/nav");
		
		public landingpage(WebDriver driver) {
			// TODO Auto-generated constructor stub
		this.driver=driver;
		}
		

		


		public WebElement Signin() {
			return driver.findElement(signin);
		}
		public WebElement Title() {
			return driver.findElement(title);
		}
		public WebElement getnavbar() {
			return driver.findElement(navbar);
		}
		
}
