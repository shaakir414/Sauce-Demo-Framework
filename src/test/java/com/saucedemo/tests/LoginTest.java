package com.saucedemo.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.saucedemo.base.BaseTest;
import com.saucedemo.pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void testValidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");
        
        // Assert URL redirected to inventory page
        Assert.assertTrue(driver.getCurrentUrl().contains("inventory.html"), "Login Failed!");
    }
}
