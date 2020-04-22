package tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ActiveStreamPage;
import pages.LoginPage;
import utilities.BrowserUtils;
import utilities.Driver;

public class UserStory_1_AC_4_InsertVideos extends AbstractTestBase {

    @Test(description = "Insert video link")
    public void test() {

        extentTest = extentReports.createTest("Insert video to the Message box");

        LoginPage loginPage = new LoginPage();
        loginPage.login();
        ActiveStreamPage activeStreamPage = new ActiveStreamPage();
        activeStreamPage.inputMessage.click();
        BrowserUtils.wait(1);
        activeStreamPage.videoIcon.click();
        BrowserUtils.wait(1);
        activeStreamPage.videoLinkBox.click();
        activeStreamPage.linkForVideo("https://www.youtube.com/watch?v=fa5p19APgd8");
        activeStreamPage.saveVideo.click();

        extentTest.pass("Video attached");

    }
}
