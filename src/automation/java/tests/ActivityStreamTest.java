package  src.automation.java.utilities.tests;

import org.testng.annotations.Test;


public class ActivityStreamTest extends src.automation.java.tests.AbstractTestBase {


    @Test(description = "UserStory №7: AC_№1")
    public void uploadFileFromLocalDisk() {
        extentTest = extentReports.createTest("Verify could upload File from Local Disk");

        src.automation.java.pages.LoginPage loginPage = new src.automation.java.pages.LoginPage();
        loginPage.login();
        pages.ActivityStreamPage activityStreamPage = new pages.ActivityStreamPage();

        activityStreamPage.clickToUploadFiles();
        activityStreamPage.uploadPomFileFromLocalDisk();

        src.automation.java.utilities.BrowserUtils.wait(2);
        extentTest.pass("We could upload the \"pom.xml\" file ");

    }

    @Test(description = "UserStory №7: AC_№1")
    public void downloadFileFromExternalDrive() {
        extentTest = extentReports.createTest("Verify could upload File from Local Disk");

        src.automation.java.pages.LoginPage loginPage = new src.automation.java.pages.LoginPage();
        loginPage.login();

        pages.ActivityStreamPage activityStreamPage = new pages.ActivityStreamPage();

        activityStreamPage.clickToUploadFiles();
        activityStreamPage.downloadFromExternalDrive();

        src.automation.java.utilities.BrowserUtils.wait(2);
        extentTest.pass("File downloaded from external Local Disk");
    }

    @Test(description = "UserStory №7: AC_№1")
    public void downloadDocumentFromBixtrix24() {
        extentTest = extentReports.createTest("Verify could download from Bitrix24");

        src.automation.java.pages.LoginPage loginPage = new src.automation.java.pages.LoginPage();
        loginPage.login();

        pages.ActivityStreamPage activityStreamPage = new pages.ActivityStreamPage();

        activityStreamPage.clickToUploadFiles();
        activityStreamPage.downloadFromBitrix();

        src.automation.java.utilities.BrowserUtils.wait(2);
        extentTest.pass("Downloaded from Bitrix24");
    }

    @Test(description = "UserStory №7: AC_№1")
    public void createFilesToUpload() {
        extentTest = extentReports.createTest("Verify could create Files to Upload");

        src.automation.java.pages.LoginPage loginPage = new src.automation.java.pages.LoginPage();
        loginPage.login();

        pages.ActivityStreamPage activityStreamPage = new pages.ActivityStreamPage();

        activityStreamPage.clickToUploadFiles();
        activityStreamPage.createFileToUpload();

        src.automation.java.utilities.BrowserUtils.wait(2);
        extentTest.pass("Files Created");
    }

    @Test(description = "UserStory №7: AC_№2")
    public void addRecipientsFromRecent() {
        extentTest = extentReports.createTest("Verify could add Users from Recent");

        src.automation.java.pages.LoginPage loginPage = new src.automation.java.pages.LoginPage();
        loginPage.login();

        pages.ActivityStreamPage activityStreamPage = new pages.ActivityStreamPage();

        activityStreamPage.goAnnouncementClickMore();
        activityStreamPage.addUserFromRecent();

        src.automation.java.utilities.BrowserUtils.wait(2);
        extentTest.pass("We added user from Recent list");
    }

    @Test(description = "UserStory №7: AC_№2")
    public void addRecipientsFromEmployeesAndDepartments() {
        extentTest = extentReports.createTest("Verify could add Users from Employees And Departments");

        src.automation.java.pages.LoginPage loginPage = new src.automation.java.pages.LoginPage();
        loginPage.login();

        pages.ActivityStreamPage activityStreamPage = new pages.ActivityStreamPage();

        activityStreamPage.goAnnouncementClickMore();
        activityStreamPage.addUserFromEmployeesAndDepartments();

        src.automation.java.utilities.BrowserUtils.wait(2);
        extentTest.pass("We added user from Employees And Departments list");
    }

    @Test(description = "UserStory №7: AC_№2")
    public void addRecipientsFromEmail() {
        extentTest = extentReports.createTest("Verify could add Users from E-mail");

        src.automation.java.pages.LoginPage loginPage = new src.automation.java.pages.LoginPage();
        loginPage.login();

        pages.ActivityStreamPage activityStreamPage = new pages.ActivityStreamPage();

        activityStreamPage.goAnnouncementClickMore();
        activityStreamPage.addUserFromEmail();

        src.automation.java.utilities.BrowserUtils.wait(2);
        extentTest.pass("We added user from E-mail");
    }

    @Test(description = "UserStory №7: AC_№3")
    public void attachLink() {
        extentTest = extentReports.createTest("Verify could attach a link");

        src.automation.java.pages.LoginPage loginPage = new src.automation.java.pages.LoginPage();
        loginPage.login();

        pages.ActivityStreamPage activityStreamPage = new pages.ActivityStreamPage();
        activityStreamPage.goAnnouncement();
        activityStreamPage.addLink("Hello B15", "www.yandex.ru");
        activityStreamPage.addRecipientAndSendLink();

        src.automation.java.utilities.BrowserUtils.wait(2);
        extentTest.pass("We attached a link");
    }

    @Test(description = "UserStory №7: AC_№4")
    public void insertVideoURL() {
        extentTest = extentReports.createTest("Verify could add a link");

        src.automation.java.pages.LoginPage loginPage = new src.automation.java.pages.LoginPage();
        loginPage.login();

        pages.ActivityStreamPage activityStreamPage = new pages.ActivityStreamPage();
        activityStreamPage.goAnnouncement();
        activityStreamPage.addTheVideoURL("www.youtube.ru");

        src.automation.java.utilities.BrowserUtils.wait(2);
        extentTest.pass("We added a link");
    }

    @Test(description = "UserStory №7: AC_№5")
    public void creatingAQuote() {
        extentTest = extentReports.createTest("Verify could create a quote");

        src.automation.java.pages.LoginPage loginPage = new src.automation.java.pages.LoginPage();
        loginPage.login();

        pages.ActivityStreamPage activityStreamPage = new pages.ActivityStreamPage();
        activityStreamPage.goAnnouncement();
        activityStreamPage.createQuote();

        src.automation.java.utilities.BrowserUtils.wait(2);
        extentTest.pass("Quote created");

    }

    @Test(description = "UserStory №7: AC_№6")
    public void addMention() {
        extentTest = extentReports.createTest("Verify to add mention for a user from the list");

        src.automation.java.pages.LoginPage loginPage = new src.automation.java.pages.LoginPage();
        loginPage.login();

        pages.ActivityStreamPage activityStreamPage = new pages.ActivityStreamPage();
        activityStreamPage.goAnnouncement();
        activityStreamPage.addMention();

        src.automation.java.utilities.BrowserUtils.wait(2);
        extentTest.pass("User mention added");

    }

    @Test(description = "UserStory №7: AC_№7")
    public void clickVisualEditorToSeeEditorBar() {
        extentTest = extentReports.createTest("Verify Visual Editor bar is Visible");

        src.automation.java.pages.LoginPage loginPage = new src.automation.java.pages.LoginPage();
        loginPage.login();

        pages.ActivityStreamPage activityStreamPage = new pages.ActivityStreamPage();
        activityStreamPage.goAnnouncement();
        activityStreamPage.clickVisualEditor();

        src.automation.java.utilities.BrowserUtils.wait(2);
        extentTest.pass("We saw it (The Visual Editor Bar)");
    }

    @Test(description = "UserStory №7: AC_№8")
    public void clickOnTheTopicItem() {
        extentTest = extentReports.createTest("Verify we can send topic Title");

        src.automation.java.pages.LoginPage loginPage = new src.automation.java.pages.LoginPage();
        loginPage.login();

        pages.ActivityStreamPage activityStreamPage = new pages.ActivityStreamPage();
        activityStreamPage.goAnnouncement();
        activityStreamPage.addTopic("I Love The World");

        src.automation.java.utilities.BrowserUtils.wait(2);
        extentTest.pass("Topic title added");
    }

    @Test(description = "UserStory №7: AC_№9")
    public void clickOnRecordVideo() {
        extentTest = extentReports.createTest("Verify record video is clickable");

        src.automation.java.pages.LoginPage loginPage = new src.automation.java.pages.LoginPage();
        loginPage.login();

        pages.ActivityStreamPage activityStreamPage = new pages.ActivityStreamPage();
        activityStreamPage.goAnnouncement();
        activityStreamPage.clickRecordVideo();

        src.automation.java.utilities.BrowserUtils.wait(2);
        extentTest.pass("Record Video is clickable");
    }

    @Test(description = "UserStory №7: AC_№10")
    public void addTag() {
        extentTest = extentReports.createTest("Verify we can create or add a Tag");

        src.automation.java.pages.LoginPage loginPage = new src.automation.java.pages.LoginPage();
        loginPage.login();

        pages.ActivityStreamPage activityStreamPage = new pages.ActivityStreamPage();
        activityStreamPage.goAnnouncement();
        activityStreamPage.createTag("#faraon_B15");

        src.automation.java.utilities.BrowserUtils.wait(2);
        extentTest.pass("Tag was added/created");
    }
}

