package all_Java_Practice;

import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class BrokenLink_All_LinkClick {
	WebDriver dr;
	@Test
	public void alllink_Method() throws Exception{
		System.setProperty("webdriver.chrome.driver","D:\\Software Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions op =new ChromeOptions();
		op.addArguments("--start-maximized");
		op.addArguments("--disable-infobars");
		dr=new ChromeDriver(op);
		
		dr.navigate().to("https://edition.cnn.com/");
		Thread.sleep(3);
		
		WebElement box = dr.findElement(By.xpath("//div[@class='column zn__column--idx-2']"));
		List<WebElement> link = box.findElements(By.tagName("a"));
		for(int i=0;i<link.size();i++){
			System.out.println(link.get(i).getText());
			link.get(i).click();
			dr.navigate().back();
			box = dr.findElement(By.xpath("//div[@class='column zn__column--idx-2']"));
			link = box.findElements(By.tagName("a"));
		}
	}
	
}
