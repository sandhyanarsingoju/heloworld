package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties; import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class base {
	
	public WebDriver driver;
	public Properties prop;
	public WebDriver initialize() throws IOException {
		
		Properties prop= new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Sandhya\\eclipse-workspace\\sampleProject\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String str=prop.getProperty("browser");
		String url=prop.getProperty("url");
		
		if(str.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sandhya\\Downloads\\chromedriver.exe");
		 driver=new ChromeDriver();
		}
		else if(str.equalsIgnoreCase("firefox")) {
			//its firefox
		}
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
	}
	    public void getScreenshot(String result) {
	 File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 FileHandler.copy(src, new File("c://samplePro/"+result+"screenshots.png"));
	 
	 
	    }

}
