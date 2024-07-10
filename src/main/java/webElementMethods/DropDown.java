package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lsn-User.DESKTOP-GLKVRGN\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement submitbutton=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select select=new Select(submitbutton);
		select.selectByIndex(2);//dropdown select by index
		select.selectByValue("search-alias=amazon-pharmacy");//dropdown select by value
		select.selectByVisibleText("Amazon Fashion");//dropdown select by visible text
		//System.out.println(select.getOptions());

	}

}
