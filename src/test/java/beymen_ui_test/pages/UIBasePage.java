package beymen_ui_test.pages;

import beymen_ui_test.utilities.*;
import org.junit.*;
import org.openqa.selenium.*;

import java.util.concurrent.*;
import static io.restassured.RestAssured.*;


public class BasePage {



    protected static WebDriver driver;

    @BeforeClass
    public static void setupMethod() {

        driver = Driver.getDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        baseURI = "https://api.trello.com";

    }

    @AfterClass
    public static void tearDown() {
        driver.close();
    }
}
