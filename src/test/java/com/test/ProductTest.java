package com.test;

import java.io.File;

import org.testng.Assert;
import org.testng.annotations.Test;
import loginpage.Three;  // Import the corrected class name

public class ProductTest extends baseclasstwo {  
    
    @Test
    public void testProductSelection() {
        driver.get("https://woocommerce-850415-2933260.cloudwaysapps.com/product/rf-id-card");

        Three three = new Three(driver);  
        three.selectColor("Red");
        three.selectOrientation("Landscape");
        three.enterProfileDescription("profile description");
        three.checkAddPhone();
        three.enterPhoneNumber("wrerwrwrwrwr");

        String relativePath = "src/test/java/com/test/a.jpg";
        File imageFile = new File(relativePath);
        String absolutePath = imageFile.getAbsolutePath();

        if (imageFile.exists()) {
            System.out.println("Image file exists at: " + absolutePath);
            three.uploadLogo(absolutePath);
        } else {
            System.out.println("Image file does not exist at: " + absolutePath);
        }

        three.clickLogoOne();
        three.clickLogoTwo();
        three.clickAddToCart();

        String validationMessage = three.getValidationMessage();

     String expectedMessage = "Phone Number";

     Assert.assertEquals(validationMessage, expectedMessage, "Validation message does not match the expected message. Actual message: " + validationMessage);
    }}