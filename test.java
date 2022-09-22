package script;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


public class test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mehr.unnisa\\eclipse-workspace\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "http://demo.guru99.com/test/newtours/";  
        driver.get(baseUrl);
        driver.get("https://www.lambdatest.com/");
        ((RemoteWebDriver) driver).executeScript("window.scrollBy(0,450)", "");
        driver.close();
        System.out.println("Happy coding:(");
	}
}
