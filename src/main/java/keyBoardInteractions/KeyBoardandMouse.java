package keyBoardInteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardandMouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

		search.sendKeys("mouse"+Keys.ENTER);
		search.sendKeys("One Plus Nord 3"+Keys.BACK_SPACE);//remove one key
		search.sendKeys(Keys.chord(Keys.CONTROL,"a")); //remove entire
		search.sendKeys(Keys.BACK_SPACE);

	}

}
