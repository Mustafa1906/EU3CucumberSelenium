package com.vytrack.step_definitions;

import com.vytrack.pages.CalendarEventsPage;
import com.vytrack.pages.ContactsPage;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CalendarEventsSubtitle {

    @Then("the page subtitle should be {string}")
    public void the_page_subtitle_should_be(String string) {
        BrowserUtils.waitFor(4);
        String Actualresult = new CalendarEventsPage().getPageSubTitle();
        String expected = "All Calendar Events";
        Assert.assertEquals(expected, Actualresult);

    }
    @Then("the user takes name and surname by using {string}")
    public void the_user_takes_name_and_surname_by_using(String email) {
        BrowserUtils.waitFor(4);

        String actualResult = new ContactsPage().getNameAndSurnameByEmail(email);
        String expectedResult="MariamBrackstone";
        Assert.assertEquals(expectedResult,actualResult);

    }


}