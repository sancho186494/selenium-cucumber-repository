package ru.aplana.autotests.CustomElements;

import com.aplana.chameleon.elements.selenium.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CustomInput extends WebElementFacade {

    public CustomInput(WebElement element, String elementName, String driverId) {
        super(element, elementName, driverId);
    }

    @Override
    public String getPlaceholder() {
        return getWrappedElement().findElement(By.xpath("./../../div[contains(@data-marker, 'Error')]")).getText();
    }

    @Override
    public void sendKeys(CharSequence... keysToSend) {

        this.getWrappedElement().click();
        for (int i = 0; i < keysToSend[0].length(); i++) {
            this.getWrappedElement().sendKeys(String.valueOf(keysToSend[0].charAt(i)));
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
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
