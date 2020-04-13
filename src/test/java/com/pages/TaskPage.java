package com.pages;

import com.utilities.BrowserUtils;
import org.apache.poi.xssf.usermodel.XSSFPivotTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.File;
import java.nio.channels.WritableByteChannel;

/**
 * @author:
 * @create:
 * @date:
 */
public class TaskPage extends AbstractBasePage {

    @FindBy(css = "#tasks-buttonAdd")
    private WebElement newTask;
    @FindBy(xpath = "//div[@class=\"task-info-panel-important\"]/input[1]")
    private WebElement highPriority;
    @FindBy(css = ".side-panel-content-container>iframe")
    private WebElement sidePanelTaskFrame;
    @FindBy(xpath = "//button[@class=\"ui-btn ui-btn-success\"]")
    private WebElement addTaskButton;
    @FindBy(xpath = "//iframe[@class=\"bx-editor-iframe\"]")
    private WebElement editorFrame;
    @FindBy(xpath = "//*[@id=\"lhe_button_editor_task-form-bitrix_tasks_task_default_1\"]")
    private WebElement visualButton;
    @FindBy(css = ".bxhtmled-toolbar")
    private WebElement textBar;
    @FindBy(xpath = "//span[@class=\"feed-add-post-form-but feed-add-file\"]")
    private WebElement uploadFiles;
    @FindBy(xpath = "//span[@class=\"files-text\"]/span[1]")
    private WebElement fileName;
    @FindBy(css = "#bx-b-quote-task-form-bitrix_tasks_task_default_1")
    private WebElement commaIcon;
    @FindBy(xpath = "//iframe[@class=\"bx-editor-iframe\"]")
    private WebElement getTextBarFrame;
    @FindBy(css = "#bx-b-mention-task-form-bitrix_tasks_task_default_1")
    private WebElement addMention;
    @FindBy(xpath = "//a[contains(text(),'Employees and departments')]")
    private WebElement employAdd;
    @FindBy(xpath = "(//div[@class=\"bx-finder-company-department-employee-name\"])[2]")
    private WebElement CyberVekEmail;
    @FindBy(xpath = "//span[@class=\"bxhtmled-top-bar-btn bxhtmled-button-link\"]")
    private WebElement linkElement;
    @FindBy(css = "#linkbitrix_tasks_task_default_1-href")
    private WebElement linkUrl;
    @FindBy(css = "#linkbitrix_tasks_task_default_1-text")
    private WebElement linkText;
    @FindBy(css = "#undefined")
    private WebElement saveButton;
    @FindBy(xpath = "//body/a")
    private WebElement addLinkText;
    @FindBy(xpath = "//span[@class=\"tasks-task-mpf-link\"]")
    private WebElement checkList;
    @FindBy(xpath = "//input[@class=\"js-id-checklist-is-form-title task-checklist-field-add\"]")
    //               //input[@class="js-id-checklist-is-form-title task-checklist-field-add"]
    private WebElement checkListInput;
    @FindBy(css = "#bx-component-scope-bitrix_tasks_task_default_1-checklist > div.task-checklist-field.tasks-checklist-dropzone.tasks-checklist-form > span > span > span.js-id-checklist-is-form-submit.block-edit.tasks-btn-apply.task-field-title-ok")
    private WebElement addCheckMark;
    @FindBy(xpath = "//span[@class=\"js-id-checklist-is-i-title \"]")
    private WebElement checkListTitle;
    @FindBy(xpath = "//input[@class=\"js-id-checklist-is-form-title task-checklist-field-add\"]")
    private WebElement addInput;
    // to create a new task
    public void createNewTask() {
        BrowserUtils.waitForPageToLoad(10);
        wait.until(ExpectedConditions.visibilityOf(newTask)).click();
    }

    // click on "High Priority" checkbox to set the current task to a top priority task
    public boolean clickOnHighPriorityButton() {
        try {
            BrowserUtils.waitForPageToLoad(10);
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(sidePanelTaskFrame));
            wait.until(ExpectedConditions.visibilityOf(highPriority)).click();
            return highPriority.isSelected();
        } finally {
            driver.switchTo().defaultContent();
        }

    }

    // click on Visual Editor and see the editor text-bar displays on top of the message box.
    public boolean verifyTheText_barIsDisplay() {
        BrowserUtils.waitForPageToLoad(10);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(sidePanelTaskFrame));
        wait.until(ExpectedConditions.elementToBeClickable(visualButton)).click();
        return textBar.isDisplayed();
    }

    /**
     * 3. User should be able to click on upload files icon to upload files and pictures from local disks,
     * download from external drive, select documents from bixtrix24, and create files to upload.
     */
    public String getUploadFilesText() {
        BrowserUtils.waitForPageToLoad(10);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(sidePanelTaskFrame));
        wait.until(ExpectedConditions.visibilityOf(uploadFiles)).click();
        WebElement upload = driver.findElement(By.xpath("//td/div/span[@class=\"wd-fa-add-file-light\"]"));
        File file = new File("/Users/bohuaixiao/Documents/Screen Shot 2019-12-03 at 9.37.56 PM.png");
        if (file.exists()) {
            upload.sendKeys(file.getPath());
            System.out.println("Yes");
        }
        return "";

    }

    //User should be able to create a quote by clicking on the Comma icon.

    public boolean verifyClickComma(){
        BrowserUtils.waitForPageToLoad(10);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(sidePanelTaskFrame));
        wait.until(ExpectedConditions.elementToBeClickable(commaIcon)).click();
        WebElement element = wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(getTextBarFrame)).findElement(
                By.xpath("//blockquote")
        );
        return element.isDisplayed();
    }
    //User should be able to add mention by clicking on the Add mention icon
    // and select contacts from the lists provided in dropdown.
    public boolean verifyAddMention(){
        BrowserUtils.waitForPageToLoad(10);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(sidePanelTaskFrame));
        wait.until(ExpectedConditions.elementToBeClickable(addMention)).click();
        wait.until(ExpectedConditions.elementToBeClickable(employAdd)).click();
        wait.until(ExpectedConditions.elementToBeClickable(CyberVekEmail)).click();

        WebElement element = wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(getTextBarFrame))
                .findElement(By.xpath("//span[@class=\"bxhtmled-metion\"]"));
        System.out.println(element.getText());

        return element.isDisplayed();
    }

    //6. User should be able to attach link by clicking on the link icon.
    //https://github.com/bohuaiXiao/CucmberPractice.git
    public String attachLink(String text ,String link){
        BrowserUtils.waitForPageToLoad(10);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(sidePanelTaskFrame));
        wait.until(ExpectedConditions.elementToBeClickable(linkElement)).click();
        wait.until(ExpectedConditions.visibilityOf(linkText)).sendKeys(text);
        wait.until(ExpectedConditions.visibilityOf(linkUrl)).sendKeys(link);
        wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();

        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(getTextBarFrame));
        String linkTextAttribute = addLinkText.getText();
        return linkTextAttribute;


    }
    // User should be able to click on "Checklist" to create checklists items(Things to do).
    public String clickOnCheckList(){
        BrowserUtils.waitForPageToLoad(10);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(sidePanelTaskFrame));
        wait.until(ExpectedConditions.elementToBeClickable(checkList)).click();
        String defaultText = checkListInput.getAttribute("placeholder");
        return defaultText;
    }
    // User can add a checklist item by clicking on add button or check mark.
    public String addCheckListByCheckMark(String text){
        BrowserUtils.waitForPageToLoad(10);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(sidePanelTaskFrame));
        wait.until(ExpectedConditions.elementToBeClickable(checkList)).click();

        wait.until(ExpectedConditions.visibilityOf(addInput)).sendKeys(text);

        wait.until(ExpectedConditions.elementToBeClickable(addCheckMark)).click();

        return checkListTitle.getText().trim();

    }
    // User can add separator lines between checklist items.
    // User can delete a checklist item by clicking on x mark.


}
