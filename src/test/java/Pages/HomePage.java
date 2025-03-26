package Pages;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import java.util.List;

public class HomePage {

    Page page;
    Locator navigationBar = page.locator("//div[@class='top-nav ']");
    Locator onDemandTab = page.locator(navigationBar+"//a[normalize-space()='On Demand']");
    Locator welcomePopup = page.locator("//div[@class='popUpContainer welcome-modal-popup']");
    Locator welcomePopUpCloseButton = page.locator(welcomePopup+"//span//button[@class=\"imageButton \"]");
    //OnDemandPage
    Locator moviesSection = page.locator("");
    Locator filterButton = page.locator("//div[contains(text(),'Filter')]");
    Locator applyButton = page.locator("//div[@class='filter-button filter-apply-button filter-button-enabled']");


    public HomePage(Page page) {
        this.page = page;
    }

    public void launchTelusTv() {
        page.navigate("https://telustvplus.com/");
    }

    public void closeWelcomePopup() {
        welcomePopup.click();
        welcomePopUpCloseButton.click();
    }

    public void goToOnDemandTab() {
        onDemandTab.click();
    }

    //OnDemandPage
    public void goToMoviesSection() {
        page.getByText("Movies").click();
    }

    public void clickOnFilter() {
        filterButton.click();
        page.getByLabel("Animated").check();
        applyButton.click();
    }

    public void fetchListOfElements(){
        List<ElementHandle> elements = page.querySelectorAll("//div[@class='grid']//div[@class='row']");
        for (ElementHandle element : elements) {
            System.out.println(element.textContent());
        }
    }

    public  void clickOnElementWithRatingE() {
    System.out.println("Clicked on element with Rating E");
    }



}
