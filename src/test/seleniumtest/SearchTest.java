package seleniumtest;

import com.automation.framework.config.Settings;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import testelements.pages.HomePage;

import java.util.List;

public class SearchTest extends TestInitialize{

    @Test
    public void SearchScenario01() throws InterruptedException {

        extent.createTest("Scenario-1: Validating Search Textbox and warning message by entering single character");

        HomePage homepage = new HomePage();

        try {

            // Read data from TestConfig.properties
            String singleKey = Settings.SingleKey;

            // Switch to the iframe of https://demo.nopcommerce.com/
            homepage.iframe();

            // Enter a character
            homepage.inputSearch.sendKeys(singleKey);

            // Click on Search button
            homepage.btnSearch.click();

            Thread.sleep(2000);

            // validate the warning message
            assert(homepage.warningMsg.getText().equals("Search term minimum length is 3 characters"));

            Thread.sleep(2000);


        } catch (Exception e) {
            System.out.println("Test Failed :" + e);
        }


    }

    @Test
    public void SearchScenario02() throws InterruptedException {

        extent.createTest("Scenario-2:Validating Search Textbox and warning message by entering double character");

        HomePage homepage = new HomePage();


        try {

            // Read data from TestConfig.properties
            String doubleKey = Settings.DoubleKey;


            // Switch to the iframe of https://demo.nopcommerce.com/
            homepage.iframe();

            // Enter a character
            homepage.inputSearch.sendKeys(doubleKey);


            // Click on Search button
            homepage.btnSearch.click();

            Thread.sleep(2000);

            // validate the warning message
            assert(homepage.warningMsg.getText().equals("Search term minimum length is 3 characters"));

            Thread.sleep(2000);


        } catch (Exception e) {
            System.out.println("Test Failed :" + e);
        }


    }

    @Test
    public void SearchScenario03() throws InterruptedException {

        extent.createTest("Scenario-3:Validating Search Textbox and warning message by entering invalid 3 characters");

        HomePage homepage = new HomePage();


        try {

            // Read data from TestConfig.properties
            String invalidKey = Settings.InvalidKey;

            // Switch to the iframe of https://demo.nopcommerce.com/
            homepage.iframe();

            // Enter a character
            homepage.inputSearch.sendKeys(invalidKey);


            // Click on Search button
            homepage.btnSearch.click();

            Thread.sleep(5000);

            // validate the warning message
            assert(homepage.warningMsg.getText().equals("No products were found that matched your criteria."));

            Thread.sleep(5000);


        } catch (Exception e) {
            System.out.println("Test Failed :" + e);
        }


    }

    @Test
    public void SearchScenario04() throws InterruptedException {

        extent.createTest("Scenario-4: Validating all the fields and lebels of Advanced Search");

        HomePage homepage = new HomePage();


        try {

            // Read data from TestConfig.properties
            String doubleKey = Settings.DoubleKey;

            // Switch to the iframe of https://demo.nopcommerce.com/
            homepage.iframe();

            // Enter a character
            homepage.inputSearch.sendKeys(doubleKey);

            // Click on Search button
            homepage.btnSearch.click();



            // Validate Advanced Search label is displayed
            assert(homepage.advSearchLabel.isDisplayed());

            // Click on Advanced Search checkbox
            homepage.advSearchCheckbox.click();

            Thread.sleep(2000);

            // Validate Category label is displayed
            assert(homepage.categoryLabel.isDisplayed());

            // Validate Category drop down is displayed
            assert(homepage.categoryDdl.isDisplayed());

            // Validate Automatically search sub categories label is displayed
            assert(homepage.subCategoryLabel.isDisplayed());

            // Validate Automatically search sub categories check-box is displayed
            assert(homepage.subCategoryCheckbox.isDisplayed());


            // Validate Manufacturer label is displayed
            assert(homepage.manufacturerLabel.isDisplayed());

            // Validate Manufacturer drop down is displayed
            assert(homepage.manufacturerDdl.isDisplayed());

            // Validate Price range label is displayed
            assert(homepage.priceRangeLabel.isDisplayed());

            // Validate Price From text box is displayed
            assert(homepage.priceFrom.isDisplayed());

            // Validate Price To text box is displayed
            assert(homepage.priceTo.isDisplayed());

            // Validate "Search In product descriptions" label is displayed
            assert(homepage.productDescriptionLabel.isDisplayed());

            // Validate "Search In product descriptions" check-box is displayed
            assert(homepage.productDescriptionCheckbox.isDisplayed());


        } catch (Exception e) {
            System.out.println("Test Failed :" + e);
        }


    }

    @Test
    public void SearchScenario05() throws InterruptedException {

        extent.createTest("Scenario-5: Validating all list items of Category drop-down");
        HomePage homepage = new HomePage();


        try {

            // Read data from TestConfig.properties
            String invalidKey = Settings.InvalidKey;

            // Switch to the iframe of https://demo.nopcommerce.com/
            homepage.iframe();

            // Enter a character
            homepage.inputSearch.sendKeys(invalidKey);

            // Click on Search button
            homepage.btnSearch.click();

            // Click on Advanced Search checkbox
            homepage.advSearchCheckbox.click();

            // Select Category drop down
            homepage.categoryDdl.click();

            Thread.sleep(5000);

            // Category drop-down
            Select s= new Select(homepage.categoryDdl);


            // Array with all the Category drop-down values
            String[] catlist = {"All","Computers","Computers >> Desktops","Computers >> Notebooks","Computers >> Software","Electronics","Electronics >> Camera & photo","Electronics >> Cell phones","Electronics >> Others","Apparel","Apparel >> Shoes","Apparel >> Clothing","Apparel >> Accessories","Digital downloads","Books","Jewelry","Gift Cards"};

            List<WebElement> options = s.getOptions();
            for(WebElement cat:options)
            {
                boolean match = false;
                for (int i=0; i<catlist.length; i++)
                {
                    if (cat.getText().equals(catlist[i]))
                    {
                        match = true;
                    }
                }
                assert(match);
            }


        } catch (Exception e) {
            System.out.println("Test Failed :" + e);
        }


    }

    @Test
    public void SearchScenario06() throws InterruptedException {

        extent.createTest("Scenario-6: Validating all the list items of Manufacturer drop-down");
        HomePage homepage = new HomePage();


        try {

            // Read data from TestConfig.properties
            String invalidKey = Settings.InvalidKey;

            // Switch to the iframe of https://demo.nopcommerce.com/
            homepage.iframe();

            // Enter a character
            homepage.inputSearch.sendKeys(invalidKey);

            // Click on Search button
            homepage.btnSearch.click();

            // Click on Advanced Search checkbox
            homepage.advSearchCheckbox.click();

            // Click on Manufacturer drop down
            homepage.manufacturerDdl.click();

            Thread.sleep(5000);

            // Manufacturer drop-down
            Select s = new Select(homepage.manufacturerDdl);


            // Array with all the Manufacturer drop-down values
            String[] manulist = {"All", "Apple", "HP", "Nike"};

            List<WebElement> options = s.getOptions();
            for (WebElement manu : options) {
                boolean match = false;
                for (int i = 0; i < manulist.length; i++) {
                    if (manu.getText().equals(manulist[i])) {
                        match = true;
                    }
                }
                assert (match);
            }


        } catch (Exception e) {
            System.out.println("Test Failed :" + e);
        }
    }


        @Test
        public void SearchScenario07() throws InterruptedException {
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


    @Test
    public void SearchScenario08() throws InterruptedException {
        HomePage homepage = new HomePage();
        extent.createTest("Scenario-8: Validating search result after searching with a partial valid search key, result should return correct product result");

        try {

            // Read data from TestConfig.properties
            String partialValidKey = Settings.PartialValidKey;


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


            // Validate sort by drop down is displayed into the search result section
            assert(homepage.pageSize.isDisplayed());



        } catch (Exception e) {
            e.printStackTrace();
        }



    }

    @Test

    public void SearchScenario09() throws InterruptedException {
        HomePage homepage = new HomePage();
        extent.createTest("Scenario-9: Validating search result after searching with a lowercase valid search key with all advanced search parameter used, result should return correct product result with any case");

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




