package src.automation.java.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import src.automation.java.pages.LoginPage;
import src.automation.java.utilities.BrowserUtils;

import utilities.Driver;

public class LoginTest extends AbstractTestBase {

    @Test
    public void verifyPageTitle() {
        //test --> ExtentTest object
        //we must add to every test at the beginning
        //test = report.createTest("Test name");
        extentTest = extentReports.createTest("Verify page title");

        LoginPage loginPage = new LoginPage();
        loginPage.login();


        BrowserUtils.wait(2);
        Assert.assertEquals(Driver.getDriver().getTitle(), "Portal");
        //if assertion passed, it will set test status in report to passed


        extentTest.pass("Page title Portal was verified");
    }
}
