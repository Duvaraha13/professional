package org.sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactin {
	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver", "D:\\EClipse workspace\\Day6\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://adactinhotelapp.com/");

		driver.manage().window().maximize();

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		robot.keyPress(KeyEvent.VK_SHIFT);

		robot.keyPress(KeyEvent.VK_D);

		robot.keyRelease(KeyEvent.VK_D);

		robot.keyPress(KeyEvent.VK_U);

		robot.keyRelease(KeyEvent.VK_U);

		robot.keyPress(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_V);

		robot.keyPress(KeyEvent.VK_A);

		robot.keyRelease(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_SHIFT);

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		robot.keyPress(KeyEvent.VK_SHIFT);

		robot.keyPress(KeyEvent.VK_1);

		robot.keyRelease(KeyEvent.VK_1);

		robot.keyPress(KeyEvent.VK_2);

		robot.keyRelease(KeyEvent.VK_2);

		robot.keyPress(KeyEvent.VK_3);

		robot.keyRelease(KeyEvent.VK_3);

		robot.keyRelease(KeyEvent.VK_SHIFT);

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

}