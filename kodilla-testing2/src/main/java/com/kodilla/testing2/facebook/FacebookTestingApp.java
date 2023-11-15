package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;

public class FacebookTestingApp {
    public static final String XPATH_COOKIE = "//div[contains(@class, \"al64\")]/button[2]";
    public static final String XPATH_NEW_ACCOUNT = "//div[contains(@class, \"6ltg\")]/a";

    public static final String XPATH_SELECT_DAY = "//div[contains(@class,\"5k_5\")]/span/span/select[1]";
    public static final String XPATH_SELECT_MONTH = "//div[contains(@class,\"5k_5\")]/span/span/select[2]";
    public static final String XPATH_SELECT_YEAR = "//div[contains(@class,\"5k_5\")]/span/span/select[3]";


    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://www.facebook.com/");


        driver.findElement(By.xpath(XPATH_COOKIE)).click();

        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);


        driver.findElement(By.xpath(XPATH_NEW_ACCOUNT)).click();

        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);


        WebElement selectDay = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select day = new Select(selectDay);
        day.selectByIndex(29);

        WebElement selectMonth = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select month = new Select(selectMonth);
        month.selectByIndex(4);

        WebElement selectYear = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select year = new Select(selectYear);
        year.selectByIndex(34);

    }
}
