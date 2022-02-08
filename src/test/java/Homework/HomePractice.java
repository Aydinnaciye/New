package Homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePractice {
    public static void main(String[] args) throws InterruptedException {
        //Go to AmazonPage.https://www.Amazon.com/
        System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        Thread.sleep(3000);
        //Verify PageTitle "amazon".
        String expectedTitle="amazon";
        String actualTitle=driver.getTitle();
        Thread.sleep(3000);
        if (expectedTitle.equals(actualTitle)){
            System.out.println("Test passed");
        }else {
            System.out.println("Test Failed" );
            driver.close();
        }
    }

}
