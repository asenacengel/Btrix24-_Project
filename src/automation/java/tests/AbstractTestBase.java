package tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.*;


import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.io.IOException;

public abstract class AbstractTestBase {

    protected WebDriver driver =Driver.getDriver();
    protected  ExtentReports extentReports;
    protected  ExtentHtmlReporter extentHtmlReporter;
    protected  ExtentTest extentTest;

    protected WebDriverWait wait;
    protected Actions actions;


    @BeforeTest
    public void beforeTest() {

        extentReports = new ExtentReports();
       // extentTest = new ExtentTest(extentReports,"","")
        String reportPath = "";

        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            reportPath = System.getProperty("user.dir") + "\\test-output\\report.html";
        } else {
            reportPath = System.getProperty("user.dir") + "/test-output/report.html";
        }
        extentHtmlReporter = new ExtentHtmlReporter(reportPath);
        extentReports.attachReporter(extentHtmlReporter);
        extentHtmlReporter.config().setReportName("WebOrders Automation");

    }

    @AfterTest
    public void afterTest() {
        extentReports.flush();
    }

    @BeforeMethod
    public void setup() {

        String URL = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(URL);
        Driver.getDriver().manage().window().maximize();
        wait = new WebDriverWait(Driver.getDriver(), 25);
        actions = new Actions(Driver.getDriver());
    }

    @AfterMethod
    public void teardown(ITestResult testResult) {
        if (testResult.getStatus() == ITestResult.FAILURE) {
            String screenshotLocation = BrowserUtils.getScreenshot(testResult.getName());
            try {
                extentTest.fail(testResult.getName());//test name that failed
               extentTest.addScreenCaptureFromPath(screenshotLocation);//screenshot as an evidence         extentTest.fail(testResult.getThrowable());//error message
            } catch (IOException e) {
               e.printStackTrace();
                throw new RuntimeException("Failed to attach screenshot");
           }
        } else if (testResult.getStatus() == ITestResult.SUCCESS) {
           extentTest.pass(testResult.getName());
        } else if (testResult.getStatus() == ITestResult.SKIP) {
            extentTest.skip(testResult.getName());
       }
        BrowserUtils.wait(3);
        Driver.closeDriver();
    }
}
