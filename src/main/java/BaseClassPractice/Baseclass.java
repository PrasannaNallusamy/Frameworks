package BaseClassPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	WebDriver driver;

	public WebDriver lunchChromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;

	}

	public void LaunchUrl(String url) {
		driver.get(url);
	}

	public void maximizeWindow() {
		driver.manage().window().maximize();

	}

	public void close() {
		driver.quit();

	}

	public void Loaddata(WebElement element, String data) {

		element.sendKeys(data);

	}
	
	public void clickButton(WebElement element) {
		
		element.click();
		

	}

}
