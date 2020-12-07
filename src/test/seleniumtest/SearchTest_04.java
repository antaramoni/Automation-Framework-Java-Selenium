package seleniumtest;


import org.testng.annotations.Test;
import testelements.pages.HomePage;

public class SearchTest_04 extends TestInitialize {

    @Test
    public void SearchTest04() throws InterruptedException {

        extent.createTest("Scenario-4:");

        HomePage homepage = new HomePage();


        try {

            Thread.sleep(2000);

            // Switch to the iframe of https://demo.nopcommerce.com/
            homepage.iframe();

            // Enter a character
            homepage.inputSearch.sendKeys("aaa");

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

}
