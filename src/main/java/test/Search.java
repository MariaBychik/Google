package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/main/java/Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");


    }
}

