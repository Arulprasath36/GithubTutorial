package seleniumLearning;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

public class OpenGoogle {

	private static PhantomJSDriver driver;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\Elcot\\Desktop\\drivers\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\Elcot\\Desktop\\drivers\\gecko\\geckodriver.exe"); 
		//WebDriver driver=new FirefoxDriver();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.co.in/");
		//driver.quit();
*/
		Capabilities caps = new DesiredCapabilities();
		((DesiredCapabilities) caps).setJavascriptEnabled(true);
		((DesiredCapabilities) caps).setCapability("takesScreenshot", true);
		((DesiredCapabilities) caps).setCapability(
		PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,
		"C:\\Users\\Elcot\\Downloads\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe"
		);
		driver = new PhantomJSDriver(caps);
		driver.get("http://www.google.co.in");
		if(driver.getTitle().equalsIgnoreCase("google")){
			System.out.println("Google opened");
		}
	}	

}
