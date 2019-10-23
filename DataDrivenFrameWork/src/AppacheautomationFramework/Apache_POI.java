package AppacheautomationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import appModules.SignIn_Action;
import pageObjects.Home_Page;
import utility.Constant;
import utility.ExcelUtils;

public class Apache_POI {

	private static WebDriver driver = null;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

	ExcelUtils.setExcellFile(Constant.Path_Testdata, Constant.File_testdata);
	driver = new FirefoxDriver();
	
		driver.get(Constant.URL);
		
		SignIn_Action.Execute(driver);
		System.out.println("Login successfully, now is the time to log off the application.");
		Home_Page.logout(driver).click();
		driver.quit();
		// Pass the result to excel file
		
		ExcelUtils.setCellData("Pass",1, 3);
	}

}
