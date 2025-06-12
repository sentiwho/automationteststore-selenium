package com.automationteststore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class App {
    public static void main(String[] args) {
        String url = Config.get("url");
        System.out.println(url);
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        // System.out.println("Title: " + driver.getTitle());
        // driver.quit();
    }
}
