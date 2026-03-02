package pom.practice;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import BaseClassPractice.Baseclass;

public class Login {
	@Test
	public void test() {
		Baseclass b = new Baseclass();
		WebDriver driver = b.lunchChromeBrowser();
		b.maximizeWindow();
		b.LaunchUrl("https://adactinhotelapp.com/index.php");

		LocatorClass l = new LocatorClass(driver);

		b.Loaddata(l.getUsername(), "prasannacurry");
		b.Loaddata(l.getPassWord(), "123456");
		b.clickButton(l.getClick());

		b.close();

		System.out.println("Browser Launched successfully ");
	}

}
