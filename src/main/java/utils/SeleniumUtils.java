package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

public class SeleniumUtils {

    /**
     * This method will handle switching form one window to another.
     * NOTE: method handles only 2 windows at a time.
     */
    public static void switchToNextWindow(){
        String currentWindow = WebDriverUtils.getDriver().getWindowHandle();
        Set<String> allWindows = WebDriverUtils.getDriver().getWindowHandles();

        for(String each: allWindows){
            if(!each.equals(currentWindow)){
                WebDriverUtils.getDriver().switchTo().window(each);
                WebDriverUtils.closeDriver();
            }
        }
        WebDriverUtils.closeDriver();
    }
    public static String switchToNextWindowGetTitle(){
        String title="";
        String currentWindow = WebDriverUtils.getDriver().getWindowHandle();
        Set<String> allWindows = WebDriverUtils.getDriver().getWindowHandles();

        for(String each: allWindows){
            if(!each.equals(currentWindow)){
                WebDriverUtils.getDriver().switchTo().window(each);
            }
        }
        title = WebDriverUtils.getDriver().getTitle();
        WebDriverUtils.closeDriver();
        WebDriverUtils.getDriver().switchTo().window(currentWindow);
        return title;

    }

}
