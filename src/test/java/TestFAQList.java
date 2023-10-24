import org.example.MainPage;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Parameterized.class)
public class TestFAQList {

    @Parameterized.Parameter(0)
    public int locator;
    @Parameterized.Parameter(1)
    public int textQuestion;
    @Parameterized.Parameter(2)
    public int textAnswer;



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
                { 2, 4, 8, 14 },
                { 1, 1, 5, 7 }
        };
    }

        // дождаться открытия страницы

        @Test
        public void RunTestFAQList()  {

            MainPage objMainPage = new MainPage(driver);

            objMainPage.scrollToFAQList();


        }
}
