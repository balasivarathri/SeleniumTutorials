package Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Signup {

	public static void main(String[] args) throws InterruptedException {
		//To start the browser
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		//To launch the application
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		//To get the page title
		//System.out.println(driver.getTitle());
		//click on sign in link
		driver.findElement(By.xpath("//a[contains(@class,'login')]")).click();
		//maximise the screen
		driver.manage().window().maximize();
		//Enter email id in the text box
		driver.findElement(By.id("email_create")).sendKeys("neshu0@gmail.com");
		//click on create button
		driver.findElement(By.id("SubmitCreate")).click();
		//apply wait command
		Thread.sleep(5000);
		//select mr radio button
		driver.findElement(By.id("id_gender1")).click();
		//select mrs radio button
		//driver.findElement(By.id("id_gender2")).click();
		//enter first name
		driver.findElement(By.id("customer_firstname")).sendKeys("bala krishna");
		//enter lastname
		driver.findElement(By.id("customer_lastname")).sendKeys("sivarathri");
		//enter email
		driver.findElement(By.id("passwd")).sendKeys("Test@1");
		//select value from dropdowns
		Select days = new Select(driver.findElement(By.id("days")));
		days.selectByValue("4");
		Select months = new Select(driver.findElement(By.id("months")));
		months.selectByValue("4");		
		Select years = new Select(driver.findElement(By.id("years")));
		years.selectByValue("1988");
		//select the check boxes
		driver.findElement(By.id("newsletter")).click();
		driver.findElement(By.id("optin")).click();
		driver.findElement(By.id("company")).sendKeys("test");
		//adress details via xpath
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("H.No:34,Madharam");
		driver.findElement(By.id("address2")).sendKeys("Singareni");
		driver.findElement(By.id("city")).sendKeys("Khammam");
		//select the value in dropdown
		Select state = new Select(driver.findElement(By.id("id_state")));
		state.selectByValue("43");
		driver.findElement(By.id("postcode")).sendKeys("73301");
		Select country = new Select(driver.findElement(By.id("id_country")));
		country.selectByValue("21");
		driver.findElement(By.id("other")).sendKeys("hi mama how was it?");
		driver.findElement(By.id("phone_mobile")).sendKeys("9959855206");
		driver.findElement(By.id("submitAccount")).click();
		driver.findElement(By.xpath("//a[contains(@class,'logout')]")).click();
		//close the browser
		driver.close();
		
	}
}
