package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.BrowserUtils;

public class US6Page extends AbstractBasePage{

    @FindBy(css = "span[class='feed-add-post-more-icon']")
    private WebElement moreBtn;
    @FindBy(xpath = "//span[@class='menu-popup-item-text'][text()='File']")
    private WebElement fileBtn;
    @FindBy(name = "bxu_files[]")
    private WebElement uploadFilesAndImagesBtn;
    @FindBy(xpath = "(//span[@class='wd-fa-add-file-light-title-text diskuf-selector-link'])[1]")
    private WebElement bitrix24Btn;
    @FindBy(xpath = "(//span[@class='wd-fa-add-file-light-title-text'])[2]")
    private WebElement downloadFromExternalDriveBtn;
    @FindBy(xpath = "(//span[@class='wd-fa-add-file-light-title-text'])[3]")
    private WebElement docsBtn;
    @FindBy(xpath = "(//span[@class='menu-popup-item-text'])[2]")
    private WebElement appreciationBtn;
    @FindBy(css = "a#bx-destination-tag")
    private WebElement addMoreBtn;

    @FindBy(xpath = "//a[starts-with(@id,'destLastTab_destination')]")
    private WebElement recentBtn;

    @FindBy(xpath = "//a[starts-with(@id,'destDepartmentTab_destination')]")
    private WebElement employeesAndDepartmentsBtn;

    @FindBy(xpath = "//a[starts-with(@id,'destEmailTab_destination')]")
    private WebElement emailUsersBtn;



    public void more(){
        wait.until(ExpectedConditions.elementToBeClickable(moreBtn)).click();
    }
    public void file(){
        wait.until(ExpectedConditions.visibilityOf(fileBtn)).click();
    }
    public void uploadFilesAndImages(){

        JavascriptExecutor executor=(JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();",uploadFilesAndImagesBtn);
        BrowserUtils.wait(2);
    }
    public void bitrix24(){
        wait.until(ExpectedConditions.visibilityOf(bitrix24Btn)).click();
    }
    public void downloadFromExternalDrive(){
        wait.until(ExpectedConditions.visibilityOf(downloadFromExternalDriveBtn)).click();
    }
    public void  googleDocs() {
        wait.until(ExpectedConditions.visibilityOf(docsBtn)).click();

    }

    public void addMore(){
        wait.until(ExpectedConditions.elementToBeClickable(addMoreBtn)).click();
    }

    public void appreciation(){
        wait.until(ExpectedConditions.elementToBeClickable(appreciationBtn)).click();
    }
    public void employeesAndDeps(){
        wait.until(ExpectedConditions.elementToBeClickable(employeesAndDepartmentsBtn)).click();
    }
    public void emailUsers(){
        wait.until(ExpectedConditions.elementToBeClickable(emailUsersBtn)).click();
    }

    public void recent(){
        wait.until(ExpectedConditions.elementToBeClickable(recentBtn)).click();
    }
}
