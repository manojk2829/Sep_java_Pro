package all_Java_Practice;

import java.util.Hashtable;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OpenBrowser {
	public Xls_Reader xls;
	String sheetName="Sheet2";
	String testCase = "TCID-02";
	
	@Test(dataProvider="datatest")
	public void doLogin(Hashtable<String,String> data) {
		xls = new Xls_Reader("D://Test_Excel.xlsx");
		System.setProperty("webdriver.chrome.driver", "D:\\Software Selenium\\Browser_exe\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		
		DesiredCapabilities dc=new DesiredCapabilities().chrome();
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
		
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dr.navigate().to(data.get("URL"));
		dr.findElement(By.name("q")).sendKeys(Keys.SHIFT,"Manoj Kuswaha");
		dr.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		List<WebElement> ele=dr.findElements(By.tagName("a"));
		
		int eleLink = dr.findElements(By.tagName("a")).size();
		for(int i=0;i<ele.size();i++){
			System.out.println(ele.get(i).getText());
		}
		System.out.println(eleLink);
	}
	
	@DataProvider
	public Object[][] datatest(){
		return Excel_ReaderTestClass.getExceldata(xls, testCase);
	}
}
