package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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

    @FindBy(xpath = "//span[text()='Poll']")
    public WebElement pollTab;

    @FindBy(css = "[contenteditable='true']")
    public WebElement pollFrameBoxText;

    @FindBy(id = "question_0")
    public WebElement question;

    @FindBy(id = "answer_0__0_")
    public WebElement answer1;

    @FindBy(id = "answer_0__1_")
    public WebElement answer2;

    @FindBy(id = "answer_0__2_")
    public WebElement answer3;

    @FindBy(id = "blg-post-img-838")
    public WebElement displayPoll;

    @FindBy(xpath = "//span[@id='bx-b-video-blogPostForm']")
    public WebElement videoIcon;

    @FindBy(id = "video_idPostFormLHE_blogPostForm-source")
    public WebElement videoLinkBox;

    @FindBy(xpath = "//input[@id='undefined']")
    public WebElement saveVideo;

    @FindBy(id = "lhe_button_editor_blogPostForm")
    public WebElement textEditorIcon;

    @FindBy(id = "bx-html-editor-tlbr-idPostFormLHE_blogPostForm")
    public WebElement textBar;

    @FindBy(id = "lhe_button_title_blogPostForm")
    public WebElement topicIcon;

    @FindBy(xpath = "//input[@id='POST_TITLE']")
    public WebElement topicBar;

    @FindBy(xpath = "//*[@id=\"post-buttons-bottom\"]/span[7]")
    public WebElement recordButton;

    @FindBy(xpath = "//*[@id=\"bx-popup-videomessage-popup\"]/div[3]/span[1]")
    public WebElement allowAccess;

    @FindBy(xpath = "//*[@id=\"popup-window-titlebar-bx-popup-videomessage-popup\"]/span")
    public WebElement error;

    @FindBy(id = "popup-window-content-bx-popup-videomessage-popup")
    public WebElement errorMessage;


    public String getText() {

        return text.getText();
    }

    public void linkForVideo(String link) {

        videoLinkBox.sendKeys(link);

    }

}
