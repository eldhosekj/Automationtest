package com.test;

import java.io.File;

import org.testng.annotations.Test;
import loginpage.Two;

public class TwoTest extends baseclasstwo {
    
    @Test
    public void testProductSelection() {
        driver.get("https://woocommerce-850415-2933260.cloudwaysapps.com/product/rf-id-card");

        Two two = new Two(driver);
        two.selectColor("Red");
        two.selectOrientation("Landscape");
        two.enterProfileDescription("profile description");
        two.checkAddPhone();
        two.enterPhoneNumber("9876543210");
        String relativePath = "src/test/java/com/test/a.jpg";
        File imageFile = new File(relativePath);
        String absolutePath = imageFile.getAbsolutePath();

        // Upload the image
        if (imageFile.exists()) {
            System.out.println("Image file exists at: " + absolutePath);
            two.uploadLogo(absolutePath); // Use the absolute path to upload the image
        } else {
            System.out.println("Image file does not exist at: " + absolutePath);
        }
        
        //two.uploadLogo("src/test/java/com/test/a.jpg"); 
        two.clickLogoOne();
        two.clickLogoTwo();
        two.clickAddToCart();
        two.clickViewCart();
        two.clickRfIdCardLink();
    }
}
