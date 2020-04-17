package tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ActiveStreamPage;
import pages.LoginPage;
import utilities.BrowserUtils;

public class UserStory_1_AC_8_Message_Topic_Text_Box extends AbstractTestBase {

    @Test(description = "User should be able to click on the Topic icon to see the Message Topic text box displays on top of the message box.")
    public void test() {

        extentTest = extentReports.createTest("Message Topic text box test");

        LoginPage loginPage = new LoginPage();
        loginPage.login();

        ActiveStreamPage activeStreamPage = new ActiveStreamPage();
        activeStreamPage.inputMessage.click();
        wait.until(ExpectedConditions.visibilityOf(activeStreamPage.topicIcon));
        BrowserUtils.wait(3);
        activeStreamPage.topicIcon.click();
        BrowserUtils.wait(3);

        Assert.assertTrue(activeStreamPage.topicBar.isDisplayed());

        extentTest.pass("Message Topic text box is verified");
        extentTest.fail("Test Failed");
    }
}
