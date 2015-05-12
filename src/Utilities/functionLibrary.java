package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
public class functionLibrary {
 
	public static void maximizeWindow(WebDriver driver){
		
		driver.manage().window().maximize();
		
	}
	
	public static void scrollTo(WebDriver driver, WebElement element) {
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", element);
    }

}
