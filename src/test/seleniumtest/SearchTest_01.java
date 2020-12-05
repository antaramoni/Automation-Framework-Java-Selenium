package seleniumtest;

import org.junit.Test;
import testpackage.pages.HomePage;


public class SearchTest_01 extends TestInitialize {


   HomePage homepage = new HomePage();


    @Test
    public void SearchTest01() {


        try {

            // Validate Search button has text SEARCH
            assert (homepage.btnSearch.getText().equals("SEARCH"));
            System.out.println("Validating Search button has the correct button text is passed :" +homepage.btnSearch.getText());

        } catch (Exception e) {
            System.out.println("Validating Search button has the correct button text throws exception :" + e);
        }

/*
        // Search Textbox is available
        try {

            assert (homepage.btnSearch.getText().equals("SEARCH"));
            System.out.println("Validating Search button has has a text box is passed :"+homepage.btnSearch.getText());

        } catch (Exception e) {
            System.out.println("Validating Search button has a text box throws exception :" + e);
        }
*/



    }
}


