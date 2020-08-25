package com.github.perscholas.jspmodels;

import com.git_leon.leonium.browsertools.WebPage;
import com.git_leon.leonium.browsertools.With;
import com.git_leon.leonium.browsertools.browserhandler.BrowserHandlerInterface;
import com.git_leon.leonium.browsertools.factories.BrowserHandlerFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by leon on 8/25/2020.
 */
public class SuccessJsp extends WebPage {
    private By byTitle = With.tagAndText("title", "Success Page");
    private By byHeader = With.tagAndText("h1", "You have successfully logged in!");

    public SuccessJsp() {
        this(BrowserHandlerFactory.CHROME.getBrowserHandler());
    }

    public SuccessJsp(BrowserHandlerInterface browserHandler) {
        super(browserHandler);
    }

    public void navigateTo() {
        LoginJsp loginJsp = new LoginJsp(getBrowserHandler());
        loginJsp.navigateTo();
        loginJsp.login("tom", "jerry");
    }

    public boolean validate() {
        WebElement titleElement = getBrowserHandler().getElement(byTitle);
        WebElement headerElement = getBrowserHandler().getElement(byHeader);
        return titleElement != null && headerElement != null;
    }
}
