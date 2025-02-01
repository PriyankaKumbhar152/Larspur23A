package TestcaseSwagLb;

import org.testng.annotations.Test;

import KeywordLab.KeywordsSwagLab;
import Page.HomepageSwagLab;
import Page.LoginPageSwagLab;
import Page.addToCartSwagLab;
import Page.checkOutLabPage;
import Page.finishLabPage;
import Page.overViewPageLab;
import base1lab.testbaselab;

public class HomepageTestcase extends testbaselab{
	 
	private static final String text = null;
	@Test
	public void toCheckBagImage() {
		KeywordsSwagLab keyword = new KeywordsSwagLab();
		LoginPageSwagLab login = new LoginPageSwagLab(); // use pageobject module
		login.enterUsernamee("standard_user");
		login.enterPassword("secret_sauce");
		login.clickonLogin(login);
		
		keyword.acceptAlert();
		
		HomepageSwagLab home =new HomepageSwagLab();            //for handling dropdown list
		home.selectDropDownList();
		home.clickOnBagImage(home);
		
		addToCartSwagLab addtocart = new addToCartSwagLab();
		 addtocart.checkAddListBagImage(addtocart);
		 
		checkOutLabPage check = new checkOutLabPage();
		check.clickonCheckOutPage(check); 
		check.clickonFirstname("Priyanka");
		check.clickonLastname("Kumbhar");
		check.clickOnZipcode("410501");
		
		overViewPageLab overview = new overViewPageLab();
		overview.clickonContinue();
		
		finishLabPage finish = new finishLabPage();
		finish.clickonfinish(finish);
		System.out.println(finish.finishPageGetMessage(text));
		
		System.out.println("show bag image");
   }

	@Test
	public void clickOnBikeLight() {
		KeywordsSwagLab keyword = new KeywordsSwagLab();
		LoginPageSwagLab login = new LoginPageSwagLab(); // use pageobject module
		login.enterUsernamee("standard_user");
		login.enterPassword("secret_sauce");
		login.clickonLogin(login);
		
		keyword.acceptAlert();
		
		HomepageSwagLab home =new HomepageSwagLab();
		home.clickOnBikeLight(home);
		
		addToCartSwagLab addtocart = new addToCartSwagLab();
		 addtocart.checkAdddListBikeLight(addtocart);
		 
		 checkOutLabPage check = new checkOutLabPage();
			check.clickonCheckOutPage(check); 
			check.clickonFirstname("saee");
			check.clickonLastname("kumbhar");
			check.clickOnZipcode("3344");
			overViewPageLab overview = new overViewPageLab();
			overview.clickonContinue();
			
			finishLabPage finish = new finishLabPage();
			finish.clickonfinish(finish);
			System.out.println(finish.finishPageGetMessage(text));
			System.out.println("show bag image");
	}
	@Test
	public void clickOnBoltTShirt() {
		KeywordsSwagLab keyword = new KeywordsSwagLab();
		LoginPageSwagLab login = new LoginPageSwagLab(); // use pageobject module
		login.enterUsernamee("standard_user");
		login.enterPassword("secret_sauce");
		login.clickonLogin(login);
		
		keyword.acceptAlert();
		HomepageSwagLab home =new HomepageSwagLab();
		home.clickOnBoltTShirt(home);

		addToCartSwagLab addtocart = new addToCartSwagLab();
		 addtocart.checkAdddListBoldTShirt(addtocart);
		 
		 checkOutLabPage check = new checkOutLabPage();
			check.clickonCheckOutPage(check); 
			check.clickonFirstname("ankita");
			check.clickonLastname("kumbhar");
			check.clickOnZipcode("3344");
			overViewPageLab overview = new overViewPageLab();
			overview.clickonContinue();
			
			finishLabPage finish = new finishLabPage();
			finish.clickonfinish(finish);
			System.out.println(finish.finishPageGetMessage(text));
		 
		System.out.println("show bag image");
	}
    
	@Test
	public void clickOnFleeceJacket() {
		KeywordsSwagLab keyword = new KeywordsSwagLab();
		LoginPageSwagLab login = new LoginPageSwagLab(); // use pageobject module
		login.enterUsernamee("standard_user");
		login.enterPassword("secret_sauce");
		login.clickonLogin(login);
		
		keyword.acceptAlert();
		HomepageSwagLab home =new HomepageSwagLab();
		home.clickOnFleeceJacket(home);

	     addToCartSwagLab addtocart = new addToCartSwagLab();
		 addtocart.checkAdddListFleeceJacket(addtocart);
		 
		 checkOutLabPage check = new checkOutLabPage();
			check.clickonCheckOutPage(check); 
			check.clickonFirstname("ankita");
			check.clickonLastname("kumbhar");
			check.clickOnZipcode("3344");
			overViewPageLab overview = new overViewPageLab();
			overview.clickonContinue();
			
			finishLabPage finish = new finishLabPage();
			finish.clickonfinish(finish);
			System.out.println(finish.finishPageGetMessage(text));
		 
		 System.out.println("show bag image");
	}
   
	@Test
	public void clickOnOnesies() {
		KeywordsSwagLab keyword = new KeywordsSwagLab();
		LoginPageSwagLab login = new LoginPageSwagLab(); // use pageobject module
		login.enterUsernamee("standard_user");
		login.enterPassword("secret_sauce");
		login.clickonLogin(login);
		
		keyword.acceptAlert();
		HomepageSwagLab home =new HomepageSwagLab();
		home.clickOnOnesies(home);
		
		addToCartSwagLab addtocart = new addToCartSwagLab();
		 addtocart.checkAdddListOnesies(addtocart);
		 
		 checkOutLabPage check = new checkOutLabPage();
			check.clickonCheckOutPage(check); 
			check.clickonFirstname("ankita");
			check.clickonLastname("kumbhar");
			check.clickOnZipcode("3344");
			overViewPageLab overview = new overViewPageLab();
			overview.clickonContinue();
			
			finishLabPage finish = new finishLabPage();
			finish.clickonfinish(finish);
			System.out.println(finish.finishPageGetMessage(text));
		 
		 
		System.out.println("show bag image");
	}
    @Test
	public void clickOnTShirtRed() {
		KeywordsSwagLab keyword = new KeywordsSwagLab();
		LoginPageSwagLab login = new LoginPageSwagLab(); // use pageobject module
		login.enterUsernamee("standard_user");
		login.enterPassword("secret_sauce");
		login.clickonLogin(login);
		
		keyword.acceptAlert();
		HomepageSwagLab home =new HomepageSwagLab();
		home.clickOnTShirtRed(home);

		addToCartSwagLab addtocart = new addToCartSwagLab();
		 addtocart.checkAdddListTShirtRed(addtocart);
		 
		 checkOutLabPage check = new checkOutLabPage();
			check.clickonCheckOutPage(check); 
			check.clickonFirstname("ankita");
			check.clickonLastname("kumbhar");
			check.clickOnZipcode("3344");
			overViewPageLab overview = new overViewPageLab();
			overview.clickonContinue();
			
			finishLabPage finish = new finishLabPage();
			finish.clickonfinish(finish);
			System.out.println(finish.finishPageGetMessage(text));
		 
		 
		System.out.println("show bag image");
	}
    
}
