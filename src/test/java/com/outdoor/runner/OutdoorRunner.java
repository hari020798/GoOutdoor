package com.outdoor.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//outdoor//feature",
glue = "com.outdoor.stepdef",
dryRun = false,
strict = true,
tags = ("@Scenario1, @Scenario2, @Scenario3"),
plugin = {"html:Reports/Html_Report",
		  "pretty",
		  "json:Reports/Json_Report.json",
		  "com.cucumber.listener.ExtentCucumberFormatter:Reports/Extent_Report.html"
},
snippets = SnippetType.CAMELCASE)

public class OutdoorRunner {
	public static WebDriver driver;

	@BeforeClass
	public static void runnercl() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
