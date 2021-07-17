package com.pages;

import com.bridgelabz.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends Base {

    @FindBy(xpath = "//button[normalize-space()='Log in']//*[local-name()='svg']")
    WebElement logInButton;

    @FindBy(xpath = "//h2[normalize-space()='Sign in to drive & deliver']")
    WebElement driveAndDeliver;

    @FindBy(xpath = "//h2[normalize-space()='Sign in to ride']")
    WebElement ride;

    // @FindBy(xpath = "//h2[normalize-space()='Sign in to order delivery with Uber Eats']")


    @FindBy(id = "useridInput")
    WebElement email;

    @FindBy(xpath = "//*[@id=\"app-body\"]/div/div/form/div[2]/button")
    WebElement next;

    @FindBy(id = "password")
    WebElement pwd;
// //*[@id="app-body"]/div/div/form/div[2]/button/i
    @FindBy(xpath = "//*[@id=\"app-body\"]/div/div/form/div[2]/button/i")
    WebElement next2;

//qmfB5i_B-F4cX1x1Qco1qNkp0zutkVp7eMv99Zw3
    //(224) 412-3250   +12244123250
    public Login(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    Actions act = new Actions(driver);

    public void clickOnLogIn() throws InterruptedException {
        System.out.println("Hi1");
        logInButton.click();
        Thread.sleep(2000);
        System.out.println("Hi2");
    }

    public void clickOnDriveAndDelivery() throws InterruptedException {
        System.out.println("Hi3");
        Thread.sleep(2000);
        System.out.println(act);
        //  act.contextClick(driveAndDeliver).build().perform();
        act.doubleClick(driveAndDeliver).build().perform();
        //driveAndDeliver.click();
        Thread.sleep(3000);

        System.out.println("Hi4");
    }

    public void setEmail(String inputEmail) throws InterruptedException {
        Thread.sleep(2000);
        email.sendKeys(inputEmail);

    }

    public void clickOnNext1() throws InterruptedException {
        Thread.sleep(3000);
        act.click(next).build().perform();
        System.out.println("Hi5");
        Thread.sleep(3000);

    }

    public void setPwd(String password) {
        pwd.sendKeys(password);

    }

    public void clickOnNext2() throws InterruptedException {
        Thread.sleep(3000);
        act.click(next2).build().perform();
        System.out.println("Hi6");
        Thread.sleep(3000);

    }


}
