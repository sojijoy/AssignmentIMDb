package pages;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.BaseClass;

public class LoginPage extends BaseClass{
	@FindBy(linkText="Sign in with IMDb")
	WebElement signinbutton;
	@FindBy(id="ap_email")
	WebElement email;
	@FindBy(id="ap_password")
	WebElement password;
	@FindBy(id="signInSubmit")
	WebElement signin;
	/*@FindBy(id="ap_password")
	WebElement reEnter;
	@FindBy(id="auth-captcha-guess")
	WebElement captcha;*/
	@FindBy(id="imdbHeader-navDrawerOpen--desktop")
	WebElement menu;
	@FindBy(id="lister-sort-by-options")
	WebElement sort;
	@FindBy(xpath="//*[@id=\"main\"]/div/span/div/div/div[3]/table/tbody/tr[250]/td[2]/a")
	WebElement leastRated;
	
	public LoginPage() {
		super();
		init();
		PageFactory.initElements(driver, this);
	}
	
	public void signinbutton() {
		this.signinbutton.click();
	}
	
	public void email(String email) {
		this.email.sendKeys(email);
	}
	
	public void password(String pwd) {
		this.password.sendKeys(pwd);
	}
	
	public void signin() {
		this.signin.click();
		
	}
	
	/*public void reEnter(String pwd1) {
		this.reEnter.sendKeys(pwd1);
	}
	
	public void captcha() {
		System.out.println("Enter Captcha");
		Scanner sc= new Scanner(System.in);
		String cp1= sc.nextLine();
		this.captcha.sendKeys(cp1);
		driver.findElement(By.id("signInSubmit")).click();
	}*/
	
	public void menu() {
		this.menu.click();
		driver.findElement(By.linkText("Top Rated Movies")).click();
		
	}
	

	public void sort() {
		this.sort.click();
		Select drpdwn= new Select(sort);
		drpdwn.selectByVisibleText("Release Date");
		
	}
	
	public void leastRated() throws InterruptedException {
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 5000)");
		Thread.sleep(10000);
		this.leastRated.click();
		driver.findElement(By.linkText("6 February 1921 (USA)")).click();
		for (WebElement release: driver.findElements(By.tagName("td")))
		{
			    release.getText();
			    System.out.println(release);
			        }
	}
	public String getTitle() {
		return driver.getTitle();
	}
	
	
	
}

