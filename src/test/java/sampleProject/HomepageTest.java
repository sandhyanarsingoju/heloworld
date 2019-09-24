package sampleProject;

import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.landingPage;
import pageObjects.loginpage;
import resources.base;

public class HomepageTest extends base {
	public static Logger log=(Logger) LogManager.getLogger(HomepageTest.class.getName());
@BeforeTest
	public void initialize1() throws IOException {
	driver=initialize();
	
	driver.get(prop.getProperty("url"));
   }
	
	@Test(dataProvider="getdata")
	public void homepageNavigation(String username,String pwd) throws IOException  {
		
		landingPage l=new landingPage(driver);
		l.getlogin().click();
		loginpage lp=new loginpage(driver);
		lp.email().sendKeys(username);
		lp.pwd().sendKeys(pwd);
		lp.login().click();
		log.info("its passd");
	  }
	@DataProvider
	public Object[][] getdata() {
		Object[][] obj=new Object[2][2];
		obj[0][0]="admin1";
		obj[0][1]="123";
		obj[1][0]="admin2";
		obj[1][1]="234";
	   return obj;
	}
	@AfterTest
	public void teardown() {
		driver.close();
		driver=null;
		
	}

}
