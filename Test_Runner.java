package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.helper.FileReaderManager;
import com.base_class.Base_Classse;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//adactin//feature",glue = "com.adactin.stepdefinition")
public class Test_Runner {
	public static WebDriver driver;
	@BeforeClass
	public static void setup() throws Throwable {
		
		String browser = FileReaderManager.getIstance().getIstanceCR().getBrowser();
		driver= Base_Classse.getbrowser(browser);
	}

	@AfterClass
	public static void teardown() {
	//	Base_Classse.driver.close();

	}

}
