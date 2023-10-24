package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RentPage {
    private WebDriver driver;
    //   RentPage
//    здесь есть форма заполнения RentForm и кнопка Заказать

    // локатор дата
    private final By dateStart = By.xpath(".//input[@placeholder='* Когда привезти самокат ']");

    // локатор срок
    private final By dateEnd = By.xpath(".//div[text()='* Срок аренды']");

    // локатор цвет
    private final By color = By.xpath(".//div[text()='Цвет самоката'");

    // локатор комментарий
    private final By comment = By.xpath(".//input[@placeholder='Комментарий для курьера']");

    // локатор кнопка Заказать
    private final By rentDataSendButton = By.xpath(".//button[text()='Заказать']");

    public RentPage(WebDriver driver) {
        this.driver = driver;
    }


    public void  setDateStart (String dateStart){driver.findElement(this.dateStart).sendKeys(dateStart);}
    public void  setDateEnd   (String dateEnd){driver.findElement(this.dateEnd).sendKeys(dateEnd);}
    public void  setColor    (String color){driver.findElement(this.color).sendKeys(color);}
    public void  setComment (String comment){driver.findElement(this.comment).sendKeys(comment);}


    // заполнение формы - функция с 5 параметрами
    public void fillRentForm( String dateStart, String dateEnd, String color, String comment  ) {
        /*
        driver.findElement(this.dateStart).sendKeys(dateStart);
        driver.findElement(this.dateEnd).sendKeys(dateEnd);
        // что делать со станцией метро ?
        driver.findElement(this.color).sendKeys(color);
        driver.findElement(this.comment).sendKeys(comment);
        */
        setDateStart(dateStart);
        setDateEnd(dateEnd);
        setColor(color);
        setComment (comment);

    }




    // нажатие кнопки "Далее"
    public void rentDataSendButtonClick () {
        driver.findElement(rentDataSendButton).click();

    }
}