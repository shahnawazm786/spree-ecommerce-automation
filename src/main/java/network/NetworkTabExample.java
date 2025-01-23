package network;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.DesiredCapabilities;

public class NetworkTabExample {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.get("https://www.cunard.com/en-gb");
        //LoggingPreferences perf=new LoggingPreferences();
        JavascriptExecutor js=(JavascriptExecutor)driver;
        //Object data=js.executeScript(" return performance.getEntriesByType('navigation')[0].transferSize;");
        Thread.sleep(5000);
        /*String script="return window.performance.getEntriesByType('resource');\" )\n" +
                "  .then( (perfEntries)=> {\n" +
                "    let gaCalls = perfEntries.filter(function(entry){\n" +
                "      return /collect\\?/i.test(entry.name);\n" +
                "    });\n" +
                "    console.log(gaCalls);\n" +
                "}";

         */
        String script="return window.performance.getEntriesByType('resource');";
        //Object data=js.executeScript(" return performance.getEntries();");
        Object data=js.executeScript(script);
        System.out.println("=========== Entries data ============");
        System.out.println(data);
        System.out.println("==============================");

        driver.quit();
    }
}
