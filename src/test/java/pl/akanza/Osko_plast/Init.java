package pl.akanza.Osko_plast;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Init {
	
static WebDriver driver;
	
	public static WebDriver getDriver() {
		System.out.println("wewnatrz getDriver");
		System.setProperty("webdriver.chrome.driver", "c:/chromedriver2.45/chromedriver.exe");
    	DesiredCapabilities cap = DesiredCapabilities.chrome();
    	System.out.println("### decyduję czy wykonać new ChromeDriver");
    	
    	if(driver==null) {
    		System.out.println("### TAK ###");
    		driver = new ChromeDriver();
        	System.out.println("get http...");
        	driver.get("tutaj link do strony");
        	return driver;
    	} else {
    		System.out.println("### NIE ###");
    		return driver;
    	}
    	//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    	//sleep(2);
	}
	
	public static void endTest() {
		System.out.println("wewnatrz endTest");
		driver.quit();
		driver = null;
		System.out.println("po endTest");
	}
	
	/**
	 * Metoda wstrzymuje wykonywanie programu na X sekund
	 * @param seconds
	 */
	public static void sleep(int seconds) {
		try {
			Thread.sleep(1000 * seconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
