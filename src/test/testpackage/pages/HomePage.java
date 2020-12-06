package testpackage.pages;

import com.automation.framework.base.BasePage;
import com.automation.framework.base.DriverContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage {


    public HomePage() {

    }

    // Switch to the iframe of https://demo.nopcommerce.com/
    public void iframe(){
        DriverContext.Driver.switchTo().frame(DriverContext.Driver.findElement(By.xpath("/html/body/main/div/iframe")));
    }

    // Search test box
    @FindBy(how=How.XPATH, using="//input[@id='small-searchterms']")
    public WebElement inputSearch;

    // Search button
    @FindBy(how=How.XPATH, using="//*[@id='small-search-box-form']/input[2]")
    public WebElement btnSearch;

    // Warning message placeholder
    @FindBy(how=How.XPATH, using="/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[2]/div")
    public WebElement warningMsg;


    /*
    @FindAll({@FindBy(how=How.ID, using="username"),
            @FindBy(className="username")})

     */



    // Click on SEARCH button from Home Page
    public void SearchButton() {
        btnSearch.click();
    }

}

