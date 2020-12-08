package seleniumtest;

import com.automation.framework.config.ConfigReader;
import com.automation.framework.config.Settings;
import org.testng.annotations.Test;
import testelements.pages.HomePage;


public class SearchTest_07 extends TestInitialize {


    @Test

    public void SearchTest07() throws InterruptedException {
        HomePage homepage = new HomePage();
        extent.createTest("Scenario-7: Validating search result after searching with a full valid search key, result should return correct product result");

        try {

            // Read data from TestConfig.properties
            String validKey1 = Settings.ValidKey1;


            // Switch to the iframe of https://demo.nopcommerce.com/
             homepage.iframe();


             // Enter the search character
            homepage.inputSearch.sendKeys(validKey1);

            // Click on Search button
            homepage.btnSearch.click();

            Thread.sleep(2000);

            // validate search result should match with the search key
            assert(homepage.productTitle.getText().equals(validKey1));


            // Validate sort by drop down is displayed into the search result section
            assert(homepage.sortByResult.isDisplayed());


            // Validate sort by drop down is displayed into the search result section
            assert(homepage.pageSize.isDisplayed());


        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
