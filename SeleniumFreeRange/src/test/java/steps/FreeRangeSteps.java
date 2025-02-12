package steps;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PaginaCursos;
import pages.PaginaFundamentosTesting;
import pages.PaginaPrincipal;
import pages.PaginaRegistro;
 
public class FreeRangeSteps {
 
    PaginaPrincipal landingPage = new PaginaPrincipal();
    PaginaCursos cursosPage = new PaginaCursos();
    PaginaFundamentosTesting fundamentosPage = new PaginaFundamentosTesting();
    PaginaRegistro registro = new PaginaRegistro();

 
    @Given("I navigate to www.freerangetesters.com")
    public void iNavigateToFRT() {
        landingPage.navigateToFreeRangeTesters();
    }

    @When("I go to {string} using the navigation bar")
    public void selectOptionUsingBar(String selection){
        landingPage.clickOnSelectionNavigationBar(selection);   
    }

    @When("I select Elegir Plan")
    public void selectElegirPlan() {
        landingPage.clickOnElegirPlanButton();
    }

    @And("I select Introducción a Testing")
    public void navigateToIntro() {
        cursosPage.clickFundamentosTestingLink();
        fundamentosPage.clickFundamentosTestingLink();
    }

    @Then("I can validate the options in the checkout page")
    public void validateCheckoutPlans(){
        List<String> lista = registro.returnPlanDropdownValues();
        List<String> listaEsperada = Arrays.asList("Academia: $16.99 / mes • 13 productos",
                "Academia: $176 / año • 13 productos", "Free: Gratis • 3 productos");
        Assert.assertEquals(lista, listaEsperada);

    }





}