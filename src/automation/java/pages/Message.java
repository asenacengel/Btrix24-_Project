package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.BrowserUtils;
import utilities.Driver;



   /*
Rana:
        userstory
        1. As a user, I should be able to send messages by clicking on Message tab under Active Stream.

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


public class Message extends AbstractBasePage {


    protected WebDriver driver = Driver.getDriver();


    @FindBy(xpath = "//*[@class=\"feed-add-post-form-link feed-add-post-form-link-active\"]//span")
    private WebElement message;

    @FindBy(id = "bx-b-uploadfile-blogPostForm")
    private WebElement uploadFiles;

    @FindBy(className = "bxhtmled-top-bar-btn bxhtmled-button-link")
    private WebElement link;

    @FindBy(className = "bxhtmled-top-bar-btn bxhtmled-button-video")
    private WebElement insertvideo;

    @FindBy(className = "bxhtmled-top-bar-btn bxhtmled-button-quote bxhtmled-top-bar-btn-active")
    private WebElement quoteText;

    @FindBy(id = "bx-b-mention-blogPostForm")
    private WebElement addMention;

    @FindBy(id = "bx-b-tag-input-blogPostForm")
    private WebElement addTag;

    @FindBy(xpath = "//span[@class='feed-add-post-form-but-cnt feed-add-videomessage' and contains(text(),'Record Video')]")
    private static WebElement recordVideo;

    @FindBy(className = "bx-editor-iframe")
    private static WebElement editorIframe;

    @FindBy(id = "blog-submit-button-save")
    private WebElement send;

    @FindBy(id = "blog-submit-button-cancel")
    private WebElement cancel;

    @FindBy(name = "bxu_files[]")
    private WebElement uploadfilesandimages;

    @FindBy(xpath = "//span[text()='Download from external drive']")
    private WebElement externeldrive;

    @FindBy(xpath = "//div[@id='feed-add-post-content-message']//*[text()='Select document from Bitrix24']")
    private WebElement selectdocumentfromBitrix24;

    @FindBy(xpath = "//*[text()='Sales and marketing']")
    private WebElement salesandmarketingstuff;

    @FindBy(xpath = "//a[text()='Marketing and advertising']")
    private WebElement marketinandadvertisingfiles;

    @FindBy(xpath = "//a[text()='Logo.gif']")
    private WebElement logofile;

    @FindBy(xpath = "//span[text()='Select document']")
    private WebElement selectdocument;

    @FindBy(className = "ed-add-post-destination-text")
    private WebElement allEmployees;

    @FindBy(xpath = "//*[@class='feed-add-destination-link']")    //a[text()='Add more']
    private WebElement addMore;

    @FindBy(xpath = "(//div[@class=\"bx-finder-box-tabs\"])/a[1]")
    private WebElement recent;

    @FindBy(xpath = "(//div[@class=\"bx-finder-box-tabs\"])/a[2]")
    private WebElement employeesAndDepartments;

    @FindBy(xpath = "(//div[@class=\"bx-finder-box-tabs\"])/a[3]")
    private WebElement emailUsers;

    @FindBy(xpath = "//div[@class=\"popup-window-angly popup-window-angly-bottom\"]")
    private WebElement popopWindowForRecent;

    @FindBy(xpath = "//div[@class='bx-finder-box-item-t7-name'])[1]")
    private WebElement peopleAllemployeesViaRecent;

    @FindBy(xpath = "//div[@class='bx-finder-box-item-t7-name'])[2]")
    private WebElement departmentsFullStack;


    public void send() {
        BrowserUtils.waitForPageToLoad(10);
        send.click();
        BrowserUtils.wait(5);
    }

    public void cancel() {
        BrowserUtils.waitForPageToLoad(10);
        cancel.click();
    }

    public void typeToMessageBlank(String message) {
        driver.switchTo().frame(editorIframe).findElement(By.tagName("body")).sendKeys(message);
        BrowserUtils.wait(1);
    }

    public void messageClick() {
        BrowserUtils.waitForPageToLoad(10);
        message.click();

    }

    public void setUploadFiles() {
        wait.until(ExpectedConditions.elementToBeClickable(uploadFiles)).click();

    }


    public void pathmethod() {

        String path="";

        if (System.getProperty("os.name").toLowerCase().contains("mac")) {
            path = System.getProperty("user.dir")+"/Asia'sclassnotes";
        } else {
            path = System.getProperty("user.dir")+"\\Asia'sclassnotes";

        }

  //      String path = System.getProperty("user.dir") + System.getProperty("file.seperator") + "Asia'sclassnotes";

        BrowserUtils.wait(3);
        uploadfilesandimages.sendKeys(path);
        BrowserUtils.wait(3);
        send.click();
    }

    public void selectDocumentFromBitrix24() {
        BrowserUtils.wait(3);
        selectdocumentfromBitrix24.click();
        BrowserUtils.wait(3);
        salesandmarketingstuff.click();
        BrowserUtils.wait(3);
        marketinandadvertisingfiles.click();
        BrowserUtils.wait(3);
        logofile.click();
        BrowserUtils.wait(3);
        selectdocument.click();
    }

    public void externalDrive(){
        BrowserUtils.wait(3);
        externeldrive.click();
    }

    public void addUsersFromEmailUser(String contactMail) {
        BrowserUtils.wait(2);
        addMore.click();
        BrowserUtils.wait(3);
        emailUsers.click();
        BrowserUtils.wait(1);

        driver.findElement(By.className("bx-finder-company-department-employee-name")).click();
        BrowserUtils.wait(3);

    }

    public void addUserfromRecent (String maillist) {
        BrowserUtils.wait(2);
        addMore.click();
        BrowserUtils.wait(2);
        employeesAndDepartments.click();
        BrowserUtils.wait(2);
        String allEmployees="(//*[@class='bx-finder-company-department-text'])[1]";
        String departments="(//*[@class='bx-finder-company-department-text'])[2]";

        if(maillist.equalsIgnoreCase(allEmployees)) {
            driver.findElement(By.xpath(allEmployees)).click();
            BrowserUtils.wait(2);
        }if(maillist.equalsIgnoreCase(departments)) {
            driver.findElement(By.xpath(departments)).click();
            BrowserUtils.wait(2);
        }

      //  driver.findElement(By.xpath("//div[@class='bx-finder-company-department-check-arrow']")).click();
        BrowserUtils.wait(2);

    }

    public void addUsers(){
        BrowserUtils.wait(2);
        addMore.click();
        BrowserUtils.wait(3);
        departmentsFullStack.click();
        BrowserUtils.wait(3);
        driver.findElement(By.xpath("//*[@class='bx-finder-box-item-t7-name' and contains(text(),'All employees')]")).click();
        BrowserUtils.wait(2);
      // driver.findElement(By.xpath("//*[@class='bx-finder-box-item-t7-name' and contains(text(),'FullStack')]"));

    }


      public void addUserFromFromEmployeesAndDepartmentsOrEmailList(String tag, String mail){
        String path="";
        addMore.click();
        driver.findElement(By.xpath("//a[text()='"+tag+"']")).click();
        BrowserUtils.wait(3);
        if(tag.equalsIgnoreCase("employees and departments")) {
            path = "//a[div/div[@class=\"bx-finder-company-department-employee-name\" and text()=\"" + mail + "\"]]";
            BrowserUtils.wait(3);
            driver.findElement(By.xpath(path)).click();
        }if (tag.equalsIgnoreCase("E-mail users")){
                driver.findElement(By.xpath("//input[@id='feed-add-post-destination-input']")).sendKeys(mail);
                BrowserUtils.wait(3);
                path="//a[div/div[@class=\"bx-finder-box-item-t7-name\" and text()=\""+mail+"\"]]";
                driver.findElement(By.xpath(path)).click();
        }


    }


}




