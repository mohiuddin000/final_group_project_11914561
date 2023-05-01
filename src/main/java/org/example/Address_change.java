package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address_change
{
    public WebDriver driver;

    @FindBy(id = "userid")
    public WebElement usernameInput;

    @FindBy(xpath = "//button[@id='signin-continue-btn']")
    public WebElement loginbutton1;

    @FindBy(id = "pass")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@id='sgnBt']")
    public WebElement loginButton2;

    @FindBy(xpath = "//b[normalize-space()='raj']")
    public WebElement userss;

    @FindBy(xpath = "//a[normalize-space()='Account settings']")
    public WebElement accountsett;

    @FindBy(xpath = "//a[normalize-space()='Personal information']")
    public WebElement personalinfor;

    @FindBy(xpath = "//span[normalize-space()='Addresses']")
    public WebElement Addresssses;

    @FindBy(xpath = "//a[@aria-label='Edit Shipping address opens in new window or tab.']")
    public WebElement shipping;



    public Address_change(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void login(String username, String password) throws InterruptedException {
        Thread.sleep(20000);
        usernameInput.sendKeys(username);
        Thread.sleep(3000);
        loginbutton1.click();
        Thread.sleep(20000);
        passwordInput.sendKeys(password);
        Thread.sleep(2000);
        loginButton2.click();
        Thread.sleep(20000);

    }
    public void addresssss() throws InterruptedException {
        Thread.sleep(3000);
        userss.click();
        Thread.sleep(3000);
        accountsett.click();
        Thread.sleep(3000);
        personalinfor.click();
        Thread.sleep(40000);
        Addresssses.click();
        Thread.sleep(3000);
        shipping.click();
        Thread.sleep(3000);
    }

}
