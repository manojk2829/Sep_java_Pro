package june_TestNG_Pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestNG_Class_1 {
	@Test
	public void openBrowser_Chrome1() throws Exception{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Browser_exe\\chromedriver.exe");
		ChromeOptions op =new ChromeOptions();
		op.addArguments("-start-maximized");
		op.addArguments("--disable-infobars");
		WebDriver dr=new ChromeDriver(op);
		dr.navigate().to("http://google.com/");
		System.out.println(dr.getTitle());
		Thread.sleep(10);
		dr.quit();
		
	}

}
