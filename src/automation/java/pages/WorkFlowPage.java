package src.automation.java.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import src.automation.java.utilities.BrowserUtils;

public class WorkFlowPage extends AbstractBasePage {





        // Set up the branch
        @FindBy(id="left-menu-more-btn")
        private WebElement moreBtn;

        @FindBy (xpath = "(//span[contains(text(),'Workflows')])[1]")
        private WebElement workFlows ;

        @FindBy (xpath = "(//span[contains(text(),'Workflows in Activity Stream')])")
        private  WebElement WorkFlowsInAS;

        @FindBy(id = "lists-title-action-add")
        private  WebElement addbtn;

        @FindBy(xpath = "//*[@id=\"tab_el_edit_table\"]/tbody/tr[2]/td[2]/img")
        private  WebElement startDatePicker;

        @FindBy(xpath = "(//img[@class='calendar-icon'])[2]")
        private  WebElement endDatePicker;

        @FindBy (className = "bx-calendar-top-month")
        private  WebElement mouthPicker;

        @FindBy (className = "bx-calendar-top-year")
        private  WebElement yearPicker;

        @FindBy(name = "PREVIEW_TEXT")
        private WebElement ReasonToLeave;




        public void SendKeysReasonToLeave(String reason){
            ReasonToLeave.sendKeys(reason, Keys.ENTER);
        }


        public void selectAbsenceType(String type){
            Select select=new Select(driver.findElement(By.name("PROPERTY_88")));
            select.selectByVisibleText(type);
        }


        public void endDatePicker(String day, String month, String year){
            BrowserUtils.clickWithJS(endDatePicker);
            wait.until(ExpectedConditions.elementToBeClickable(mouthPicker)).click();
            driver.findElement(By.xpath("//span[text()='"+month+"']")).click();
            BrowserUtils.clickWithJS(yearPicker);
            driver.findElement(By.xpath("//span[text()='"+year+"']")).click();
            BrowserUtils.clickWithJS(  driver.findElement(By.xpath("//a[@class='bx-calendar-cell'][text()='"+day+"']")));

        }

        public void startDatePicker(String day, String month, String year){
            BrowserUtils.clickWithJS(startDatePicker);
            wait.until(ExpectedConditions.elementToBeClickable(mouthPicker)).click();
            driver.findElement(By.xpath("//span[text()='"+month+"']")).click();
            BrowserUtils.clickWithJS(yearPicker);
            driver.findElement(By.xpath("//span[text()='"+year+"']")).click();
            BrowserUtils.clickWithJS(  driver.findElement(By.xpath("//a[@class='bx-calendar-cell'][text()='"+day+"']")));

        }


        public void navigateToWorkFlows(String tabName){
            BrowserUtils.waitForPageToLoad(10);
            wait.until(ExpectedConditions.elementToBeClickable(moreBtn)) .click();
            BrowserUtils.waitForPageToLoad(10);
            wait.until(ExpectedConditions.elementToBeClickable(workFlows)) .click();
            BrowserUtils.waitForPageToLoad(10);
            wait.until(ExpectedConditions.elementToBeClickable(WorkFlowsInAS)) .click();
            BrowserUtils.waitForPageToLoad(10);
            String xpath="//a[text()='"+tabName+"']";
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(xpath)))).click();
            BrowserUtils.wait(5);
        }

        public void clickOnAdd(){
            BrowserUtils.waitForPageToLoad(10);
            wait.until(ExpectedConditions.elementToBeClickable(addbtn)).click();
        }


    }
