package com.kodilla.testing2.crudapp;

import com.kodilla.testing2.config.WebDriverConfig;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class CruddAppTestSuite {
    private static final String BASE_URL = "https://damiannu.github.io/";
    final String XPATH_TASK_NAME = "//form[contains(@action,\"createTask\")]/fieldset[1]/input";
    final String XPATH_TASK_CONTENT = "//form[contains(@action,\"createTask\")]/fieldset[2]/textarea";
    final String XPATH_ADD_BUTTON = "//form[contains(@action,\"createTask\")]/fieldset[3]/button";
    private WebDriver driver;

    @BeforeEach
    public void initTests() {
        driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get(BASE_URL);
    }

    @AfterEach
    public void cleanUpAfterTest() {
        driver.close();
    }
}