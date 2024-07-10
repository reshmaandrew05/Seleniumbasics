package elementLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ElementLocators {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\Lsn-User.DESKTOP-GLKVRGN\\Desktop\\driver\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement searchfield =  driver.findElement(By.id("twotabsearchtextbox"));//id selector
		searchfield.click();
		searchfield.sendKeys("Mobile");
		searchfield.clear();
		searchfield.sendKeys("dress");
		searchfield.clear();
		//WebElement searchbutton=driver.findElement(By.className(".nav-search-dropdown.searchSelect.nav-progressive-attrubute.nav-progressive-search-dropdown"));
		//searchbutton.click();
		WebElement searchfield1 = driver.findElement(By.className(".nav-input.nav-progressive-attribute"));//classname selector
		searchfield1.click();
		WebElement allfield=driver.findElement(By.tagName("select"));//tag name selector
		allfield.click();
		

	}

}
