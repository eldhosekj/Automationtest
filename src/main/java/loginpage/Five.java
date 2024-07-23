package loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.NoSuchElementException;

public class Five {
    private WebDriver driver;

    static By quickPreviewLink = By.xpath("//li[@class='image-wrap']//img[@alt='RF ID Card']");
    static By quickLink = By.xpath("//li[@class='image-wrap']//a[@id='product_id_145']");
    private By colorDropdown = By.xpath("//select[@id='color']");
    private By orientationDropdown = By.xpath("//select[@id='orientation']");
    private By profileDescription = By.xpath("//textarea[@id='profile_desc']");
    private By addPhoneCheckbox = By.xpath("//input[@id='phone_number_checkbox']");
    private By phoneNumberField = By.xpath("//input[@id='phone_number_field']");
    private By borderone = By.xpath("//img[@class='thwepo-image-box' and @title='dotted']");
    private By bordertwo = By.xpath("//img[@class='thwepo-image-box' and @title='dashed']");
    private By addToCartButton = By.xpath("//button[normalize-space()='Add to cart']");
    private By validationMessage = By.xpath("//strong[normalize-space()='Phone Number']");
    private By viewCartLink = By.xpath("//a[@title='View cart']");
    private By rfIdCardLink = By.xpath("//a[normalize-space()='RF ID Card']");

    public Five(WebDriver driver) {
        this.driver = driver;
    }

    public void scrollToBottom() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }

    public void hoverAndWaitForElement() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Actions actions = new Actions(driver);
        scrollToBottom();
        WebElement previewElement = wait.until(ExpectedConditions.visibilityOfElementLocated(quickPreviewLink));
        actions.moveToElement(previewElement).perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(quickLink));
    }

    public void quickLink() throws InterruptedException {
        driver.findElement(quickLink).click();
        Thread.sleep(3000);
    }

    public void selectColor(String color) throws InterruptedException {
        Thread.sleep(3000);
        new Select(driver.findElement(colorDropdown)).selectByVisibleText(color);
    }

    public void selectOrientation(String orientation) {
        new Select(driver.findElement(orientationDropdown)).selectByVisibleText(orientation);
    }

    public void enterProfileDescription(String description) {
        driver.findElement(profileDescription).sendKeys(description);
    }

    public void addPhoneCheckbox() {
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

       
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);

        wait.until(ExpectedConditions.visibilityOfElementLocated(viewCartLink));
    }

    public void scrollToTop() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 0);");
    }

    public String getValidationMessage() {
    	
        return driver.findElement(validationMessage).getText();
    }

    public void clickViewCart() {
    	Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);

        wait.until(ExpectedConditions.visibilityOfElementLocated(viewCartLink));
        driver.findElement(viewCartLink).click();
    }

    public void clickRfIdCardLink() {
        driver.findElement(rfIdCardLink).click();
        String actualText = driver.findElement(rfIdCardLink).getText();
        String expectedText = "RF ID Card";
        Assert.assertEquals(actualText, expectedText, "Text verification failed!");
    }
}