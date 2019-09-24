package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingPage {
	public WebDriver driver;
	By login = By.xpath("//*[@id=\"homepage\"]/header/div[1]/div/nav/ul/li[4]/a/span");
	By str = By.cssSelector(".text-center>h2");
	By navbar=By.xpath("//*[@id=\'homepage\']/header/div[2]/div/nav/ul");
	public landingPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getlogin() {
		return driver.findElement(login);
	}
	public WebElement getStr() {
		// TODO Auto-generated method stub
		return driver.findElement(str);
	}
	public WebElement getnavbar() {
		return driver.findElement(navbar);
	}
}
