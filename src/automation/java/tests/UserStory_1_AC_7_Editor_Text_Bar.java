package tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ActiveStreamPage;
import pages.LoginPage;
import utilities.BrowserUtils;

public class UserStory_1_AC_7_Editor_Text_Bar extends AbstractTestBase {

    @Test(description = "User should be able to click on Visual Editor and see the editor text-bar displays on top of the message box.")
    public void test() {

        extentTest = extentReports.createTest("User should see the editor text-bar");

        LoginPage loginPage = new LoginPage();
        loginPage.login();
        ActiveStreamPage activeStreamPage = new ActiveStreamPage();
        activeStreamPage.inputMessage.click();

        BrowserUtils.wait(1);

        activeStreamPage.textEditorIcon.click();
        wait.until(ExpectedConditions.visibilityOf(activeStreamPage.textBar));
        BrowserUtils.wait(1);

        Assert.assertTrue(activeStreamPage.textBar.isDisplayed());

        extentTest.pass("Editor text bar was verified");
        extentTest.fail("Test Failed");
    }
}
