package testpackage.pages;

import com.automation.framework.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage {

    public HomePage() {
    }

    @FindBy(how = How.CLASS_NAME, using = "search-box-button")
    public WebElement btnSearch;


    // Click on SEARCH button from Home Page
    public void SearchButton() {
        btnSearch.click();
    }

}

