package base1lab;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import KeywordLab.KeywordsSwagLab;

public class testbaselab {
    
public static Object KeywordsSwagLab;
KeywordsSwagLab keyword= new KeywordsSwagLab();



//@Parameters("env")


@BeforeMethod
public void setup()throws Exception {
	KeywordsSwagLab keyword= new KeywordsSwagLab();
	keyword.openBrowser(Configlab.getBrowserName());
	keyword.maximizeBrowser();
	keyword.openUrl(Configlab.getAppUrl("stage"));

}

@AfterMethod
public void closeBrowser()throws Exception {
//keyword.quitAllWindows();
}
}



