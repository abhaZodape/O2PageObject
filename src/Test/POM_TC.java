package Test;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Assert;

import pageObjects.HomePage;
import Utilities.functionLibrary;

public class POM_TC {

	private static WebDriver driver = null;
	private static final String BASE_URL = "https://www.o2.co.uk/";
	private static String textFromUI = null;
	
	public static void main(String[] args){
		
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(BASE_URL);
		HomePage.link_Help(driver).click();
		Iterator<WebElement> itr = HomePage.getSubMenu(driver).iterator();
		while(itr.hasNext()){
			System.out.println(itr.next().getAttribute("href"));
			System.out.println(itr.next().getText());
		}
		
	    
		HomePage.contactUs(driver).click();
		functionLibrary.maximizeWindow(driver);
		HomePage.technicalQuestionLink(driver).click();
		HomePage.selectionLink(driver).click();
		HomePage.payandGoLink(driver).click();
//		functionLibrary objfunc = new functionLibrary();
		functionLibrary.scrollTo(driver, HomePage.openingTimes(driver));
		textFromUI = HomePage.openingTimes(driver).getText();
		System.out.println("The text we get"+textFromUI);
		try{
			Assert.assertEquals(textFromUI, "Opening times");
			System.out.println("The actual text"+textFromUI+"expected text"+"Opening times");
		}catch(Exception e){
			System.out.println("The actual text"+textFromUI+"not equal to expected text"+"Opening times");
		}
		
		
		driver.quit();
		
		
		
	
		
				
	}
}
