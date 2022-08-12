package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class TestPage {
    public WebDriver ldriver;

    public TestPage(WebDriver rdriver){
      ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }

//    @FindBy(id="Email")
//    @CacheLookup
//    WebElement txtEmail;
//
//    @FindBy(id="Password")
//    @CacheLookup
//    WebElement txtPassword;
//
//    @FindBy(xpath = "//button[text()='Log in']")
//    @CacheLookup
//    WebElement btnLogin;
//
//    @FindBy(linkText = "Logout")
//    @CacheLookup
//    WebElement lnkLogout;

//    public void openUrl(String identifier){
//        System.out.printf("Page url:="+identifier);
//        ldriver.get(ldriver.findElement(By.xpath(ObjectProperties.getElementProperty(identifier))).toString());
//    }

//    public void setUserName(String uname){
////        txtEmail=ldriver.findElement(By.xpath(ObjectProperties.getElementProperty(identifier)));
//        txtEmail.clear();
//        txtEmail.sendKeys(uname);
//    }
//
//    public void setPassword(String pwd){
////        txtPassword=ldriver.findElement(By.xpath(ObjectProperties.getElementProperty(identifier)));
//        txtPassword.clear();
//        txtPassword.sendKeys(pwd);
//    }
//
//    public void clickLogin(){
////        btnLogin=ldriver.findElement(By.xpath(ObjectProperties.getElementProperty(identifier)));
//        btnLogin.click();
//    }
//
//    public void clickLogout(){
//        lnkLogout.click();
//    }

    public void checkQuest() {
        if(!ldriver.findElements(By.xpath("//section//article")).isEmpty()) {
            Assert.assertTrue(true);
        }else{
            Assert.assertFalse(true);
        }
    }

    public void book() throws InterruptedException {
        ldriver.findElement(By.xpath("//a[text()='Skylifts']")).click();
        ldriver.wait(2000L);
        ldriver.findElement(By.xpath("(//button//span[text()='View'])[1]")).click();
        ldriver.wait(2000L);
        ldriver.findElement(By.xpath("(//button//span[text()='Book this Skylift'])[1]")).click();
        ldriver.wait(1000L);
        Assert.assertTrue(ldriver.findElement(By.xpath("//p[text()='Login to continue']")).isDisplayed());

        //Login requires to enter data and OTP on mail so cannot automate that right now.
    }

    public void scrapeCards() throws InterruptedException {

    }
}
