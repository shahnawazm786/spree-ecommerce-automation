package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {
    public static WebDriver driver;
    @Before
    public void init(){
    }
    @After
    public void tearDown(){

    }
}
