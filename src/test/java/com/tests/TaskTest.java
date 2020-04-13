package com.tests;

import com.pages.LoginPage;
import com.pages.TaskPage;
import com.utilities.BrowserUtils;
import org.apache.poi.ss.formula.functions.T;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author:
 * @create:
 * @date:
 */
public class TaskTest extends AbstractTestBase {

    //Test to click click new Task button
    @Test
    public void clickNewTaskButton(){
        extentTest = extentReports.createTest("Verify the high priorityButton is clickable");
        LoginPage loginPage = new LoginPage();
        TaskPage p = new TaskPage();

        loginPage.login();
        p.navigateTo("Tasks");
        p.createNewTask();
        Assert.assertTrue(p.clickOnHighPriorityButton());
        extentTest.pass("The high priority button is selected");

    }
    @Test(description = "Verify to click on Visual Editor and see the editor text-bar displays on top of the message box.")
     public void verifyTheTextBarDisplay(){
        extentTest = extentReports.createTest("Verify the editor textbar is displays");
        LoginPage loginPage = new LoginPage();
        TaskPage p = new TaskPage();
        loginPage.login();
        p.navigateTo("Tasks");
        p.createNewTask();
        BrowserUtils.wait(2);
        boolean b = p.verifyTheText_barIsDisplay();
        Assert.assertTrue(b);
        extentTest.pass("The Text-bar is displays");
       // System.out.println(p.getUploadFilesText());
    }
    @Test(description = "able to click on upload files icon to upload files and pictures from local disks,")
    public void verifyTheUploadFilesIcon(){
        extentTest = extentReports.createTest("Verify the editor textbar is displays");
        LoginPage loginPage = new LoginPage();
        TaskPage p = new TaskPage();
        loginPage.login();
        p.navigateTo("Tasks");
        p.createNewTask();
        BrowserUtils.waitForPageToLoad(10);
        System.out.println(p.getUploadFilesText());
    }
    @Test
    public void verifyTheCommaIcon(){
        extentTest = extentReports.createTest("Verify to click on comma icon to create a quote");
        LoginPage loginPage = new LoginPage();
        TaskPage p = new TaskPage();
        loginPage.login();
        p.navigateTo("Tasks");
        p.createNewTask();
        BrowserUtils.waitForPageToLoad(10);

        Assert.assertTrue( p.verifyClickComma());
        extentTest.pass("To create a quote by clicking on the Comma icon. ");
    }
    @Test(description = "Add mention icon and select contacts from the lists provided in dropdown.")
    public void verifyTheAddMention(){
        extentTest = extentReports.createTest("Verify to add mention icon and select contacts");
        LoginPage loginPage = new LoginPage();
        TaskPage p = new TaskPage();
        loginPage.login();
        p.navigateTo("Tasks");
        p.createNewTask();
        BrowserUtils.waitForPageToLoad(10);
        Assert.assertTrue(p.verifyAddMention());
        BrowserUtils.wait(2);
        extentTest.pass("The mention icon is clickable and the contacts are selectable");

    }
    @Test
    public void verifyTheLink(){
        extentTest = extentReports.createTest("Verify to click on comma icon to create a quote");
        LoginPage loginPage = new LoginPage();
        TaskPage p = new TaskPage();
        loginPage.login();
        p.navigateTo("Tasks");
        p.createNewTask();
        BrowserUtils.waitForPageToLoad(10);
        String text = "add1";
        String urlToLink = "https://login1.nextbasecrm.com/company/personal/user/497/tasks/task/edit/0/com";
        Assert.assertEquals(p.attachLink(text,urlToLink),text);
        BrowserUtils.wait(2);
        extentTest.pass("The link is already attach!");
    }
    @Test(description = "Verify to click on 'Checklist' to create checklists items(Things to do).")
    public void verifyToCreateCheckList(){
        extentTest = extentReports.createTest("Verify to click on 'Checklist' to create checklists items(Things to do).");
        LoginPage loginPage = new LoginPage();
        TaskPage p = new TaskPage();
        loginPage.login();
        p.navigateTo("Tasks");
        p.createNewTask();
        BrowserUtils.waitForPageToLoad(10);
        String expected = "Things to do";
        Assert.assertEquals(expected,p.clickOnCheckList());
        BrowserUtils.wait(2);
        extentTest.pass("Create checklist successful");

    }
    @Test
    public void verifyToAddCheckListByMark(){
        extentTest = extentReports.createTest("Verify to add checklist by check mark");
        LoginPage loginPage = new LoginPage();
        TaskPage p = new TaskPage();
        loginPage.login();
        p.navigateTo("Tasks");
        p.createNewTask();
        BrowserUtils.waitForPageToLoad(10);
        String addText = "AddList";
        String addList = p.addCheckListByCheckMark(addText);
        Assert.assertEquals(addList,addText);
        extentTest.pass("Check mark to add checklist successful");

    }




}
