package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    public WebDriver ldriver;

    public LoginPage(WebDriver rdriver){
        ldriver = rdriver;
        PageFactory.initElements(ldriver,this);
    }

    @FindBy(name="uid")
    @CacheLookup
    WebElement useName;

    @FindBy(xpath="//input[@name='password']")
    @CacheLookup
    WebElement passWord;

    @FindBy(xpath="//input[@name='btnLogin']")
    @CacheLookup
    WebElement btnLogin;

    public void submitUserName(String txtUserName){
        WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(useName));
        useName.clear();
        useName.sendKeys(txtUserName);
    }

    public void submitPassWord(String txtPassWord){
        WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(passWord));
        passWord.clear();
        passWord.sendKeys(txtPassWord);
    }

    public void clickSubmitBtn(){
        WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(btnLogin));
        btnLogin.click();
    }
}
