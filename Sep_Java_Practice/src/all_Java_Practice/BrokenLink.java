package all_Java_Practice;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BrokenLink {
	WebDriver dr;
	@Test
	@Parameters("bro")

	public void openBrow(String bName){
			if(bName.equalsIgnoreCase("chrome")){
				System.setProperty("webdriver.chrome.driver", "D:\\Software Selenium\\chromedriver_win32\\chromedriver.exe");
				ChromeOptions op=new ChromeOptions();
				op.addArguments("--start-maximized");
				op.addArguments("--disable-infobars");
				dr = new ChromeDriver(op);
			}else{
				 System.setProperty("webdriver.gecko.driver", "D:\\Software Selenium\\Firefox_Driver\\geckodriver.exe");
	     		 dr = new FirefoxDriver();
				//log.info("Firefox Browser open successfully....");
			   }
			//log.info("Browser openning process done..... Now going to insert Application url");
			dr.navigate().to("http://google.com/");
			System.out.println(dr.getTitle());
	List<WebElement> linkurl = dr.findElements(By.tagName("a"));
		System.out.println(linkurl.size());
		for(int i=0;i<linkurl.size();i++){
			String url  = linkurl.get(i).getAttribute("href");
			verify(url);
	}
}

	public void verify(String ulink){
		try{
			URL u=new URL(ulink);
			HttpURLConnection con=(HttpURLConnection)u.openConnection();
			con.setConnectTimeout(2000);
			con.connect();
			if(con.getResponseCode()==200){
				System.out.println(ulink +"-- > " + con.getResponseMessage());
			}if(con.getResponseCode()==con.HTTP_NOT_FOUND){
				System.out.println(ulink +"-- > " + con.getResponseMessage()+" --> "+ con.HTTP_NOT_FOUND);
			}
		}catch(Exception ex){
			  System.out.println(ex.getMessage());
		}
	}
	
	@AfterTest
	public void tearDown() throws Exception{
        Thread.sleep(5000);
		dr.quit();
	}
}
