package keyBoardInteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DragandDropExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
		    driver.get("https://demo.guru99.com/test/drag_drop.html");
		    driver.manage().window().maximize();
		    Actions actions=new Actions(driver);
		    WebElement source=driver.findElement(By.xpath("(//a[contains(text(),'5000')])[2]"));
		    WebElement destination=driver.findElement(By.xpath("(//ol[@class='field13 ui-droppable ui-sortable'])[1]"));
		    actions.dragAndDrop(source, destination).build().perform(); //to perform drag and drop action

	}

}
