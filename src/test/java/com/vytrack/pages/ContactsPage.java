package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactsPage extends BasePage {

    @FindBy(css=".input-widget")
    public WebElement pageNumber;


    public WebElement getContactEmail(String email){
        String xpath = "//*[contains(text(), '"+email+"') and @data-column-label='Email']";
        return Driver.get().findElement(By.xpath(xpath));
    }
    public  String getNameAndSurnameByEmail(String email){
        String name="//*[contains(text(), '"+email+"') and @data-column-label='Email']//..//td[2]";
        String surName="//*[contains(text(), '"+email+"') and @data-column-label='Email']//..//td[3]";
        String actualName = Driver.get().findElement(By.xpath(name)).getText();
        String actualSurname = Driver.get().findElement(By.xpath(surName)).getText();
        return  actualName+actualSurname;


    }


}





