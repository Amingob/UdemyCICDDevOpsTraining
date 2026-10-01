package testcases;

import basetest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test(priority = 1)
    public void loginTestWithValidUserNameAndValidPassword() throws InterruptedException {

        wdriver.get("https://demo.guru99.com/V4/");
        logger.info("Test has Started");
        if(wdriver.getTitle().equals("Guru99 Bank Home Page")){
            Assert.assertTrue(true);
        }else{
            Assert.assertTrue(false);
        }
        loginPage.submitUserName(userName);
        loginPage.submitPassWord(passWord);
        loginPage.clickSubmitBtn();
        if(wdriver.getTitle().equals("Guru99 Bank Manager HomePage")){
            Assert.assertTrue(true);
        }else{
            Assert.assertTrue(false);
        }
        logger.info("Test has finished");
        Thread.sleep(1000);
    }

    @Test(priority = 2)
    public void loginTestWithInValidUserNameAndValidPassword() throws InterruptedException {

        wdriver.get("https://demo.guru99.com/V4/");
        logger.info("Test has Started");
        if(wdriver.getTitle().equals("Guru99 Bank Home Page")){
            Assert.assertTrue(true);
        }else{
            Assert.assertTrue(false);
        }

        loginPage.submitUserName(userName + "2000");
        loginPage.submitPassWord(passWord);
        loginPage.clickSubmitBtn();
        if(wdriver.getTitle().equals("Guru99 Bank Manager HomePage")){
            Assert.assertTrue(true);
        }else{
            Assert.assertTrue(false);
        }
        logger.info("Test has finished");
        Thread.sleep(1000);
    }

    @Test(priority = 3)
    public void loginTestWithValidUserNameAndInValidPassword() throws InterruptedException {

        wdriver.get("https://demo.guru99.com/V4/");
        logger.info("Test has Started");
        if(wdriver.getTitle().equals("Guru99 Bank Home Page")){
            Assert.assertTrue(true);
        }else{
            Assert.assertTrue(false);
        }

        loginPage.submitUserName(userName );
        loginPage.submitPassWord(passWord + "2000");
        loginPage.clickSubmitBtn();
        if(wdriver.getTitle().equals("Guru99 Bank Manager HomePage")){
            Assert.assertTrue(true);
        }else{
            Assert.assertTrue(false);
        }
        logger.info("Test has finished");
        Thread.sleep(1000);

    }

    @Test(priority = 4)
    public void loginTestWithInValidUserNameAndInValidPassword() throws InterruptedException {

        wdriver.get("https://demo.guru99.com/V4/");
        logger.info("Test has Started");
        if(wdriver.getTitle().equals("Guru99 Bank Home Page")){
            Assert.assertTrue(true);
        }else{
            Assert.assertTrue(false);
        }
        loginPage.submitUserName(userName + "2000");
        loginPage.submitPassWord(passWord + "2000");
        loginPage.clickSubmitBtn();
        if(wdriver.getTitle().equals("Guru99 Bank Manager HomePage")){
            Assert.assertTrue(true);
        }else{
            Assert.assertTrue(false);
        }
        logger.info("Test has finished");
        Thread.sleep(1000);
    }

    @Test(priority = 5)
    public void loginTestWithNoUserNameAndNoPassword() throws InterruptedException {

        wdriver.get("https://demo.guru99.com/V4/");
        logger.info("Test has Started");
        if(wdriver.getTitle().equals("Guru99 Bank Home Page")){
            Assert.assertTrue(true);
        }else{
            Assert.assertTrue(false);
        }

        loginPage.submitUserName(" ");
        loginPage.submitPassWord( " ");
        loginPage.clickSubmitBtn();
        if(wdriver.getTitle().equals("Guru99 Bank Manager HomePage")){
            Assert.assertTrue(true);
        }else{
            Assert.assertTrue(false);
        }
        logger.info("Test has finished");
        Thread.sleep(1000);
    }
}
