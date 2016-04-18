import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		
		// Create Firefox driver to drive the browser
		WebDriver driver = new FirefoxDriver();
		// Open Google home page
		driver.get("http://www.google.com");
		// Find search field and enter Selenium
		Thread.sleep(2000);
		driver.findElement(By.id("gsr")).sendKeys("Selenium");
		// Find search button and click on it
		Thread.sleep(2000);
		driver.findElement(By.name("btnG")).click();
		// From job search results page, get page title and count message
		//searchCount
				
		System.out.println(driver.getTitle());
		System.out.println(driver.findElement(By.id("resultStats")).getText());
		
		driver.close();	
	}

}
