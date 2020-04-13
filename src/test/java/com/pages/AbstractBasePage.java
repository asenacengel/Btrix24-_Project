package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.utilities.Driver;

public abstract class AbstractBasePage {

    //td[@id="layout-left-column"]/div/ul/li//a/span[contains(text(),'Tasks')]
    //td[@id="layout-left-column"]/div/ul/li//a/span[contains(text(),'')]

    protected WebDriver driver = Driver.getDriver();
    protected WebDriverWait wait = new WebDriverWait(driver, 20);

    public AbstractBasePage() {
        PageFactory.initElements(driver, this);
    }

    // navigate method
    public void navigateTo(String TableName){
    String locator = "//td[@id='layout-left-column']/div/ul/li//a/span[contains(text(),'"+TableName+"')]";
    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator))).click();




    }

}
