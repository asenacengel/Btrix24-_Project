package src.automation.java.tests;

import org.testng.annotations.Test;

import src.automation.java.pages.LoginPage;
import src.automation.java.pages.Message;
import src.automation.java.utilities.BrowserUtils;

public class US1Test extends AbstractTestBase {
    /*
userstory1. As a user, I should be able to send messages by clicking on Message tab under Active Stream.

1. User should be able to click on upload files icon to upload files and pictures from local disks,
download from external drive, select documents from bixtrix24, and create files to upload.
2. User should be able to add users from selecting contact from E-mail user, Employees and Departments and Recent contact lists.
3. User should be able to attach link by clicking on the link icon.
4. User should be able to insert videos by clicking on the video icon and entering the video URL.
5. User should be able to create a quote by clicking on the Comma icon.
6. User should be able to add mention by clicking on the Add mention icon and select contacts from the lists provided in dropdown.
7. User should be able to click on Visual Editor and see the editor text-bar displays on top of the message box.
8. User should be able to click on the Topic icon to see the Message Topic text box displays on top of the message box.
9. User should be able to click on "Record Video" tab to record a video and attach it with the message.
     */

    @Test(description = "AC-1:upload files and pictures from local disks")
    public void test1() {
        extentTest = extentReports.createTest("verify upload file from local disk");
        LoginPage loginPage = new LoginPage();
        Message us1 = new Message();

        loginPage.login();
        us1.messageClick();
        us1.setUploadFiles();
        us1.pathmethod();

    }


    @Test(description = "select documents from bixtrix24")
    public void test2() {
        extentTest = extentReports.createTest("verify get document from Btrix24");
        LoginPage loginPage = new LoginPage();
        Message us1 = new Message();

        loginPage.login();
        us1.messageClick();
        us1.setUploadFiles();
        us1.selectDocumentFromBitrix24();

    }


    @Test(description = "contact from Recent contact lists")
    public void test3() {
        extentTest = extentReports.createTest("verify to add recent list");
        LoginPage loginPage = new LoginPage();
        Message us1 = new Message();
        loginPage.login();
        us1.messageClick();
        us1.addUserfromRecent("allemployees");
    }


    @Test (description = "contact from ")
    public void addContactsToMessage(){
        extentTest = extentReports.createTest("verify to adding people");
        LoginPage loginPage = new LoginPage();
        Message us1 = new Message();
        loginPage.login();
        us1.messageClick();
        String tag= "E-mail users";
        String mail="helpdesk31@cybertekschool.com";
        BrowserUtils.wait(3);
        us1.addUserFromFromEmployeesAndDepartmentsOrEmailList(tag,mail);


    }

}