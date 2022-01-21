package Homework;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Homework1 {

        WebDriver driver;
        Faker faker =new Faker();

        @Before
        public  void setUp(){
            System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
            driver.get("https://automationpractice.com/index.php");
        }
        @Test
        public void  signIn(){
            //click on sign in button:
            driver.findElement(By.xpath("//a[class='login']")).click();


            //click on create an account button
            driver.findElement(By.xpath("//button[@id='submitCreate'")).click();

            //send your e-mail
            driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys(faker.internet().emailAddress());
            //verify the text

            driver.findElement(By.xpath("//h1[@class='page-heading']")).getText();
            Assert.assertEquals("Create an account","create an account");

            //verify your information
            driver.findElement(By.xpath("//h3[@class='page-subheading']")).getText();
            Assert.assertEquals("Your personal Information","Your Personal Information");

            //verify the title
            driver.findElement(By.xpath("//*[.='Title']")).getText();
            Assert.assertEquals("Title","Title");

            //select your title
            driver.findElement(By.xpath("//input[@id='id_gender2']")).click();

            //enter your first name
            driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys(faker.name().firstName());

            //enter your last name
            driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys(faker.name().lastName());

            //enter your email
            driver.findElement(By.xpath("//input[@id='email']")).sendKeys("email");

            //enter your password
            driver.findElement(By.xpath("//input[@id='passwd")).sendKeys(faker.internet().password());

            //enter date of birth
            WebElement day = driver.findElement(By.xpath("//select[@id='days']"));
            Select selectedDay = new Select(day);
            selectedDay.selectByIndex(15);

            WebElement month =driver.findElement(By.xpath("//select[@id='months']"));
            Select selectedMonth =new Select(month);
            selectedMonth.selectByIndex(2);

            WebElement year = day.findElement(By.xpath("//select[@id='years]"));
            Select selectedYear = new Select(year);
            selectedYear.selectByIndex(1990);

            //enter your first name
            driver.findElement(By.id("firstname"));

            //enter your last name
            driver.findElement(By.id("lastname"));

            //enter your company
            driver.findElement(By.id("company")).sendKeys(faker.company().name());

            //enter your address
            driver.findElement(By.id("address")).sendKeys("2136  Heidelberg str 10");

            //enter your city
            driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Frankfurt");

            //click register
            driver.findElement(By.xpath("//button[@id='submitAccount']")).click();

            //verify my account is displayed on the home page
            driver.findElement(By.xpath("h1[class='page-heading']"));
            Assert.assertEquals("My Account","My Account");



        }
    }

