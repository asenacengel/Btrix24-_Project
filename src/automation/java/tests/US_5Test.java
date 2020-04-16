package tests;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.US5_MoreTab;
import utilities.BrowserUtils;
public class US_5Test extends AbstractTestBase {
    @Test
    public void more(){
        extentTest=extentReports.createTest("more tab");
        LoginPage loginPage=new LoginPage();
        loginPage.login();
        US5_MoreTab us5_moreTab=new US5_MoreTab();
        us5_moreTab.more();
        us5_moreTab.file();
        extentTest.pass("The test passed successfully");
    }
    @Test
    public void uploadFilesAndImages(){
        extentTest=extentReports.createTest("file options");
        LoginPage loginPage=new LoginPage();
        loginPage.login();
        US5_MoreTab us5_moreTab=new US5_MoreTab();
        us5_moreTab.more();
        us5_moreTab.file();
        us5_moreTab.uploadFilesAndImages();
        extentTest.pass("The test passed successfully");
    }
    @Test
    public void fileOptionsSelectFromBitrix24(){
        extentTest=extentReports.createTest("file options");
        LoginPage loginPage=new LoginPage();
        loginPage.login();
        US5_MoreTab us5_moreTab=new US5_MoreTab();
        us5_moreTab.more();
        us5_moreTab.file();
        us5_moreTab.bitrix24();
        extentTest.pass("The test passed successfully");
    }
    @Test
    public void downloadFromExternalDrive(){
        extentTest=extentReports.createTest("file options");
        LoginPage loginPage=new LoginPage();
        loginPage.login();
        US5_MoreTab us5_moreTab=new US5_MoreTab();
        us5_moreTab.more();
        us5_moreTab.file();
        us5_moreTab.downloadFromExternalDrive();
    }
}
