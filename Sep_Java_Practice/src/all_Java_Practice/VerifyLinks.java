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
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
public class VerifyLinks {
	public WebDriver dr;
	@Test
	public void test1() {
	 		System.setProperty("webdriver.chrome.driver", "D:\\Software Selenium\\chromedriver_win32\\chromedriver.exe");
	 		System.setProperty("webdriver.chrome.logfile", System.getProperty("user.dir")+"\\chromeLog_File\\ChromeLog.txt");
	    	ChromeOptions op=new ChromeOptions();
	    	op.addArguments("--disable-infobars");
	    	op.addArguments("--disable-notifications");
	    	op.addArguments("--start-maximized");
	 		dr=new ChromeDriver(op);
			dr.navigate().to("https://amazon.co.in/");
			String pageTitle=dr.getTitle();
			System.out.println(pageTitle);
			List<WebElement> links=dr.findElements(By.tagName("a"));
			System.out.println("Total links are "+links.size());
			for(int i=0;i<links.size();i++)
			{				
				WebElement ele= links.get(i);				
				String url=ele.getAttribute("href");				
				verifyLinkActive(url);

		}
	}

		public void verifyLinkActive(String linkUrl)
		{
	        try 
	        {
	           URL url = new URL(linkUrl);
	           
	           HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
	           
	           httpURLConnect.setConnectTimeout(3000);
	           
	           httpURLConnect.connect();
	           
	           if(httpURLConnect.getResponseCode()==200)
	           {
	               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
	            }
	          if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)  
	           {
	               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
	            }
	        } catch (Exception e) {
	           
	        }
	    } 
	
		@AfterClass
		public void tearDown(){
			quiteBrowser(3);
		}
		
		public void wait(int sec){
		try{
			Thread.sleep(sec*1000);
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}
		
		public void quiteBrowser(int sec){
		try{
			Thread.sleep(sec*1000);
			dr.quit();
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}
			
		
	
}
