package src.automation.java.tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import src.automation.java.pages.ActiveStreamPage;
import src.automation.java.pages.LoginPage;
import src.automation.java.utilities.BrowserUtils;
import src.automation.java.utilities.Driver;


public class UserStory_1_AC_5_CreateQuote extends AbstractTestBase {

    @Test(description = "Creating quote from the send message box")
    public void test() throws InterruptedException {

     extentTest = extentReports.createTest("User should be able to create quote from the send message box");

        LoginPage loginPage = new LoginPage();
        loginPage.login();

        ActiveStreamPage activeStreamPage = new ActiveStreamPage();


        activeStreamPage.inputMessage.click();


        //WebDriverWait wait = new ActiveStreamPage(Driver.getDriver(), 20);
        wait.until(ExpectedConditions.visibilityOf(activeStreamPage.quotIcon));
        activeStreamPage.quotIcon.click();

        BrowserUtils.wait(2);

        Driver.getDriver().switchTo().frame(activeStreamPage.frameBox);


        wait.until(ExpectedConditions.visibilityOf(activeStreamPage.quoteFrameBoxText));
        activeStreamPage.quoteFrameBoxText.sendKeys("Hello, Universe!");

        BrowserUtils.wait(2);

        Driver.getDriver().switchTo().defaultContent();

        BrowserUtils.wait(2);

        wait.until(ExpectedConditions.visibilityOf(activeStreamPage.sendButton));
        wait.until(ExpectedConditions.elementToBeClickable(activeStreamPage.sendButton));
        activeStreamPage.sendButton.click();

        BrowserUtils.wait(2);


        Assert.assertEquals(activeStreamPage.getText(), "Hello, Universe!");

        extentTest.fail("Test Failed");

    }
}
