package src.automation.java.tests;

import org.testng.annotations.Test;

import pages.LoginPage;

import src.automation.java.pages.FilterAndSearchPage;
import tests.AbstractTestBase;
import utilities.BrowserUtils;



class FilterAndSearchTest extends AbstractTestBase {
    LoginPage loginPage = new LoginPage();
    FilterAndSearchPage filterAndSearchPage = new FilterAndSearchPage();

    @Test(priority = 0)
    public void filterSearchBox(){
        extentTest = extentReports.createTest("Verify search function with different filter");
        loginPage.login();
        filterAndSearchPage.clickFilters();
        extentTest.pass("Search function with different filter");

    }
    public void differentFilters(){
        extentTest = extentReports.createTest("Verify search with different field");
        LoginPage loginPage = new LoginPage();
        FilterAndSearchPage filterAndSearchPage = new FilterAndSearchPage();
        loginPage.login();
        BrowserUtils.wait(2);
        filterAndSearchPage.clickFilters();
        BrowserUtils.wait(2);
        filterAndSearchPage.searchDate();
        filterAndSearchPage.searchType();
        filterAndSearchPage.searchAuthor();
        filterAndSearchPage.searchTo();
        filterAndSearchPage.addField();
        extentTest.pass("Search with diffrernt field verified");

    }

    @Test
    public void searchFunctionality(){
        extentTest = extentReports.createTest("Verify search functinality");
        LoginPage loginPage = new LoginPage();
        FilterAndSearchPage filterAndSearchPage = new FilterAndSearchPage();
        loginPage.login();
        filterAndSearchPage.searchBox();
        extentTest.pass("Search box verified");
    }

    @Test
    public void saveFilterFuncntion(){

        extentTest = extentReports.createTest("Verify save filter function");
        LoginPage loginPage = new LoginPage();
        FilterAndSearchPage filterAndSearchPage = new FilterAndSearchPage();
        loginPage.login();
        filterAndSearchPage.saveFilterNewOptionSee();
        extentTest.pass("Save filter function verified");
    }



}




