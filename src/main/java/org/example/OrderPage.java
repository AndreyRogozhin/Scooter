package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPage {
    //OrderPage, на ней есть заголовок, форма заказа и кнопка "Далее"
    // После нажатия кнопки открывается    вторая страница - "Про аренду"

    private WebDriver driver;

    // локатор имя
    private final By firstName = By.xpath(".//input[@placeholder='* Имя']");

    // локатор фaмилия
    private final By lastName = By.xpath(".//input[@placeholder='* Фамилия']");

    // локатор адрес
    private final By address = By.xpath(".//input[starts-with(@placeholder,'* Адрес')]");

    // локатор станция метро
    private final By metroStation = By.xpath(".//input[@placeholder='* Станция метро']");

    // локатор номер телефона
    private final By phoneNumber = By.xpath(".//input[starts-with(@placeholder='* Телефон']");

    // локатор кнопка Далее
    private final By orderDataSendButton = By.xpath(".//button[text()='Далее']");

    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }

//    public void  setFirstName (String firstName){driver.findElement(this.firstName).sendKeys(firstName)}
//    public void  setFirstName (String lastName){driver.findElement(this.lastName).sendKeys(lastName)}
//    public void  setFirstName (String address){driver.findElement(this.address).sendKeys(address)}
//    public void  setFirstName (String phoneNumber){driver.findElement(this.phoneNumber).sendKeys(phoneNumber)}


    // заполнение формы - функция с 5 параметрами
    public void fillOrderForm( String firstName, String lastName, String address, String metroStation, String phoneNumber  ){
        driver.findElement(this.firstName).sendKeys(firstName);
        driver.findElement(this.lastName).sendKeys(lastName);
        // что делать со станцией метро ?
        driver.findElement(this.address).sendKeys(address);
        driver.findElement(this.phoneNumber).sendKeys(phoneNumber);


    }


    // нажатие кнопки "Далее"
    public void orderDataSendButtonClick () {
        driver.findElement(orderDataSendButton).click();

    }
}
