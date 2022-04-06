package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.pages.Us_14;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class us_14 {

Us_14 us_14= new Us_14()
    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        new LoginPage().login();
    }
    @When("the user clicks the magnifier icon      on the right top")
    public void the_user_clicks_the_magnifier_icon_on_the_right_top() {
        BrowserUtils.waitForClickablility(us_14.surch,3);
        us_14.surch.click();

    }
    @When("users search any existing file\\/folder\\/user name")
    public void users_search_any_existing_file_folder_user_name() {

    }
    @Then("verify the app displays the expected result option")
    public void verify_the_app_displays_the_expected_result_option() {

    }
}
