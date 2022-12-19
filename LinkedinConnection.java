package com.xcompany;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class LinkedinConnection {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C://selinium jar driver//driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //------------------------------- Login ------------------------------------------
        driver.get("https://in.linkedin.com/");
        Thread.sleep(5000);
        String email ="Youridhere@gmail.com";
        String pwd ="password";
        driver.findElement(By.id("session_key")).sendKeys(email);
        driver.findElement(By.id("session_password")).sendKeys(pwd);
        Thread.sleep(4000);
        driver.findElement(By.xpath("//button[@class='sign-in-form__submit-button']")).click();
        Thread.sleep(3000);                 // sleep 9 sec
        //------------------------------- Search people ------------------------------------------
        int count=0;
        while (count <=5) {
            String keywords [] = {"web%20developer",""};
            String link ="https://www.linkedin.com/search/results/people/?heroEntityKey=urn%3Ali%3Aautocomplete%3A-2094486798&keywords=web%20developer&origin=GLOBAL_SEARCH_HEADER&position=0&searchId=9c4a0345-f5b6-4b5f-8c39-a1785f6cd59c&sid=)Ll";
            driver.get(link);
            Thread.sleep(2000);
            driver.findElement(By.xpath("//span[text()='Connect']")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//button[@aria-label='Send now']")).click();
//            driver.findElement(By.xpath("//span[text()='Next']")).click();
            count++;
        }




    }
}
