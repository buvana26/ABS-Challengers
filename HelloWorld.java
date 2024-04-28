package browser_invoke;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloWorld {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","c:\\Users\\omkku\\eclipse-workspace\\Bhuvana\\Learn-Selenium\\src\\test\\resources\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver1 = new FirefoxDriver();
		//WebDriver driver2 = new EdgeDriver	();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.findElement(By.id("inputUsername")).sendKeys("bhuvana");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("signInBtn")).click();
		driver.findElement(By.cssSelector("button.logout-btn")).click();
		/*driver.findElement(By.id("inputUsername")).sendKeys("bhuvana");
		driver.findElement(By.name("inputPassword")).sendKeys("sadasd");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Bhuvana");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("abc@gmssail.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("abc@gmail.com");
		
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("45454554");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".go-to-login-btn")).click();
		//System.out.println(driver.findElement(By.cssSelector("p")).getText());
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[value*='rmbr']")).click();
		driver.findElement(By.xpath("//input[contains(@value,'agree')]")).click();
		driver.findElement(By.id("inputUsername")).sendKeys("bhuvana");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("signInBtn")).click();
		
		System.out.println(driver.findElement(By.className("login-container")).getText());*/
		
		
		
		
		
		//driver.close();
		//driver1.close();
		
	}

}
