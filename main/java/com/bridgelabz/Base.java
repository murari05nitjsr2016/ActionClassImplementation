package com.bridgelabz;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base {
    public static WebDriver driver;

    /* @Description - To do the basic operation like launch the browser
     * and navigate to particular url */
    @BeforeTest
    public void setUp() throws InterruptedException {
        //1.OPEN THE CHROME BROWSER
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2.NAVIGATE TO THE URL
        driver.get("https://www.uber.com/in/en/?_ga=2.10452533.1072715591.1625638646-1114152474.1625638646");

        //driver.manage().deleteAllCookies();
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep (4000);
    }
    /*@Description - This is 2nd  basic method to close the opened browser
     */
   // @AfterTest
    public void tearDown(){
        //3.CLOSE THE BROWSER
        driver.close ();
    }
}
