package com.automation.framework.base;

import org.openqa.selenium.support.PageFactory;

public abstract class BasePage  extends Base {

    public BasePage() {
        PageFactory.initElements(DriverContext.Driver,this);
    }
}
