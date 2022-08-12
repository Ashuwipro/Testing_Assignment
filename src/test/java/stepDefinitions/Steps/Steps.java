package stepDefinitions.Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.TestPage;

import java.util.List;

public class Steps {

    public WebDriver driver;
    public TestPage lp;

    @Given("User Launch Chrome browser")
    public void user_launch_safari_browser() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        lp = new TestPage(driver);

    }

    @When("User opens url {string}")
    public void user_opens_url(String url) {
        driver.get(url);
    }

    @Then("Validate one quest is present")
    public void validateOneQuestIsPresent() {
        lp.checkQuest();
    }

    @Then("close browser")
    public void closeBrowser() {
        driver.close();
    }

    @Then("try to book the skylift")
    public void tryToBookTheSkylift() throws InterruptedException {
        lp.book();
    }

    @Then("Scrape all cards title price link")
    public void scrapeAllCardsTitlePriceLink() throws InterruptedException {
        lp.scrapeCards();
    }
}
