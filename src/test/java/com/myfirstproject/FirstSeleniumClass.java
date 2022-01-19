package com.myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumClass {
public static void main(String[]args) {
    //It is used to set the driver
            //The name of the driver  //The path of the driver
    System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver");

    //This is PolyMorphism
    //Creating obj by using sub child
    //Interview question
    //How you used PolyMorphism in your project
    //Creating the Instance-object of driver
    WebDriver driver = new ChromeDriver();
    //WebDriver driver2= new FirefoxDriver();

    driver.get("https:www.google.com");

    //maximize
    driver.manage().window().maximize();







}



}


