package Page;

import java.time.Duration;
import java.util.ArrayList;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;

import com.trinity.base.TestBase;

import KeywordLab.KeywordsSwagLab;
import base1lab.testbaselab;

public class LoginPageSwagLab {

	@FindBy(css ="input#user-name")
	public WebElement Usernamee;
	
	@FindBy(css ="input#password")
	public WebElement Password;
	
	@FindBy(css= "input#login-button")
	public WebElement Login;
	
	@FindBy(xpath="//h3[text()='Username and password do not match any user in this service']")
	public static WebElement errorMessage;
	
	public LoginPageSwagLab() {
		PageFactory.initElements(KeywordsSwagLab.getDriver(),this);
	}

	public void enterUsernamee(String text) {
	Usernamee.sendKeys(text);
	}
	public void enterPassword(String text) {
    Password.sendKeys(text);
	}
	public void clickonLogin(Object driver) {
	Login.click();
	 FluentWait wait = new FluentWait(driver);
	 wait.withTimeout(Duration.ofSeconds(2));
	 wait.pollingEvery(Duration.ofMillis(300));
	 wait.withMessage("waited to long but didnt appar");
	 
	 ArrayList exceptions = new ArrayList<Exception>();
	 exceptions.add(NoSuchElementException.class);
	 exceptions.add(IllegalArgumentException.class);
	 wait.ignoreAll(exceptions);
	 
	}

	
	public static String getErrorMessage(String text) {
	return errorMessage.getText();
	}

		
	}

	
	
