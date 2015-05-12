package pageObjects;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	private static WebElement element = null;
	private static List<WebElement> AllData = null;
	
	public static WebElement link_Help(WebDriver driver){
		element = driver.findElement(By.xpath("//*[@id='pn5']/a/dl/dt"));
		return element;
		
	}
	
	public static WebElement subSection(WebDriver driver){
		element = driver.findElement(By.xpath("//*[@id='pn5']/ul/li"));
		return element;
	}
	
	public static WebElement contactUs(WebDriver driver){
		element = driver.findElement(By.xpath("//*[@id='pn5']/ul/li[5]/a[.='Contact us']"));
		return element;
	}
	
	public static WebElement technicalQuestionLink(WebDriver driver){
		element = driver.findElement(By.xpath("//a[contains(text(),'technical')]"));
		return element;
	}
	
	public static WebElement selectionLink(WebDriver driver){
		element = driver.findElement(By.xpath("//*[@id='acc1']/div[2]//p[starts-with(@id,'contacts')]"));
		return element;
	}
	
	public static WebElement payandGoLink(WebDriver driver){
		element = driver.findElement(By.xpath("//*[@id='acc1']/div[2]//a[.='Pay & Go Team']"));
		return element;
	}
	
	public static WebElement openingTimes(WebDriver driver){
		element = driver.findElement(By.xpath("//*[@id='acc1']/div[2]/div/div/div[2]/div[3]/div[2]/div/div/div[2]/table/thead/tr/th"));
		return element;
	}
	
	public static List<WebElement> getSubMenu(WebDriver driver){
		AllData = driver.findElements(By.xpath("//*[@id='pn5']/ul/li"));
		return AllData;
	}
         
       
}
