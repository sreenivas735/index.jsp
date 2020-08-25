package com.github.perscholas.jsptests;

import com.github.perscholas.jspmodels.SuccessJsp;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 8/25/2020.
 */
public class SuccessJspTest {
    @Test
    public void test() {
        SuccessJsp successJsp = new SuccessJsp();
        successJsp.navigateTo();
        Assert.assertTrue(successJsp.validate());
    }
}
