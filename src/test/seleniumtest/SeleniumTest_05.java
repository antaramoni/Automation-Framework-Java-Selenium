package seleniumtest;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import testpackage.pages.HomePage;

import java.util.List;

public class SeleniumTest_05 extends TestInitialize {

    @Test
    public void SearchTest05() throws InterruptedException {

        HomePage homepage = new HomePage();


        try {

            // Switch to the iframe of https://demo.nopcommerce.com/
            homepage.iframe();

            // Enter a character
            homepage.inputSearch.sendKeys("aaa");

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

}