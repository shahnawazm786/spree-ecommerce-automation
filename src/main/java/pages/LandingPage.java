package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
    private WebDriver driver;
    public LandingPage(WebDriver driver){
        this.driver=driver;
       PageFactory.initElements(driver,this);

    }
}