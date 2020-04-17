package src.automation.java.tests;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;


import src.automation.java.pages.ActiveStreamPage;
import src.automation.java.pages.LoginPage;
import src.automation.java.utilities.BrowserUtils;
import src.automation.java.utilities.Driver;



public class UserStory_4_AC_10 extends AbstractTestBase {

    @Test
    public void createPoll() {
        extentTest = extentReports.createTest("user should be able to create a poll");
        LoginPage loginPage = new LoginPage();
        loginPage.login("marketing31@cybertekschool.com","UserUser");

        ActiveStreamPage activeStreamPage = new ActiveStreamPage();
        BrowserUtils.wait(2);
        activeStreamPage.pollTab.click();
        BrowserUtils.wait(2);
        Driver.getDriver().switchTo().frame(activeStreamPage.frameBox);
        wait.until(ExpectedConditions.visibilityOf(activeStreamPage.pollFrameBoxText));
        activeStreamPage.pollFrameBoxText.sendKeys("About remote working environment");
        BrowserUtils.wait(2);
        Driver.getDriver().switchTo().defaultContent();

        wait.until(ExpectedConditions.visibilityOf(activeStreamPage.question));
        activeStreamPage.question.click();
        activeStreamPage.question.sendKeys("How do you communicate with your team?");

        wait.until(ExpectedConditions.visibilityOf(activeStreamPage.answer1));
        activeStreamPage.answer1.click();
        activeStreamPage.answer1.sendKeys("Zoom for scrum meetings");

        wait.until(ExpectedConditions.visibilityOf(activeStreamPage.answer2));
        activeStreamPage.answer2.click();
        activeStreamPage.answer2.sendKeys("Slack for quick questions");

        wait.until(ExpectedConditions.visibilityOf(activeStreamPage.answer3));
        activeStreamPage.answer3.click();
        activeStreamPage.answer3.sendKeys("Office 365 for email");


        wait.until(ExpectedConditions.visibilityOf(activeStreamPage.sendButton));
        wait.until(ExpectedConditions.elementToBeClickable(activeStreamPage.sendButton));
        activeStreamPage.sendButton.click();
        Assert.assertTrue(  activeStreamPage.displayPoll.isDisplayed());

        extentTest.pass("poll created");
    }

}
