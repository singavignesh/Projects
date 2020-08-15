package org.lang;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public void method() {
	System.setProperty("webdriver.chrome.driver", "\\Users\\Vignesh\\eclipse-workspace\\MavenProject\\Driver\\chromedriver.exe");
	WebDriver driver  = new ChromeDriver();
	driver.get("https://wwww.facebook.com");
		}
	
	public void method2() {
		System.out.println("I am normal");
	}
	
	public static void main(String[] args) {
		BaseClass st = new BaseClass();
		st.method();
		
		
	}

}

