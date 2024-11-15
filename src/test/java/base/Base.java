package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
	public static WebDriver driver = null;
	public static WebDriverWait wait = null;

	public void click(WebElement element) {
		element.click();
	}

	public void EnterText(WebElement element, String text) {
		element.click();
		element.clear();
		element.sendKeys(text);
	}

	public void selectbyvalue(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByValue(text);

	}

	public void selectbyindex(WebElement element, int value) {
		Select select = new Select(element);
		select.selectByIndex(value);
	}

	public void selectbyvisible(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	public void Alert() {
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		alert.accept();

	}

	
}
