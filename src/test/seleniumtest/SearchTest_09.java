package seleniumtest;

import com.automation.framework.config.Settings;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import testelements.pages.HomePage;

public class SearchTest_09 extends TestInitialize {


    @Test

    public void SearchTest09() throws InterruptedException {
        HomePage homepage = new HomePage();
        extent.createTest("Scenario-9: Validating search result after searching with a valid search key with all advanced search parameter used, result should return correct product result");

        try {

            // Read data from TestConfig.properties
            String validKey2 = Settings.ValidKey2;
            String singleKey = Settings.SingleKey;

            // Switch to the iframe of https://demo.nopcommerce.com/
            homepage.iframe();

            // Enter a single character
            homepage.inputSearch.sendKeys(singleKey);

            // Click on Search button to get the Advanced Search option
            homepage.btnSearch.click();


            // Enter the search character with a Valid Key which is lowercase
            homepage.inputSearch.sendKeys(validKey2);


            // Click on Advanced Search checkbox
            homepage.advSearchCheckbox.click();

            Thread.sleep(2000);

            // Category drop-down
            Select s= new Select(homepage.categoryDdl);

            // Select Computer >> Notebooks option from Category drop-down list
            s.selectByIndex(3);

            // Manufacturer drop-down
            Select s1= new Select(homepage.manufacturerDdl);

            // Select Apple from Manufacturer drop-down list
            s1.selectByIndex(1);

            // Setting price from and To
            homepage.priceFrom.sendKeys("800");
            homepage.priceTo.sendKeys("2000");


            // Click on Search button to see the result
            homepage.btnSearch.click();


            Thread.sleep(5000);

            // Convert the test result into the lowercase as Search result could be in any case
            String lowercaseResult = homepage.productTitle.getText().toLowerCase();

            // validate search result should match with the search key
            assert (lowercaseResult.contains(validKey2));


            // Validate sort by drop down is displayed into the search result section
            assert (homepage.sortByResult.isDisplayed());


            // Validate page size drop down is displayed into the search result section
            assert (homepage.pageSize.isDisplayed());


        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
