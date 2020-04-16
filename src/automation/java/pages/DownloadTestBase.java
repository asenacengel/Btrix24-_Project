package pages;

import org.openqa.selenium.By;
import tests.AbstractTestBase;


public class DownloadTestBase extends AbstractTestBase {

    protected By mac_Os = By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/table/tbody/tr/td/div/div[1]/div[6]/div[2]/a[1]");
    protected By linux = By.xpath("//*[@id=\"sidebar\"]/div[6]/div[2]/a[3]/span[1]");
    protected By windows = By.xpath("//*[@id=\"sidebar\"]/div[6]/div[2]/a[2]/span[1]");

}

