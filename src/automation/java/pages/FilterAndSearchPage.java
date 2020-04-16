package pages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.BrowserUtils;

import java.util.Arrays;
import java.util.List;

public class FilterAndSearchPage extends AbstractBasePage {

    @FindBy(id="LIVEFEED_search")
    private WebElement filterSearch;

    @FindBy(xpath = "//*[text()='Work']")
    private WebElement workfilter;

    @FindBy(xpath = "//span[text()='Favorites']")
    private WebElement favoritesFilter;

    @FindBy(xpath = "//*[text()='My Activity']")
    private WebElement myactivityFilters;

    @FindBy(xpath = "(//*[text()='Announcements'])[2]")
    private WebElement announcementFilters;

    @FindBy(xpath = "//div[@class='main-ui-filter-sidebar-item']//*[text()='Workflows']")
    private WebElement workflowsFilters;

    @FindBy(xpath = "(//span[@class='main-ui-item-icon main-ui-delete'])[1]")  //again PayAttention
    private WebElement defaultMenu;

    @FindBy(xpath = "//span[text()='Any date']")
    private WebElement searchDate;

    @FindBy(xpath = "//span[text()='Yesterday']")
    private WebElement yesterday;

    @FindBy(xpath = "//div[@class='main-ui-control main-ui-multi-select']")
    private WebElement searchType;

    @FindBy(xpath = "//div[@class='main-ui-control main-ui-multi-select main-ui-focus']")
    private WebElement searchByInnerType;

    @FindBy(xpath = "//span[@class = 'main-ui-square']")
    private  WebElement paapc;

    @FindBy(xpath = "(//span[@class = 'main-ui-square-search']//input)[3]")
    private WebElement searchAuthor;

    @FindBy(xpath = "(//span[@class = 'main-ui-square-search']//input)[4]")
    private WebElement searchTo;

    @FindBy(xpath = "//div[@class='main-ui-square-item']")
    private WebElement allEmployee;

    @FindBy(xpath = "(//div[@class = 'main-ui-control main-ui-select'])[2]")
    private WebElement searchFavorites;

    @FindBy(xpath = "(//input[@class = 'main-ui-control main-ui-control-string'])[3]")
    private WebElement searchTag;

    @FindBy(xpath = "(//div[@class = 'main-ui-control main-ui-select'])[3]")
    private WebElement searchExtranet;

    @FindBy(xpath = "//span[@class = 'main-ui-filter-field-add-item']")
    private WebElement addField;

//    @FindBy(xpath = "//span[@title = 'Extranet']")
//    private WebElement emptySpace;

    @FindBy(xpath = "//div[text()='Favorites']")
    private WebElement addFieldFavorite;

    @FindBy(xpath = "//div[text()='Tag']")
    private WebElement addFieldTag;

    @FindBy(xpath = "//div[text()='Extranet']")
    private WebElement addExtranetField;

    @FindBy(xpath = "//span[text()='Save filter']")
    private WebElement saveFilterFunction;

    @FindBy(xpath = "//input[@class='main-ui-filter-sidebar-edit-control']")
    private WebElement filterNameFunction;

    @FindBy(xpath = "//span[@class='ui-btn ui-btn-success main-ui-filter-field-button main-ui-filter-save']")
    private WebElement saveButton;

    @FindBy(xpath = "//span[text()='Restore default fields']")
    private WebElement defaultFields;






    // Opening search box option
    public void clickFilters(){
        BrowserUtils.wait(3);
        filterSearch.click();
    }

    // different Filters
    public void filters(){

        List<WebElement>  filtersList = Arrays.asList(workfilter,favoritesFilter,myactivityFilters,announcementFilters,workflowsFilters);
        for (WebElement eachFilter : filtersList) {
            BrowserUtils.wait(3);
            eachFilter.click();
            BrowserUtils.wait(3);
            filterSearch.click();
        }

    }


    public void searchDate(){
        BrowserUtils.wait(3);
        defaultMenu.click();
        BrowserUtils.wait(3);
        searchDate.click();
        BrowserUtils.wait(3);
        searchDate.click();
        BrowserUtils.wait(2);

    }

    public void searchType(){
        BrowserUtils.wait(3);
        searchType.click();
        BrowserUtils.wait(3);
        searchByInnerType.click();
        BrowserUtils.wait(3);
    }

    public void searchAuthor(){
        BrowserUtils.wait(1);
        searchAuthor.sendKeys("gulayHill", Keys.ENTER);
        BrowserUtils.wait(1);
    }

    public void searchTo(){
        searchTo.sendKeys("Cybertek",Keys.ENTER);
        BrowserUtils.wait(3);
    }

    public void addField(){
        addField.click();
        BrowserUtils.wait(2);
        addFieldFavorite.click();
        BrowserUtils.wait(2);
        addFieldTag.click();
        BrowserUtils.wait(2);
        addExtranetField.click();
        BrowserUtils.wait(2);
        addField.click();
        BrowserUtils.wait(2);
        searchFavorites.click();
        BrowserUtils.wait(2);
        searchTag.sendKeys("Tester");
        BrowserUtils.wait(2);
         searchExtranet.click();
         BrowserUtils.wait(2);
    }
    public void searchBox(){
        filterSearch.sendKeys("Selenium");

    }
    public void saveFilterNewOptionSee(){
        filterSearch.click();
        BrowserUtils.wait(2);
        saveFilterFunction.click();
        filterNameFunction.sendKeys("hr2@cybertekschool.com");

    }



}
