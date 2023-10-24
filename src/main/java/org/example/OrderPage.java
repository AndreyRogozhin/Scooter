package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPage {
    //OrderPage, на ней есть заголовок, форма заказа и кнопка "Далее"
    // После нажатия кнопки открывается    вторая страница - "Про аренду"

    private WebDriver driver;

    // локатор имя
    private By firstName = By.xpath(".//input[@placeholder='* Имя']");

    // локатор фaмилия
    private By lastName = By.xpath(".//input[@placeholder='* Фамилия']");

    // локатор адрес
    private By address = By.xpath(".//input[starts-with(@placeholder,'* Адрес')]");

    // локатор станция метро
    private By metroStation = By.xpath(".//input[@placeholder='* Станция метро']");

    // локатор номер телефона
    private By phoneNumber = By.xpath(".//input[starts-with(@placeholder='* Телефон']");

    // локатор кнопка Далее
    private By orderDataSendButton = By.xpath(".//button[text()='Далее']");

    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }

    // нажатие кнопки "Далее"
    public void orderDataSendButtonClick () {
        driver.findElement(orderDataSendButton).click();

    }
}
