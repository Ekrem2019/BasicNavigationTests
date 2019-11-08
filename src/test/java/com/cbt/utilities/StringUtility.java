package com.cbt.utilities;
import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class StringUtility {
   public static void verifyEquals (String expected, String actual){
       String result = expected.equals(actual)? "PASS":"FAIL";
       System.out.println(result);
   }}
}
