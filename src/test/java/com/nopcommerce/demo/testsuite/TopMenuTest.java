package com.nopcommerce.demo.testsuite;
/*
1.3. create the @Test method name verifyPageNavigation.use selectMenu method to
select the Menu and click on it and verify the page navigation.
 */

import com.nopcommerce.demo.pages.TopMenuPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {

        TopMenuPage topMenuPage = new TopMenuPage();

        @Test
        public void verifyPageNavigation() {
            topMenuPage.selectMenu("Computers");
        }





    }



