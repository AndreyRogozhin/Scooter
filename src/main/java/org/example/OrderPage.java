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
    //private String  metroStationName;
    //private By metroStation;
    private final By metroStation = By.xpath(".//input[@placeholder='* Станция метро']");

    // локатор номер телефона
    private final By phoneNumber = By.xpath(".//input[starts-with(@placeholder,'* Телефон')]");

    // локатор кнопка Далее
    private final By orderDataSendButton = By.xpath(".//button[text()='Далее']");

    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void  setFirstName (String firstName){driver.findElement(this.firstName).sendKeys(firstName);}
    public void  setLastName (String lastName){driver.findElement(this.lastName).sendKeys(lastName);}
    public void  setMetroStation (String metroStation){driver.findElement(this.metroStation).sendKeys(metroStation);}
    /*public void  setMetroStation (String metroStation){
        this.metroStationName = metroStation;
        this.metroStation =  By.xpath(".//input[@placeholder='* Станция метро' and @value='"+metroStationName+"']");
        driver.findElement(this.metroStation).click();
    }*/

    public void  setAddress (String address){driver.findElement(this.address).sendKeys(address);}
    public void  setPhoneNumber (String phoneNumber){driver.findElement(this.phoneNumber).sendKeys(phoneNumber);}


    public void fillOrderForm( String firstName, String lastName, String address, String metroStation, String phoneNumber  ){
     /*   driver.findElement(this.firstName).sendKeys(firstName);
        driver.findElement(this.lastName).sendKeys(lastName);
        // что делать со станцией метро ?
        driver.findElement(this.address).sendKeys(address);
        driver.findElement(this.phoneNumber).sendKeys(phoneNumber);
*/
        setFirstName(firstName);
        setLastName(lastName);
        setAddress(address);
        setMetroStation(metroStation);
        setPhoneNumber(phoneNumber);
    }

    // нажатие кнопки "Далее"
    public void orderDataSendButtonClick () {
        driver.findElement(orderDataSendButton).click();

    }
}
