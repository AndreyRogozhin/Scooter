package org.example;

import org.example.MainPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestFAQList {

    @Parameterized.Parameter(0)
    public int number;
    @Parameterized.Parameter(1)
    public String questionText;
    @Parameterized.Parameter(2)
    public String answerExpected;



        private WebDriver driver;

        @Before
        public void setDriver() {
            // Закрой браузер
            driver = new ChromeDriver();
            // перешли на страницу тестового приложения
            driver.get("https://qa-scooter.praktikum-services.ru/");
        }


    @Parameterized.Parameters(name = "Тест {index}: на вопрос (1) нужно получить ответ (2)")
    public static Object[][] data() {
        return new Object[][] {
                { 0, "Сколько это стоит? И как оплатить?", "Сутки — 400 рублей. Оплата курьеру — наличными или картой."  },
        };
    }

        // дождаться открытия страницы

    @Test
    public void RunTestFAQList()  {

        MainPage objMainPage = new MainPage(driver);
        objMainPage.scrollToFAQList();

//            By question = By.id("accordion__heading-" + number);
        //By answer = By.id("accordion__panel-" + number);

        //By answer = By.xpath(".//div[@id='accordion__panel-"+ number+"']/p");
        // [contains(text(),'Сутки — 400 рублей. Оплата курьеру — наличными или картой.')]
        By question = By.xpath(".//div[@class='accordion__button' and text()="+ questionText +"]");
        String answerXPath = ".//div[@class='accordion__button' and text()='"+ questionText +"']"+"/parent::div/parent::div/div[@class='accordion__panel']/p";
        // String questionFound = driver.findElement(question).getText();
        //By answer = By.id(".//div[@class='accordion__panel']/p[contains(text()," + answerExpected + ")]");
        By answer = By.xpath(answerXPath);

        String answerFound = driver.findElement(answer).getText(); // не то получается
        assertEquals("Не тот ответ!", answerExpected, answerFound);
    }

    @After
    public void teardown() {
        // Закрой браузер
        driver.quit();
    }
}

// "accordion__heading-" + number ( или использовать Format )
// "accordion__panel-" + number ( или использовать Format )

