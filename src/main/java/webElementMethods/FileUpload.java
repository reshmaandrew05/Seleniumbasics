package webElementMethods;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lsn-User.DESKTOP-GLKVRGN\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		WebElement choosefile=driver.findElement(By.xpath("//input[@id='file-upload']"));
		String path="C:\\Users\\Lsn-User.DESKTOP-GLKVRGN\\Desktop\\Reshma_obsqura\\manual\\Notes\\1.png";
		//choosefile.sendKeys(path);
		File fi=new File(path);
		choosefile.sendKeys(fi.getAbsolutePath());

	}

}
