package tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ActiveStreamPage;
import pages.LoginPage;
import utilities.BrowserUtils;

public class UserStory_1_AC_9_RecordAndAttachMessage extends AbstractTestBase {

    @Test(description = "User should be able to click Record Video tab to record a video and attach it with the message.")
    public void test() {

        extentTest = extentReports.createTest("User should be able to click Record Video tab to record a video and attach it with the message");

        LoginPage loginPage = new LoginPage();
        loginPage.login();
        ActiveStreamPage activeStreamPage = new ActiveStreamPage();
        activeStreamPage.inputMessage.click();
        BrowserUtils.wait(2);
        activeStreamPage.recordButton.click();
        BrowserUtils.wait(2);
        activeStreamPage.allowAccess.click();
        BrowserUtils.wait(5);
        wait.until(ExpectedConditions.visibilityOf(activeStreamPage.error));
        wait.until(ExpectedConditions.visibilityOf(activeStreamPage.errorMessage));

        extentTest.pass("Test passed");
        extentTest.fail("Test Failed");
    }
}
