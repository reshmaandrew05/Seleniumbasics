package keyBoardInteractions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class KeyBoardandMouseExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement

		searchField=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Actions actions=new Actions(driver); // Create an instance of Actions class
		//By passing the WebDriver instance to the Actions constructor, you enable the Actions class to interact with the web elements and execute commands in the browser.
		actions.clickAndHold(searchField).build().perform(); // Click and hold the search field

		actions.release(searchField).build().perform(); // Release the click
		actions.sendKeys(searchField,"Phone").build().perform(); // Enter "Phone" in the search field

		actions.sendKeys(Keys.ENTER).build().perform(); // Press the Enter key
		driver.close();
	}

}
