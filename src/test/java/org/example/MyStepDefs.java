package org.example;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class MyStepDefs {
    HomePage homePage = new HomePage();
    CategoryPhones categoryPhones=new CategoryPhones();
    CartSuccessMessage cartSuccessMessage=new CartSuccessMessage();
    RegisterPage registerPage=new RegisterPage();
    SuccessMessage successMessage=new SuccessMessage();
    LapTops lapTops=new LapTops();

    @Given("^user is on homepage$")
    public void user_is_on_homepage()  {
        homePage.VerifyuserisonHomePage();


    }

    @When("^user click on \"([^\"]*)\" link from top menu$")
    public void user_click_on_link_from_top_menu(String categoryLink) {
        homePage.userClickOnCategoryLink( categoryLink);

    }

    @Then("^user should able to navigate to \"([^\"]*)\"$")
    public void user_should_able_to_navigate_to(String _ExpectedUrl)  {
        Assert.assertEquals(Util.geturl(),_ExpectedUrl);

    }
    @Given("^user is on HomePage$")
    public void user_is_on_HomePage()  {
        homePage.VerifyuserisonHomePage();

    }

    @When("^user click on Phone&PDAs$")
    public void user_click_on_Phone_PDAs()  {
        homePage.UserClickOnPhoneAndPDAs();

    }

    @When("^user add HTC Product in to cart$")
    public void user_add_HTC_Product_in_to_cart()  {
        categoryPhones.VerifyUserAddBothHTCiphoneProductToBeAddProductInToCart();

    }

    @When("^user add iphone product into cart$")
    public void user_add_iphone_product_into_cart()  {
      categoryPhones.VerifyUserAddBothHTCiphoneProductToBeAddProductInToCart();
    }

    @When("^user can able to click on shopping cart button$")
    public void user_can_able_to_click_on_shopping_cart_button()  {
        categoryPhones.VerifyUserCanAbleToClickOnShoppingCartButton();

    }

    @Then("^user should able see products in shopping cart successfully$")
    public void user_should_able_see_products_in_shopping_cart_successfully()  {
        cartSuccessMessage.VerifyUserSeeTwoProductInShoppingCart();

    }@When("^user clicks on MyAccount and register button$")
    public void user_clicks_on_MyAccount_and_register_button()  {
        homePage.verifyuserclickonMyAccountButtonAndRegister();
    }

    @When("^user enters all required registration details$")
    public void user_enters_all_required_registration_details()  {
        registerPage.RegistrationDetails();
    }

    @Then("^user should able to register successfully$")
    public void user_should_able_to_register_successfully()  {
        successMessage.VerificationFinalMessage();
    }@When("^user click on laptops and showall laptops$")
    public void user_click_on_laptops_and_showall_laptops()  {
        homePage.userclickonLaptopsandAllLaptops();


    }

    @When("^user see all Add to cart button of laptops$")
    public void user_see_all_Add_to_cart_button_of_laptops()  {
        lapTops.verifyeachproducthaveAddtoCartButton();
    }

    @When("^user click on Add to cart button on selected product$")
    public void user_click_on_Add_to_cart_button_on_selected_product()  {
        lapTops.VerifyuserclickonHPLP30();
    }

    @Then("^user able to see all Add to cart button and click on selected products of laptops category successfully$")
    public void user_able_to_see_all_Add_to_cart_button_and_click_on_selected_products_of_laptops_category_successfully()  {
        categoryPhones.VerifyUserCanAbleToClickOnShoppingCartButton();
       cartSuccessMessage.verifycartsuccessfullly();
    }



}
