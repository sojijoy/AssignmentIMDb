package pages;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class RegistrationPage extends BaseClass {
	
	@FindBy(linkText="Create a New Account")
	WebElement createAcc;
	@FindBy(id="ap_customer_name")
	WebElement name;
	@FindBy(id="ap_email")
	WebElement email;
	@FindBy(id="ap_password")
	WebElement password;
	@FindBy(id="ap_password_check")
	WebElement passwordCheck;
	@FindBy(id="continue")
	WebElement signUp;
	@FindBy(xpath="//input[@name='cvf_captcha_input']")
	WebElement captcha;
	@FindBy(xpath="//input[@name='cvf_captcha_captcha_action']")
	WebElement continueButton;
	@FindBy(xpath="//input[@name='code']")
	WebElement verifyMail;
	
	
	public RegistrationPage() {
		super();
		init();
		PageFactory.initElements(driver, this);
	}
	
	public void createAcc() {
		this.createAcc.click();
	}
	
	public void name(String name) {
		this.name.sendKeys(name);
	}
	
	public void email(String email) {
		this.email.sendKeys(email);
	}
	
	public void password(String pwd) {
		this.password.sendKeys(pwd);
	}
	
	public void passwordCheck(String pwdchk) {
		this.passwordCheck.sendKeys(pwdchk);
	}
	
	public void signUp() {
		this.signUp.click();
	}
	
	public void captcha() throws InterruptedException {
		System.out.println("Enter Captcha");
		Scanner sc= new Scanner(System.in);
		String cp= sc.nextLine();
		this.captcha.sendKeys(cp);
		Thread.sleep(7000);
	}
	
	public void verifyMail() {
		System.out.println("Enter Captcha");
		Scanner sc= new Scanner(System.in);
		String cd= sc.nextLine();
		this.verifyMail.sendKeys(cd);
		driver.findElement(By.id("a-autoid-0")).click();
		driver.close();
	}
	
	public void continueButton() {
		this.continueButton.click();
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
	

}
