package keyBoardInteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardandMouseExample1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		// driver.get(&quot;https://www.amazon.in/&quot;);

		// driver.manage().window().maximize();
		// WebElement helloSignin=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));

		Actions actions=new Actions(driver); // Create an instance of Actions class

		// actions.moveToElement(helloSignin).build().perform(); //mouse over method

		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		WebElement

		rightClickBtn=driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));

		WebElement

		doubleClickBtn=driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		// actions.contextClick().build().perform();//right click
		actions.contextClick(rightClickBtn).build().perform(); // Perform a right-click on the Webelement
		WebElement editOption=driver.findElement(By.xpath("//span[contains(text(),'Edit')]"));

		// Move to the "Edit" option and click it
		actions.moveToElement(editOption).build().perform();
		actions.click().build().perform(); //just click
		driver.switchTo().alert().accept(); //accept the java alert
		Thread.sleep(3000);
		// Perform a double-click on the doubleClickBtn element
		actions.doubleClick().build().perform();
		actions.doubleClick(doubleClickBtn).build().perform();
		driver.switchTo().alert().accept();

	}

}
