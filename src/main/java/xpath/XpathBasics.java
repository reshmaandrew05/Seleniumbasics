package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathBasics {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Lsn-User.DESKTOP-GLKVRGN\\Desktop\\driver\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//xpath=syntax- //tagName[@attribute='value']
		//WebElement searchfield=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		//searchfield.sendKeys("Shoes");
		//WebElement searchfield1=driver.findElement(By.xpath("//span[@class='nav-search-submit-text nav-sprite nav-progressive-attribute']//input[@class='nav-input nav-progressive-attribute']"));
		//searchfield1.click();
		//WebElement showbutton=driver.findElement(By.xpath("//button[text()='Show Message']"));
		//showbutton.click();
		WebElement address=driver.findElement(By.xpath("//span[contains(text(),'Update')]"));
		address.click();
		
		

	}

}
