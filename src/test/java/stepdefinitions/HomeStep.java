package stepdefinitions;

import Pages.BasePage;
import Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeStep extends BasePage {

    HomePage homePage;

    @When("^User launches the TelusTv website$")
        public void user_launches_the_TelusTv_website() {
            homePage.launchTelusTv();
        }

    @And("^User closes the welcome popup$")
    public void user_closes_the_welcome_popup() {
        homePage.closeWelcomePopup();
    }


    @When("^User clicks on On Demand tab$")
    public void when_user_clicks_on_OnDemand_tab() {
        homePage.goToOnDemandTab();
    }

    @And("^User scroll to Movies section and clicks on View All$")
    public void user_scroll_to_movies() {
       homePage.goToMoviesSection();
    }

    @And("^User clicks on Filter and select Animated section$")
    public void user_clicks_on_Filter_and_select_Animated_section() {
        homePage.clickOnFilter();
    }

    @Then("^User find and selects an asset with rating E$")
    public void user_find_and_selects_an_asset_with_rating_E() {
        homePage.fetchListOfElements();
        homePage.clickOnElementWithRatingE();
    }

//    @And("User clicks the asset poster to open the details page")
//    public void user_clicks_the_asset_poster_to_open_the_details_page() {
//
//
//    }
}
