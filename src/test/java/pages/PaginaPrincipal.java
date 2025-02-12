package pages;

public class PaginaPrincipal extends BasePage{

   /// private String searchButton = "//a[@class='sc-dODueM cjsphi']";   
       private String searchRecursos = "//a[normalize-space()='%s'and @href]";
  ///  private String searchUdemy = "//a[@href='https://www.freerangetesters.com/udemy']";
       private String elegirUnPlanButton = "//a[normalize-space()='Elegir Plan' and @href]";

    public PaginaPrincipal() {
        super(driver);
    }

        public void navigateToFreeRangeTesters() {
            navigateTo("https://www.freerangetesters.com");
             
        }

        public void clickOnSelectionNavigationBar(String selection){
            String xpathSection = String.format(searchRecursos, selection);
            clickElement(xpathSection);

        } 

        public void clickOnElegirPlanButton() {
            clickElement(elegirUnPlanButton);
        }
}

