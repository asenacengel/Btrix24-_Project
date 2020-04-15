package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ActiveStreamPage extends AbstractBasePage {

    @FindBy(id = "microoPostFormLHE_blogPostForm_inner")
    public WebElement inputMessage;

    @FindBy(xpath = "//span[@title='Quote text']")
    public WebElement quotIcon;

    @FindBy(className = "bx-editor-iframe")
    public WebElement frameBox;

    @FindBy(xpath = "//blockquote[@class='bxhtmled-quote']")
    public WebElement quoteFrameBoxText;

    @FindBy(id = "blog-submit-button-save")
    public WebElement sendButton;

    @FindBy(xpath = "//td[text()='Hello, Universe!']")
    public WebElement text;

    @FindBy(id = "bx-b-mention-blogPostForm")
    public WebElement mentionIcon;

    @FindBy(linkText = "Employees and departments")
    public WebElement emplAndDepart;

    @FindBy(xpath = "(//div[@class='bx-finder-company-department-employee-name'])[1]")
    public WebElement contact_1;
    @FindBy(xpath = "(//div[@class='bx-finder-company-department-employee-name'])[2]")
    public WebElement contact_2;

    @FindBy(xpath = "(//span[@class='feed-add-post-destination-text'])[2]")
    public WebElement contact_1_Text;

    @FindBy(xpath = "(//span[@class='feed-add-post-destination-text'])[3]")
    public WebElement contact_2_Text;



    public String getText(){

       return text.getText();
    }

}
