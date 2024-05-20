package com.outdoor.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.outdoor.runner.OutdoorRunner;

import cucumber.api.java.en.Given;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OutdoorStep {
	public static WebDriver driver = OutdoorRunner.driver;

	@Given("^user launch the web application$")
	public void userLaunchTheWebApplication() throws Throwable {
		driver.get("https://www.gooutdoors.co.uk/");

	}

	@When("^user accepting the cookies$")
	public void userAcceptingTheCookies() throws Throwable {
		driver.findElement(By.xpath("//div[@class='banner-actions-container']/button[text()='Accept All Cookies']"))
				.click();

	}


	@Then("^user login in the gooutdoor$")
	public void userLoginInTheGooutdoor() throws Throwable {
		driver.findElement(By.xpath("//a[text()='Login/Register']")).click();
		WebElement Email = driver.findElement(By.xpath("//input[@id='email_address']"));
		Email.sendKeys("Husseyhari@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("Hari@123");
		driver.findElement(By.xpath("//input[@id='blacks-member-login']")).click();
		WebElement men = driver.findElement(By.xpath("//a[.='Men']"));

		Actions a = new Actions(driver);
		a.moveToElement(men).perform();
		/*WebElement cJ = driver.findElement(By.xpath(
				"(//span[@class='nav-level-1'][2]/h2/following-sibling::span/div/div/button/following::ul/li//a[text()='Casual Jackets'])[1]"));
		
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("arguments[0].scrollIntoView();", cJ);
		cJ.click();*/
	}
	
	

	@Given("^user Selecting the Jacket section in the Men's Section and it's navigated to Mens dress section$")
	public void userSelectingTheJacketSectionInTheMenSSectionAndItSNavigatedToMensDressSection() throws Throwable {
	System.out.println("Skipped");
	WebElement men = driver.findElement(By.xpath("//a[.='Men']"));

	Actions a = new Actions(driver);
	a.moveToElement(men).perform();
	WebElement cJ = driver.findElement(By.xpath(
			"(//span[@class='nav-level-1'][2]/h2/following-sibling::span/div/div/button/following::ul/li//a[text()='Casual Jackets'])[1]"));
	
	JavascriptExecutor jk = (JavascriptExecutor) driver;
	jk.executeScript("arguments[0].scrollIntoView();", cJ);
	cJ.click();
	}

	@When("^user clicked the jacket$")
	public void userClickedTheJacket() throws Throwable {
		driver.findElement(By.xpath("//article[@data-id='15998147']")).click();

	}

	@When("^user selecting the Size of the jacket$")
	public void userSelectingTheSizeOfTheJacket() throws Throwable {
		driver.findElement(By.xpath("//a[@data-id='4']")).click();

	}

	@When("^user selecting the Quantity of the jacket$")
	public void userSelectingTheQuantityOfTheJacket() throws Throwable {
		WebElement input = driver.findElement(By.xpath("//input[@id='product_quantity']"));
		input.sendKeys(Keys.BACK_SPACE);
		input.sendKeys("1");
	}

	@Then("^user adding the Item and checking Out$")
	public void userAddingTheItemAndCheckingOut() throws Throwable {
		driver.findElement(By.xpath("//input[@value='Add to basket']")).click();
		driver.findElement(By.xpath("//span[text()='Checkout']")).click();
	}

	@Given("^user adding one more quantity$")
	public void userAddingOneMoreQuantity() throws Throwable {
		WebElement inc = driver.findElement(By.xpath("//button[text()='+']"));
		inc.click();
		inc.getText();
		System.out.println(inc.getText());
		Thread.sleep(2000);
	}

	@When("^user Selecting the Delivery options$")
	public void userSelectingTheDeliveryOptions() throws Throwable {
		WebElement add = driver.findElement(By.xpath("//span[text()='Next Day Delivery (order by 5pm Sun - Fri)']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", add);
		add.click();
	}

	@Then("^user chekingout$")
	public void userChekingout() throws Throwable {

		WebElement cOUT = driver.findElement(By.xpath("//input[@value='Checkout securely']"));
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView();", cOUT);
		cOUT.click();
		System.out.println("done");
	}

}
