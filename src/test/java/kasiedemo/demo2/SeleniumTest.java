package kasiedemo.demo2;

import browser.BrowserGetter;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SeleniumTest {
    private BrowserGetter browserGetter = new BrowserGetter();
    private WebDriver driver;

    @BeforeAll
    public void beforeAll () {
        driver = browserGetter.getChromeDriver();

    }

    @AfterAll
    public void afterAll() {
        driver.quit();

    }

    @Test
    public void openTheComPageAndCheckTheTitle() {
        String expectedComTitle = "Example title";
        driver.get("http//www.example.com");
        assertEquals(expectedComTitle, driver.getTitle());
        Assertions.assertEquals(1,2);
    }

    @Test
    public void  openTheOrgPageAndCheckTheTitle () {
        String expectedOrgTitle = "Example title";
        driver.get("http//www.example.org");
        assertEquals(expectedOrgTitle, driver.getTitle());
        Assertions.assertEquals(1, 2);
    }
}
