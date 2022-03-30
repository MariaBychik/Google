package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sampleapp {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/main/java/Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        //System.out.println(driver.getPageSource());
        //System.out.println(driver.getWindowHandle());
        //driver.navigate().to("https://www.facebook.com/");
        //driver.navigate().back();
        // System.out.println(driver.getTitle());
        //driver.navigate().forward();

        driver.findElement(By.xpath("//input[@role='combobox']")).sendKeys("погода");
        driver.findElement(By.xpath("//input[@role='combobox']")).sendKeys(Keys.ENTER);
        driver.navigate().back();

        driver.findElement(By.xpath("//span[@class='ly0Ckb']")).click();
        Thread.sleep(500);
        driver.findElement(By.id("K49")).click();
        Thread.sleep(500);
        driver.findElement(By.id("K50")).click();
        Thread.sleep(500);
        driver.findElement(By.id("K51")).click();
        driver.findElement(By.xpath("//input[@role='combobox']")).sendKeys(Keys.ENTER);
        driver.navigate().back();







    }
}
