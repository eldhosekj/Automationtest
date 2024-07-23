package com.test;

import java.io.File;

//import org.testng.Assert;
import org.testng.annotations.Test;
import loginpage.Two;

public class four extends baseclasstwo {
    
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

        if (imageFile.exists()) {
            System.out.println("Image file exists at: " + absolutePath);
            two.uploadLogo(absolutePath); 
        } else {
            System.out.println("Image file does not exist at: " + absolutePath);
        }
        
        two.clickLogoTwo();
        two.clickAddToCart();
        four.getValidationMessage();
        //String validationMessage = four.getValidationMessage();
        //String expectedMessage = "Make at least 2 selections.";
        //Assert.assertEquals(validationMessage, expectedMessage, " message does not match : " + validationMessage);
      // }
	//private static String getValidationMessage() {
		// TODO Auto-generated method stub
		//return null;
	}

	private static void getValidationMessage() {
		// TODO Auto-generated method stub
		
	}
}