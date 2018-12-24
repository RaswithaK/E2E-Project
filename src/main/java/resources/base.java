
	package resources;

	import java.io.File;
import java.io.FileInputStream;

	import java.io.IOException;
	import java.util.Properties;
	import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

	public class base {
		public static WebDriver driver;
		public  static Properties prop;
		public WebDriver intializeDriver() throws IOException
		{
			prop=new Properties();
			
				FileInputStream fis=new FileInputStream("C:\\selenium_1\\eclipse workplace\\E2EProject\\src\\main\\java\\resources\\data.properties");
			
			prop.load(fis);
			String browsername=prop.getProperty("browser");
			if(browsername.equals("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", "C:\\selenium_1\\DRIVERS\\geckodriver.exe");
				ChromeOptions chrome=new ChromeOptions();
				chrome.addArguments("disable-notifications");
				driver = new FirefoxDriver();
			}
			else if (browsername.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\selenium_1\\DRIVERS\\chromedriver.exe");
				FirefoxOptions firefox=new FirefoxOptions();
				firefox.addArguments("disable-notifications");
				driver = new ChromeDriver();
			}
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			return driver;
		}
		public  void getScreenshot(String result) throws IOException
		{
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src,new File("C://selenium_1//test//"+result+"screenshot.png"));
			System.out.print(prop);
		}
		

	}


