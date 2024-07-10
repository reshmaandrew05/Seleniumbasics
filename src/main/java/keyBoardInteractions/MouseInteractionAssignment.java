package keyBoardInteractions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseInteractionAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
		    driver.get("https://selenium.qabible.in/check-box-demo.php");
		    driver.manage().window().maximize();
		    Actions actions=new Actions(driver);
		    List <WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
		    for(WebElement we:checkboxes)
		    {
		    	actions.moveToElement(we).build().perform();
		    	actions.click().build().perform();
		    }

	}

}
