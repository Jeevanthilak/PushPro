package git_Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GitPush {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jeevan kumar p\\Downloads\\chromedriver_win32\\chromedriver.exe");
	ChromeOptions obj = new ChromeOptions();
		obj.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(obj);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.navigate().to("https://www.interviewbit.com/infosys-interview-questions");		
		driver.get("https://www.facebook.com");
	}
	

}
