package sampleProject;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.landingPage;
import resources.base;

public class navbarvalidity  extends base{
	
	@BeforeTest
	public void initialize1() throws IOException {
		 driver=initialize();

		  driver.get("http://www.qaclickacademy.com/index.php");
	}
	@Test
  public void navbar() throws IOException {
	 
	  landingPage l=new landingPage(driver);
	 
	  Assert.assertTrue(l.getnavbar().isDisplayed());
	 }
	@AfterTest
	public void teardown() {
		driver.close();
	}


}
