package base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
	Properties properties;
	
	public BaseClass() {
		
		try {
			properties= new Properties();
			properties.load(new FileInputStream("Configurations//config.properties"));
			
		} 
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void init() {
		try {
		String browser= properties.getProperty("browser");
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
			driver= new ChromeDriver();
			
		}
		else {
			System.out.println("No chrome driver found");
		}
		
		String url= properties.getProperty("url");
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
