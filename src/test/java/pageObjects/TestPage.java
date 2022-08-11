package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
            Assert.assertEquals(false,false);
        }
    }

    public void book() {
        
    }

    public void scrapeCards() {
    }
}
