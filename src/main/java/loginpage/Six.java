package loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Six{
    private WebDriver driver;
    
    private By addToCartButton = By.xpath("//button[normalize-space()='Add to cart']");
    private By viewCartLink = By.xpath("//a[@title='View cart']");

    private By firstNameField = By.xpath("//input[@name='billing_first_name']");
    private By lastNameField = By.xpath("//input[@name='billing_last_name']");
    private By companyNameField = By.xpath("//input[@name='billing_company']");
    private By countryDropdown = By.xpath("//select[@id='billing_country']");
    private By streetAddressField = By.xpath("//input[@name='billing_address_1']");
    private By cityField = By.xpath("//input[@name='billing_city']");
    private By stateDropdown = By.xpath("//select[@id='billing_state']");
    private By postcodeField = By.xpath("//input[@name='billing_postcode']");
    private By phoneNumberField = By.xpath("//input[@name='billing_phone']");
    private By emailAddressField = By.xpath("//input[@name='billing_email']");
    private By productdelivery = By.xpath("//input[@id='product_delivery_yes']");
    private By ordertotal = By.xpath("//tr[@class='order-total']//bdi[1]");
    private By packing = By.xpath("//input[@id='packaging_wooden']");
    private By deliveryDateField = By.xpath("//input[@name='delivery_date']");
    private By deliveryTimeField = By.xpath("//input[@name='delivery_time']");
    private By paymentMethod = By.xpath("//input[@id='payment_method_cod']");
    private By placeOrderButton = By.xpath("//button[@id='place_order']");
    private By confirmationMessage = By.xpath("//p[contains(text(),'Thank you. Your order has')]");

}
