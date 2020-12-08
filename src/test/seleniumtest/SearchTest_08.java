package seleniumtest;

import com.automation.framework.config.Settings;
import org.testng.annotations.Test;
import testelements.pages.HomePage;

public class SearchTest_08 extends TestInitialize {


    @Test

    public void SearchTest07() throws InterruptedException {
        HomePage homepage = new HomePage();
        extent.createTest("Scenario-8: Validating search result after searching with a partial valid search key, result should return correct product result");

        try {

            // Read data from TestConfig.properties
            String partialValidKey = Settings.PartialValidKey;


            Thread.sleep(3000);
            // Switch to the iframe of https://demo.nopcommerce.com/
            homepage.iframe();


            // Enter the search character
            homepage.inputSearch.sendKeys(partialValidKey);

            // Click on Search button
            homepage.btnSearch.click();

            Thread.sleep(2000);

            // validate search result should match with the search key
            assert(homepage.productTitle.getText().contains(partialValidKey));


            // Validate sort by drop down is displayed into the search result section
            assert(homepage.sortByResult.isDisplayed());


            // Validate page size drop down is displayed into the search result section
            assert(homepage.pageSize.isDisplayed());



        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}