package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FacebookTestingApp {
    public static final String XPATH_COOKIE = "//div[contains(@class, \"al64\")]/button[2]";
    public static final String XPATH_NEW_ACCOUNT = "//div[contains(@class, \"6ltg\")]/a";
    public static final String XPATH_SELECT_DAY = "//*[@id=\"day\"]";
    public static final String XPATH_SELECT_MONTH = "//*[@id=\"month\"]";
    public static final String XPATH_SELECT_YEAR = "//*[@id=\"year\"]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://www.facebook.com/");

        driver.findElement(By.xpath(XPATH_COOKIE)).click();

        driver.findElement(By.xpath(XPATH_NEW_ACCOUNT)).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("day")));

        WebElement selectDay = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select day = new Select(selectDay);
        day.selectByIndex(12);

        WebElement selectMonth = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select month = new Select(selectMonth);
        month.selectByIndex(6);

        WebElement selectYear = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select year = new Select(selectYear);
        year.selectByIndex(12);
    }
}