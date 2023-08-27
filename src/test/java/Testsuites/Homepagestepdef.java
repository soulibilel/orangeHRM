package Testsuites;




import Pages.Homepage;
import io.cucumber.java.en.*;

public class Homepagestepdef {
	
	@When("utilisateur click sur {string}")
	public void utilisateur_click_sur(String menu) {
		Homepage page = new Homepage();
    page.clickOnmenu(menu); 
	}

	@Then("la page menu choisisee est affichee")
	public void la_page_menu_choisisee_est_affichee() {
	   
	}
}
