package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

   static WebDriver driver;

    public static void main(String[] args) {
	// write your code here
        System.setProperty("webdriver.chrome.driver","E:\\Balaji\\Balaji\\Testing Software\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://test3.icoreemr.com");
        driver.manage().window().maximize();

        driver.findElement(By.id("username")).sendKeys("daneil");
        driver.findElement(By.id("password")).sendKeys("12345678");
        driver.findElement(By.id("login")).click();

    }
}
