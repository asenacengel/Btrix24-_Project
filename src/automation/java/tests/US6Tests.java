package tests;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.US6Page;

public class US6Tests extends AbstractTestBase{

    LoginPage loginPage=new LoginPage();
    US6Page us6Page=new US6Page();
//    "1. User should be able to click on upload files icon to upload files and
//    pictures from local disks, download from external drive,
//    select documents from bixtrix24, and create files to upload.
    @Test
    public void AC1(){
        extentTest=extentReports.createTest("AC 1");
        loginPage.login();
        us6Page.more();
        us6Page.file();
        us6Page.uploadFilesAndImages();
        us6Page.bitrix24();
        us6Page.downloadFromExternalDrive();
        extentTest.pass("The test passed successfully");


    }

//            2. User should be able to add users and
//            recipients from selecting contact from E-mail user,
//            Employees and Departments and Recent contact lists.

    @Test
    public void AC2(){
        extentTest=extentReports.createTest("AC 2");
        loginPage.login();
        us6Page.more();
        us6Page.appreciation();
        us6Page.addMore();
        us6Page.recent();
        us6Page.employeesAndDeps();
        us6Page.emailUsers();
        extentTest.pass("The test passed successfully");
    }








//            3. User should be able to attach link by clicking on the link icon.
//4. User should be able to insert videos by clicking on the video icon and entering the video URL.
//            5. User should be able to create a quote by clicking on the Comma icon.
//            6. User should be able to add mention by clicking on the Add mention icon and select contacts from the lists provided in dropdown.
//7. User should be able to click on Visual Editor and see the editor text-bar displays on top of the message box.
//            8. User should be able to click on the Topic icon to see the Appreciation Topic text box displays on top of the message box.
//            9. User should be able to click on ""Record Video"" tab to record a video and attach it with the message.
//10. User should be able to add tags by selecting existing tags or creating new tags by clicking on the # icon.
//11. User should be able to see all types of appreciation illustration/emojis by clicking on the existing illustration/emojis."
}
