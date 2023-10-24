package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RentPage {
    private WebDriver driver;
    //   RentPage
//    здесь есть форма заполнения RentForm и кнопка Заказать

    // локатор дата
    private By dateStart = By.xpath(".//input[@placeholder='* Когда привезти самокат ']");

    // локатор срок
    private By dateEnd = By.xpath(".//div[text()='* Срок аренды']");

    // локатор цвет
    private By color = By.xpath(".//div[text()='Цвет самоката'");

    // локатор комментарий
    private By firstName = By.xpath(".//input[@placeholder='Комментарий для курьера']");


    // локатор кнопка Заказать
    private By rentDataSendButton = By.xpath(".//button[text()='Заказать']");

    public RentPage(WebDriver driver) {
        this.driver = driver;
    }


    // нажатие кнопки "Далее"
    public void rentDataSendButtonClick () {
        driver.findElement(rentDataSendButton).click();


    }
}