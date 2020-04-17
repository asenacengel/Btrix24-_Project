package src.automation.java.tests;

import com.aventstack.extentreports.ExtentReports;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import src.automation.java.pages.LoginPage;
import src.automation.java.pages.WorkFlowPage;

public class WorkFlowTest extends AbstractTestBase{

   LoginPage loginPage= new LoginPage();
   WorkFlowPage workFlowsPage=new WorkFlowPage();

    List<String > workFlowsLst= Arrays.asList("Leave Approval","Business Trip","General Requests","Purchase Request","Expense Report");


    @Test(description = "US8_AC1")
    public void WorkFlowTest1(){
        extentTest = extentReports.createTest("Verify user can create Leave Request");
        loginPage.login();
        workFlowsPage.navigateToWorkFlows("Leave Approval");
        workFlowsPage.clickOnAdd();
        workFlowsPage.startDatePicker("17","May","2022");
        workFlowsPage.endDatePicker("18","May","2022");
        workFlowsPage.selectAbsenceType("Sick leave");
        workFlowsPage.SendKeysReasonToLeave("I think i have Covid-19! Sorry!!!");
         extentTest.pass("Test passed");
    }



}
