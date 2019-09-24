package sampleProject;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.landingPage;
import resources.base;

public class verificationTest extends base {
	@BeforeTest
	public void initialize1() throws IOException {
		 driver=initialize();

		  driver.get("http://www.qaclickacademy.com/index.php");
	}
@Test
	public void verify()throws IOException {
		
		landingPage l=new landingPage(driver);
		
		Assert.assertEquals(l.getStr().getText(), "FEATURED COURSES123");
		System.out.println("this is gitTest sample");
	}
@AfterTest
public void teardown() {
	
	
	driver.close();
	
}

}
