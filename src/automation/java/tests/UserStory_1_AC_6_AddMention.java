package src.automation.java.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import src.automation.java.pages.ActiveStreamPage;
import tests.AbstractTestBase;


import java.util.List;

public class UserStory_1_AC_6_AddMention extends AbstractTestBase {

    @Test(description = "Add mentions to the text box")
    public void test() {

        extentTest = extentReports.createTest("User clicking add mention icon and select contacts from list.");

        LoginPage loginPage = new LoginPage();
        loginPage.login();


        ActiveStreamPage activeStreamPage = new ActiveStreamPage();
        activeStreamPage.inputMessage.click();


        wait.until(ExpectedConditions.visibilityOf(activeStreamPage.mentionIcon));
        activeStreamPage.mentionIcon.click();


        wait.until(ExpectedConditions.elementToBeClickable(activeStreamPage.emplAndDepart));
        activeStreamPage.emplAndDepart.click();


        wait.until(ExpectedConditions.elementToBeClickable(activeStreamPage.contact_1));
        String actualFirstContact = activeStreamPage.contact_1.getText();
        activeStreamPage.contact_1.click();

        activeStreamPage.mentionIcon.click();


        wait.until(ExpectedConditions.elementToBeClickable(activeStreamPage.emplAndDepart));
        activeStreamPage.emplAndDepart.click();


        wait.until(ExpectedConditions.elementToBeClickable(activeStreamPage.contact_2));
        String actualSecondContact = activeStreamPage.contact_2.getText();
        activeStreamPage.contact_2.click();


        String expectedFirstContact = activeStreamPage.contact_1_Text.getText();
        String expectedSecondContact = activeStreamPage.contact_2_Text.getText();

        Assert.assertEquals(actualFirstContact, expectedFirstContact);
        Assert.assertEquals(actualSecondContact, expectedSecondContact);

        extentTest.pass("Mentions were verified");
        extentTest.fail("Mentions did not pass the test");
    }
}
