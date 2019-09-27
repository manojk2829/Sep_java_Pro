package all_Java_Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class OpenBrowser {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Software Selenium\\Browser_exe\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		
		DesiredCapabilities dc=new DesiredCapabilities().chrome();
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
		
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dr.navigate().to("http://google.com/");
		/*WebElement ele=dr.findElement(By.id("manoj"));
		WebDriverWait wait=new WebDriverWait(dr,10);
		wait.until(ExpectedConditions.visibilityOf(ele));*/
		dr.findElement(By.name("q")).sendKeys(Keys.SHIFT,"Manoj Kuswaha");
		dr.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		List<WebElement> ele=dr.findElements(By.tagName("a"));
		
		int eleLink = dr.findElements(By.tagName("a")).size();
		for(int i=0;i<ele.size();i++){
			System.out.println(ele.get(i).getText());
		}
		System.out.println(eleLink);
	}
}
