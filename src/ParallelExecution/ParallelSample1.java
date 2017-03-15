package ParallelExecution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ParallelSample1 {
	public WebDriver driver;
	
	@BeforeTest
	public void browserSetup(){
		System.setProperty("webdriver.chrome.driver", "E:\\Automation_Tools\\Executable_Driver\\chromedriver.exe");
//		driver = new ChromeDriver();
		driver = new FirefoxDriver();
		driver.get("https://www.mrvoonik.com");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	@Test
	public void sample1(){
		System.out.println("Now running sample1.");
	}
	@Test
	public void sample2(){
		System.out.println("Now running sample2.");
	}
	@Test
	public void sample3(){
		System.out.println("Now running sample3.");
	}
	
}
