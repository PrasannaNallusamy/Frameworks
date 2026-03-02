package pom.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import BaseClassPractice.Baseclass;

public class LocatorClass extends Baseclass { // baseclass we initiated wedriver that's why exteding the class

	public LocatorClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "username")
	WebElement username;

	@FindBys({ @FindBy(id = "password"), @FindBy(xpath = "//input[@name='password']") })
	WebElement passWord;

	@CacheLookup
	@FindAll({ @FindBy(id = "login"), @FindBy(xpath = "//input[@type='Submit']") })
	WebElement click;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getClick() {
		return click;
	}

}
