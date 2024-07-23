package loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Three {
    private WebDriver driver;

    private By colorDropdown = By.xpath("//select[@id='color']");
    private By orientationDropdown = By.xpath("//select[@id='orientation']");
    private By profileDescription = By.xpath("//textarea[@id='profile_desc']");
    private By addPhoneCheckbox = By.xpath("//input[@id='phone_number_checkbox']");
    private By phoneNumberField = By.xpath("//input[@id='phone_number_field']");
    private By borderone = By.xpath("//img[@class='thwepo-image-box' and @title='dotted']");
    private By bordertwo = By.xpath("//img[@class='thwepo-image-box' and @title='dashed']");
    private By addToCartButton = By.xpath("//button[normalize-space()='Add to cart']");
    private By validationMessage = By.xpath("//strong[normalize-space()='Phone Number']");

    public Three(WebDriver driver) {
        this.driver = driver;
    }

    public void selectColor(String color) {
        new Select(driver.findElement(colorDropdown)).selectByVisibleText(color);
    }

    public void selectOrientation(String orientation) {
        new Select(driver.findElement(orientationDropdown)).selectByVisibleText(orientation);
    }

    public void enterProfileDescription(String description) {
        driver.findElement(profileDescription).sendKeys(description);
    }

    public void checkAddPhone() {
        driver.findElement(addPhoneCheckbox).click();
    }

    public void enterPhoneNumber(String phoneNumber) {
        driver.findElement(phoneNumberField).sendKeys(phoneNumber);
    }

 public void uploadLogo(String filePath) {
        
        WebElement uploadElement = driver.findElement(By.xpath("//input[@id='logo']")); 
        uploadElement.sendKeys(filePath);  

    }

    public void clickLogoOne() {
        driver.findElement(borderone).click();
    }

    public void clickLogoTwo() {
        driver.findElement(bordertwo).click();
    }

    public void clickAddToCart() {
        driver.findElement(addToCartButton).click();
    }
    
    public void scrollToTop(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 0);");
    }
    public String getValidationMessage() {
        return driver.findElement(validationMessage).getText();
    }
}
