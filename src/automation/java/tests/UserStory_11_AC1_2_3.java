package src.automation.java.tests;

import org.testng.annotations.Test;

import src.automation.java.pages.DownloadTestBase;
import src.automation.java.pages.LoginPage;
import src.automation.java.utilities.BrowserUtils;



public class UserStory_11_AC1_2_3 extends DownloadTestBase {


    @Test(description = "1. User should be able to click on Mac Os icon under Desktop \n" +
                        "Client to download Mac version of Bitrix.")
     public void macDownloadTest()  {

        LoginPage loginPage = new LoginPage();
        super.setup();
        loginPage.login("hr31@cybertekschool.com", "UserUser");
        BrowserUtils.waitForPageToLoad(3);
        driver.findElement(mac_Os).click();
       // extentTest.pass("PASSED");
        BrowserUtils.getScreenshot("mac");
        driver.close();

    }
    @Test(description = "User should be able to click on Windows icon under Desktop \\n\" +\n" +
                         "  \"Client to download Windows version of Bitrix.")
    public void WindowsDownloadTest(){

        LoginPage loginPage = new LoginPage();
        super.setup();
        loginPage.login("hr31@cybertekschool.com", "UserUser");
        BrowserUtils.waitForPageToLoad(3);
        driver.findElement(windows).click();
        BrowserUtils.getScreenshot("Windows");
        driver.close();

    }
    @Test(description = " User should be able to click on Linux icon under Desktop \\n\" +\n" +
                        " \"Client to download Linux version of Bitrix.")
    public void LinuxDownloadPage(){

        LoginPage loginPage = new LoginPage();
        super.setup();
        loginPage.login("hr31@cybertekschool.com", "UserUser");
        BrowserUtils.waitForPageToLoad(3);
        driver.findElement(linux).click();
        BrowserUtils.getScreenshot("Linux");
        extentTest.fail("website navigating to github");
        extentReports.flush();

    }







}
