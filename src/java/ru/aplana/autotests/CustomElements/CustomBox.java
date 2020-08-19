package ru.aplana.autotests.CustomElements;

import com.aplana.chameleon.elements.selenium.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CustomBox extends WebElementFacade {
    public CustomBox(WebElement element, String elementName, String driverId) {
        super(element, elementName, driverId);
    }

    @Override
    public void type(String value) {
        getWrappedElement().click();
        getWrappedElement().findElement(By.xpath("//*[contains(text(), '"+ value + "')]")).click();
    }

    @Override
    public String getErrorMsg() {
        return null;
    }

    @Override
    public String getLabel() {
        return null;
    }
}
