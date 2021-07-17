package com.bridgelabz;

import com.pages.Login;
import org.testng.annotations.Test;

public class UberTest extends Base {
    @Test
    public void loginToApp() throws InterruptedException {
        Login log = new Login(driver);
        log.clickOnLogIn();
        log.clickOnDriveAndDelivery();
        log.setEmail("murari05nitjsr2016@gmail.com");
        log.clickOnNext1();
        log.setPwd("N6202046209@n");
        log.clickOnNext2();
    }

}
