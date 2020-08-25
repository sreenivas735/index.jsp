package com.github.perscholas.jspmodels;

import com.git_leon.leonium.browsertools.WebPage;
import com.git_leon.leonium.browsertools.browserhandler.BrowserHandlerInterface;
import com.git_leon.leonium.browsertools.factories.BrowserHandlerFactory;
import org.openqa.selenium.By;

/**
 * Created by leon on 8/25/2020.
 */
public class IndexJsp extends WebPage {
    private By byLoginLink = By.id("login-link");

    public IndexJsp() {
        this(BrowserHandlerFactory.CHROME.getBrowserHandler());
    }

    public IndexJsp(BrowserHandlerInterface browserHandler) {
        super(browserHandler);
    }

    public void navigateTo() {
        getBrowserHandler().navigateTo("http://localhost:8080/sample/");
    }

    public void clickLoginLink() {
        getBrowserHandler().click(byLoginLink);
    }
}
