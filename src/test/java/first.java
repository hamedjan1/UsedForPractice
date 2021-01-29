import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class first {


        public static void main(String[] args) {
     //
     //   System.out.println("hello");
      //System.setProperty("webdriver.chrome.driver","C:\\Users\\Hamed\\Downloads\\chromedriver_win32\\chromedriver.exe");
            //
//            WebDriverManager.chromedriver().setup();
//
//            ChromeOptions option = new ChromeOptions();
//            option.addArguments("user-data-dir = C:/Users/Hamed/AppData/Local/Google/Chrome/User Data/Profile 1");
//            WebDriver driver = new ChromeDriver(option);
//            driver.get("https://www.google.com");

           // System.setProperty("webdriver.ie.driver", "C:\\Users\\Hamed\\Downloads\\IEDriverServer_Win32_3.150.1\\IEDriverServer.exe");












            WebDriverManager.chromedriver().setup();
            WebDriver d = new ChromeDriver();
            d.get("https://www.google.com");
            //d.manage().window().fullscreen();


            d.quit();




    }





}
