package com.test;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import loginpage.Five;
import loginpage.Two;

public class FiveTest extends baseclassfive {

    @Test
    public void testProductSelection() throws InterruptedException {
    
        
        Two two = new Two(driver);
        Five five = new Five(driver);
        five.scrollToBottom();
        five.hoverAndWaitForElement();
        five.quickLink();

        two.selectColor("Red");
        two.selectOrientation("Landscape");
        two.enterProfileDescription("profile description");
        two.checkAddPhone();
        two.enterPhoneNumber("9876543210");
        String relativePath = "src/test/java/com/test/a.jpg";
        File imageFile = new File(relativePath);
        String absolutePathh = imageFile.getAbsolutePath();
        if (imageFile.exists()) {
            System.out.println("Image file exists at: " + absolutePathh);
            two.uploadLogo(absolutePathh); 
        } else {
            System.out.println("Image file does not exist at: " + absolutePathh);
        }
        
        two.clickLogoOne();
        two.clickLogoTwo();
        two.clickAddToCart();
        
        five.clickViewCart();
        two.clickRfIdCardLink();
    }
}




