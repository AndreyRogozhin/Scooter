import org.example.MainPage;
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
    public int questionText;
    @Parameterized.Parameter(2)
    public int answerExpected;



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

            By question = By.id("accordion__heading-" + number);
            By answer = By.id("accordion__panel-" + number);

            driver.findElement(question).getText(); // не то получается
            assertEquals("Не тот ответ!", answerExpected, answerFound);
            }


        }

        // "accordion__heading-" + number ( или использовать Format )
    // "accordion__panel-" + number ( или использовать Format )


}
