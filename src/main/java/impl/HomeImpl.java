package impl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import utils.SeleniumUtils;
import utils.WebDriverUtils;

import java.sql.Driver;
import java.util.Set;

public class HomeImpl {
    HomePage page;

    public HomePage getPage(){
        if(page==null)
            page = new HomePage();
        return page;
    }

    public void iClickOnButton(String buttonName) {

        switch (buttonName.toLowerCase()){
            case "facebook": getPage().facebookBtn.click();
                break;
            case "linkedin": getPage().linkedidBtn.click();
                break;
            case "twitter": getPage().twitterBtn.click();
                break;
            default:
                System.out.println("button was not found");
        }
        String currentWindow = WebDriverUtils.getDriver().getWindowHandle();
        Set<String> allWindows = WebDriverUtils.getDriver().getWindowHandles();

        for(String each: allWindows){
            if(!each.equals(currentWindow)){
                WebDriverUtils.getDriver().switchTo().window(each);
               // WebDriverUtils.closeDriver();
            }
        }
    }
}
