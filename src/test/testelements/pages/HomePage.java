package testelements.pages;

import com.automation.framework.base.BasePage;
import com.automation.framework.base.DriverContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {


    public HomePage() {

    }

    // Switch to the iframe of https://demo.nopcommerce.com/
    public void iframe(){
        DriverContext.Driver.switchTo().frame(DriverContext.Driver.findElement(By.xpath("/html/body/main/div/iframe")));
    }

    // Search test box
    @FindBy(xpath="//input[@id='small-searchterms']")
    public WebElement inputSearch;

    // Search button
    @FindBy(xpath="//*[@id='small-search-box-form']/input[2]")
    public WebElement btnSearch;

    // Warning message placeholder
    @FindBy(xpath="/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[2]/div")
    public WebElement warningMsg;


    // "Advanced Search" label
    @FindBy(xpath="/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[1]/form/div[1]/div/div[1]/div[2]/label")
    public WebElement advSearchLabel;

    // "Advanced Search" checkbox
    @FindBy(xpath="//*[@id=\"adv\"]")
    public WebElement advSearchCheckbox;


    // "Category" label
    @FindBy(xpath="//*[@id=\"advanced-search-block\"]/div[1]/label")
    public WebElement categoryLabel;

    // "Category" drop-down
    @FindBy(xpath="//*[@id=\"cid\"]")
    public WebElement categoryDdl;

    // "Automatically search sub categories" label
    @FindBy(xpath="//*[@id=\"advanced-search-block\"]/div[2]/label")
    public WebElement subCategoryLabel;

    // "Automatically search sub categories" check-box
    @FindBy(xpath="//*[@id=\"isc\"]")
    public WebElement subCategoryCheckbox;

    // "Manufacturer" label
    @FindBy(xpath="//*[@id=\"advanced-search-block\"]/div[3]/label")
    public WebElement manufacturerLabel;

    // "Manufacturer" drop-down
    @FindBy(xpath="//*[@id=\"mid\"]")
    public WebElement manufacturerDdl;


    // "Price range" label
    @FindBy(xpath="//*[@id=\"advanced-search-block\"]/div[4]/label")
    public WebElement priceRangeLabel;

    // Price "From" text box
    @FindBy(xpath="//*[@id=\"pf\"]")
    public WebElement priceFrom;

    // Price "To" text box
    @FindBy(xpath="//*[@id=\"pt\"]")
    public WebElement priceTo;


    // "Search In product descriptions" label
    @FindBy(xpath="//*[@id=\"advanced-search-block\"]/div[5]/label")
    public WebElement productDescriptionLabel;

    // "Search In product descriptions" checkbox
    @FindBy(xpath="//*[@id=\"sid\"]")
    public WebElement productDescriptionCheckbox;








    // Click on SEARCH button from Home Page
    public void SearchButtonClick() {
        btnSearch.click();
    }

}

