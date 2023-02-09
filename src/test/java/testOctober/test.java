package testOctober;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.testng.annotations.Test;

public class test {
    WebDriverWait wait = null;

    public static WiniumDriver driver;

    @Test
    public void test1_addition()  {
       
        int a=6;
        int b=8;
        int c= a+b;
        System.out.println(c);
    }
    @Test
    public void test2_subtraction()  {
        
        int a=6;
        int b=8;
        int c= b-a;
        System.out.println(c);
    }
    @Test
    public void test3_multiplication()  {
        
        int a=6;
        int b=8;
        int c= b*a;
        System.out.println(c);
    }
}
