package org.example;


import org.openqa.selenium.WebDriver;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    private WebDriver driver;

    public void main(String[] args) {
        //открыть страницу
        //прокрутить до списка вопросов
        //перейти к списку вопросов
        //основной сценарий - открывается вопрос по нажатию на стрелку
        //тест - при нажатии на стрелку открывается строка с соответствующим параметром ( там есть номера accordion__heading-2 и соответственно accordion__panel-2
        //список сответствия выношу в список тестовых данных
        //при проверке сравниваю параметр открывшегося вопроса и эталонный ответ

/*
1) создать экземпляр драйвера
2) перейти по урл
3) создать экземпляр pageObject'а
4) получить текст
 */     ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        // перешли на страницу тестового приложения
        driver.get("https://qa-scooter.praktikum-services.ru/");


        }
    }