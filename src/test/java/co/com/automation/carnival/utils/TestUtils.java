package co.com.automation.carnival.utils;

import net.serenitybdd.core.Serenity;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.WebElement;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;
import java.util.logging.Logger;

public class TestUtils extends PageObject{

	private static final Logger LOGGER = Logger.getLogger(TestUtils.class.getName());
	WebElement element = null;
	
	public void openBrowser() {
		
		openAt(getSerenityProperties("webdriver.base.url"));
		Serenity.getWebdriverManager().getWebdriver().manage().window().maximize();
		Serenity.takeScreenshot();
	}
	
	public static String getSerenityProperties(String variable) {
		EnvironmentVariables environmentVariables = null;
		String serenityValue = "";
		
		try {
			environmentVariables = SystemEnvironmentVariables.createEnvironmentVariables();
			serenityValue = environmentVariables.getProperty(variable);
		} catch (Exception e) {
			LOGGER.info("getSerenityProperties");
		}
		return serenityValue;
		
	}
	
	public String getTextObject(WebElement el) {
		try {
			String text = waitFor(el).getTextValue();
			Serenity.takeScreenshot();
			return text;
		} catch (Exception e) {
			LOGGER.info(el + "is not present");
			return null;
		}
		
	}
	
	public void clickElement(WebElement el) {
		try {
			el.click();
			Serenity.takeScreenshot();			
		} catch (Exception e) {
			LOGGER.info(el + "click error");
		}
		
	}
	
	public void setTextElement(WebElement el, String text) {
		try {
			el.sendKeys(text);
			Serenity.takeScreenshot();			
		} catch (Exception e) {
			LOGGER.info(el + "set text error");
		}
		
	}
	
	public Boolean getElementVisible(WebElement el) {
		if (el.isDisplayed()) {
			return true;
		}else {
			return false;
		}					
	}
	
	
	public void scrollPage(WebElement el) {
        try {
            	getJavascriptExecutorFacade().executeScript("arguments[0].scrollIntoView();", el);
                waitFor(2000).millisecond();
        }
        catch(Exception e) {
        	scrollPage(el);
        }
    }
	
	
	
}
