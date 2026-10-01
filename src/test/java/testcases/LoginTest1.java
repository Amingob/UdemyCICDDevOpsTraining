package testcases;

import basetest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest1 extends BaseTest {

    @Test
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
}
