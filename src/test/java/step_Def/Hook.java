package step_Def;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends Base {
	
	public int time = 20;
	public long maxtime = 20;
	@Before
	public void lanuch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(time));
		wait = new WebDriverWait(driver, Duration.ofSeconds(maxtime));
		driver.get("https://www.facebook.com/");

	}

	@After
	public void close() {
		driver.quit();
	}

}
