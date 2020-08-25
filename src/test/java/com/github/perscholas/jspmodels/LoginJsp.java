package com.github.perscholas.jspmodels;

import com.git_leon.leonium.browsertools.WebPage;
import com.git_leon.leonium.browsertools.browserhandler.BrowserHandlerInterface;
import com.git_leon.leonium.browsertools.factories.BrowserHandlerFactory;
import org.openqa.selenium.By;

/**
 * Created by leon on 8/25/2020.
 */
public class LoginJsp extends WebPage {
    private By byInputUserName = By.id("input-username");
    private By byInputPassword = By.id("input-password");
    private By byLoginButton = By.id("login-button");

    public LoginJsp() {
        this(BrowserHandlerFactory.CHROME.getBrowserHandler());
    }

    public LoginJsp(BrowserHandlerInterface browserHandler) {
        super(browserHandler);
    }

    public void navigateTo() {
        IndexJsp indexJsp = new IndexJsp(this.getBrowserHandler());
        indexJsp.navigateTo();
        indexJsp.clickLoginLink();
    }

    public void login(String userName, String password) {
        getBrowserHandler().sendKeys(byInputUserName, userName);
        getBrowserHandler().sendKeys(byInputPassword, password);
        getBrowserHandler().click(byLoginButton);
    }

    public void loginWithCorrectCredentials() {
        login("tom", "jerry");
    }
}
