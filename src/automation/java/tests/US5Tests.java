package tests;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.US5Page;

public class US5Tests extends AbstractTestBase {
    @Test
    public void more(){
        extentTest=extentReports.createTest("more tab");
        LoginPage loginPage=new LoginPage();
        loginPage.login();
        US5Page us5_page =new US5Page();
        us5_page.more();
        us5_page.file();
        extentTest.pass("The test passed successfully");
    }
    @Test
    public void uploadFilesAndImages(){
        extentTest=extentReports.createTest("file options");
        LoginPage loginPage=new LoginPage();
        loginPage.login();
        US5Page us5_page =new US5Page();
        us5_page.more();
        us5_page.file();
        us5_page.uploadFilesAndImages();
        extentTest.pass("The test passed successfully");
    }
    @Test
    public void fileOptionsSelectFromBitrix24(){
        extentTest=extentReports.createTest("file options");
        LoginPage loginPage=new LoginPage();
        loginPage.login();
        US5Page us5_page =new US5Page();
        us5_page.more();
        us5_page.file();
        us5_page.bitrix24();
        extentTest.pass("The test passed successfully");
    }
    @Test
    public void downloadFromExternalDrive(){
        extentTest=extentReports.createTest("file options");
        LoginPage loginPage=new LoginPage();
        loginPage.login();
        US5Page us5_page =new US5Page();
        us5_page.more();
        us5_page.file();
        us5_page.downloadFromExternalDrive();
    }

    @Test
    public void createGoogleDocs(){
        extentTest=extentReports.createTest("file options");
        LoginPage loginPage=new LoginPage();
        loginPage.login();
        US5Page us5_page =new US5Page();
        us5_page.more();
        us5_page.file();
        us5_page.googleDocs();

    }
}
