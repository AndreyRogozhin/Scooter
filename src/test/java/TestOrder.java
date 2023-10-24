package org.example;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestOrder{

    private WebDriver driver;

    @Before
    public void setDriver() {
        // Закрой браузер
        driver = new ChromeDriver();
        // перешли на страницу тестового приложения
        driver.get("https://qa-scooter.praktikum-services.ru/");

        // дождаться открытия страницы


    }

    @Test
    public void RunTestOrder()  {

        MainPage objMainPage = new MainPage(driver);
        OrderPage objOrderPage = new OrderPage(driver);
        RentPage objRentPage = new RentPage(driver);
        ConfirmPage objConfirmPage = new ConfirmPage(driver);

        // прокрутить до вопросов о важном
      /*  WebElement element = driver.findElement(By.className("Home_FAQ__3uVm4"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",element);

       */
        objMainPage.clickOrderButton();

// дождаться открытия страницы
        objOrderPage.fillOrderForm("Антон", "Сергеев", "Москва, Лесная, 21", "Белорусская", "+79990001122")
        objOrderPage.orderDataSendButtonClick();

        // дождаться открытия страницы
        objRentPage.fillRentForm("date1", "date2", "серый", "Нет никаких комментариев");
        objRentPage.rentDataSendButtonClick();

        // дождаться открытия страницы
        objConfirmPage.clickConfirmButton();

    }

    @After
    public void teardown() {
        // Закрой браузер
        driver.quit();
    }
}
}
