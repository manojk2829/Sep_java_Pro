package all_Java_Practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.annotations.VisibleForTesting;

public class Remove_Duplicate_Character {

	public static void main(String[] args) {
		String str = "manoj Kushwaha Kushwaha";
		Set<Character> remove = new HashSet();
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<str.length();i++) {
			Character ch=str.charAt(i);
			if(!remove.contains(ch)){
				remove.add(ch);
				sb.append(ch);
			}
		}
		System.out.println(sb.toString() +"  ");
		System.setProperty("webdriver.chrome.driver", "D:\\Software Selenium\\Browser_exe\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		
		DesiredCapabilities dc=new DesiredCapabilities().chrome();
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
		
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement ele=dr.findElement(By.id("manoj"));
		WebDriverWait wait=new WebDriverWait(dr,10);
		wait.until(ExpectedConditions.visibilityOf(ele));
		dr.findElement(By.id("")).sendKeys(Keys.SHIFT,"Manoj Kuswaha");
		Set<String> set = dr.getWindowHandles();
		Iterator<String> it=set.iterator();
		it=set.iterator();
		it.next();//1
		it.next();//2
		String thridWindow=it.next();
		dr.switchTo().window(thridWindow);
		
		//syntext == //input[@name='']
		
	}
}
