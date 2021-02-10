package Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Signin {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(@class,'login')]")).click();
		driver.findElement(By.id("email")).sendKeys("neshu1@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("Test@1");
		driver.findElement(By.id("SubmitLogin")).click();
		driver.findElement(By.xpath("//a[contains(@title,'Women')]")).click();
		driver.findElement(By.xpath("//a[contains(@title,'T-shirts')]")).click();	
		Actions obj = new Actions(driver);
		WebElement mouseOver=driver.findElement(By.xpath("(//*[@title='Women'])[1]"));
		obj.moveToElement(mouseOver).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@title='Casual Dresses'])[1]")).click();
		
	}

}
