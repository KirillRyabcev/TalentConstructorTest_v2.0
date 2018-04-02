package edu.bsuir.web.page;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.web.element.LoginElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Acer on 02.04.2018.
 */
public class LoginPage {
    WebDriver driver = WebDriverSingleton.getInstance();

    public void enterLoginPage(){
        driver.get(LoginElements.URL);
    }

    public void typeUsername(String username){
        WebElement element = driver.findElement(LoginElements.USERNAME);
        element.clear();
        element.sendKeys(username);
    }

    public void typePassword(String password){
        WebElement element = driver.findElement(LoginElements.PASSWORD);
        element.clear();
        element.sendKeys(password);
    }

    public void clickLoginButton(){
        WebElement element = driver.findElement(LoginElements.LOGIN_BUTTON);
        element.click();
    }

    public void clickLoginButton2(){
        WebElement element = driver.findElement(LoginElements.getLoginButton("Войти"));
        element.click();
    }

}
