package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lsn-User.DESKTOP-GLKVRGN\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/jquery-select.php");
		driver.manage().window().maximize();
		WebElement arrowdown=driver.findElement(By.xpath("//span[@class='select2-selection__arrow']"));
		arrowdown.click();
		WebElement dropdown=driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		dropdown.sendKeys("Alaska");
		WebElement click=driver.findElement(By.xpath("//input[@id='select2-3q7r-result-myvy-AK']"));
		click.click();
		WebElement arrowdown1=driver.findElement(By.xpath("//span[@class='select2-selection__arrow']"));
		arrowdown1.click();
		WebElement hawai=driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		dropdown.sendKeys("Hawai");
		WebElement hawaiclick=driver.findElement(By.xpath("//input[@id='select2-p8kc-result-hyr9-HI']"));
		hawaiclick.click();
		
		
		/*cursorBlink.sendKeys("Hawaii");
		WebElement option1=driver.findElement(By.xpath("//li[contains(text(),'Hawaii')]"));
		option1.click();
		//WebElement submit=driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		//submit.sendKeys("Hawaii");*/

	}

}
