package com.ct.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class HighLight {

    public static void highlightElement(WebElement element, Object driver) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style', arguments[1);]", element, "border:solid red;");
        Thread.sleep(1000);
        js.executeScript("arguments[0].setAttribute('style',arguments[1]);", element, "");
    }

}
