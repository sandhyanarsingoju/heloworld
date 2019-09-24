package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpage {
	public WebDriver driver;
	//
	By email = By.cssSelector("*[id='user_email']");
	By pwd = By.id("user_password");
	By login = By.xpath("//*[@id=\'new_user\']/div[3]/input");

	public loginpage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement email() {
		return driver.findElement(email);
	}

	public WebElement pwd() {
		return driver.findElement(pwd);
	}

	public WebElement login() {
		return driver.findElement(login);
	}

}
