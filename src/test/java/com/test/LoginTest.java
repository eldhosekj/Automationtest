package com.test;

import org.testng.annotations.Test;

import loginpage.LoginPage;

public class LoginTest extends baseclass {

    @Test
    public void testLogin() {
        driver.get("https://woocommerce-850415-2933260.cloudwaysapps.com/my-account");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("test_customer", "password");
    }
}
