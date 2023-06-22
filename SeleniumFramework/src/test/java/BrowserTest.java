import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {
	
	public static void main(String[] args) {
		
		String projectpath = System.getProperty("user.dir");
		System.out.println(projectpath);
		//System.setProperty("webdriver.gecko.driver", "E:\\IAGLearning\\SeleniumFramework\\drivers\\geckodriver\\geckodriver.exe");
		WebDriver driver = new EdgeDriver();

		System.setProperty("webdriver.chrome.driver", projectpath+"/drivers/chromedriver/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
	}
}
