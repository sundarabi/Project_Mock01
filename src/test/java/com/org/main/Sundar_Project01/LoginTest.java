package com.org.main.Sundar_Project01;

import com.org.main.Sundar_Project01.BaseTest;
import com.newtours.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testLogin() {
        LoginPage loginPage = new LoginPage(driver);

        // Test data
        String username = "test";
        String password = "test";

        // Test steps
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLogin();

        // Assertion
        String expectedTitle = "Login: Mercury Tours";
        Assert.assertEquals(driver.getTitle(), expectedTitle, "Login Test Failed!");
    }
}
