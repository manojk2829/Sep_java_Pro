package june_TestNG_Pack;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class All_Link_on_Page{
	public WebDriver dr;
	
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
			String uurrll = link.get(i).getAttribute("href");
			verify(uurrll);
			link.get(i).click();
			dr.navigate().back();
			box = dr.findElement(By.xpath("//div[@class='column zn__column--idx-2']"));
			link = box.findElements(By.tagName("a"));
		}
		dr.quit();
	}
	
	public void verify(String ulink){
		try{
			URL u =new URL(ulink);
			HttpURLConnection con=(HttpURLConnection)u.openConnection();
			con.setReadTimeout(2000);
            con.connect();
            
            if(con.getResponseCode()==200){
            	System.out.println(ulink+" -- "+con.getResponseMessage());
            }else if(con.getResponseCode()==con.HTTP_NOT_FOUND){
            	System.out.println(ulink+" -- "+con.getResponseMessage()+"  -- "+con.HTTP_NOT_FOUND );
            }
		}
		catch(Exception ex){
			  System.out.println(ex.getMessage());
		}
	}
	/*URL u=new URL(ulink);
	HttpURLConnection con=(HttpURLConnection)u.openConnection();
	con.setConnectTimeout(2000);
	con.connect();
	if(con.getResponseCode()==200){
		System.out.println(ulink +"=== " + con.getResponseMessage());
	}else if(con.getResponseCode()==con.HTTP_NOT_FOUND){
		System.out.println(ulink +"=== " + con.getResponseMessage()+" --- "+ con.HTTP_NOT_FOUND);
	   }*/
}
