package TestcaseSwagLb;

import org.testng.annotations.Test;

import java.sql.Driver;
import java.time.Duration;

import org.testng.annotations.Test;
import KeywordLab.KeywordsSwagLab;
import Page.LoginPageSwagLab;
import base1lab.testbaselab;

public class LoginTestcases extends testbaselab {

	private static final String text = null;
	@Test
	public void login() {
		KeywordsSwagLab keyword = new KeywordsSwagLab();
		LoginPageSwagLab login = new LoginPageSwagLab(); // use pageobject module
		login.enterUsernamee("standard_user");
		login.enterPassword("secret_sauce");
		login.clickonLogin(login);
		
		keyword.acceptAlert();
	}

	@Test
	public void toVerifyThatPasswordIsRequiredOrNot() {
		KeywordsSwagLab keyword = new KeywordsSwagLab();
		LoginPageSwagLab login = new LoginPageSwagLab();
		login.enterUsernamee("locked_out_user");
		login.clickonLogin(login);

	}

	@Test
	public void toVerifyThatUsernameIsRequiredOrNot() {
		KeywordsSwagLab keyword = new KeywordsSwagLab();
		LoginPageSwagLab login = new LoginPageSwagLab();
		login.enterPassword("secret_sauce");
		login.clickonLogin(login);
	}

	@Test
	public void toVerifyThatIfPasswordIsIncorrect() {
		KeywordsSwagLab keyword = new KeywordsSwagLab();
		LoginPageSwagLab login = new LoginPageSwagLab();
		login.enterUsernamee("locked_out_user");
		login.enterPassword("ss");
		login.clickonLogin(login);

		System.out.print(login.getErrorMessage(text));
	}
}
