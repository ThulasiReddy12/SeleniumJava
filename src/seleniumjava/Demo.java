package seleniumjava;


import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\kalwakolu.thulasi\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.google.com");	
}
	
}
