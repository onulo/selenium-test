package seleniumTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
	private WebDriver driver;

	@Before
	public void init() {
		driver = new ChromeDriver();
	}

	@Test
	public void firstTest() {
		driver.get("https://google.com/");
		Assert.assertEquals("Google", driver.getTitle());
		driver.quit();
	}

	@After
	public void tearDown() {
		driver.quit();
	}

}
