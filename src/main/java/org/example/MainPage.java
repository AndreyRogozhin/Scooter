package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private WebDriver driver;

    // элементы главной страницы https://qa-scooter.praktikum-services.ru/
    //Это MainPage, по нажатию на кнопку Заказать открывается следующая - OrderPage,

    // кнопка "Заказать" в двух местах -  локатор кнопки заказа номер 1
    private final By orderButton = By.className("Button_Button__ra12g");

   //раздел "Вопросы о важном"  - локатор раздела
   private final By FAQlist = By.className("Home_FAQ__3uVm4");

    public MainPage(WebDriver driver) {
        this.driver = driver;}


//  нажатие кнопки "Заказать"
    public void clickOrderButton(){
        driver.findElement(orderButton).click();
    }







    //  прокрутка до вопросов
}
