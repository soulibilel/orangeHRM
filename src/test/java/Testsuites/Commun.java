package Testsuites;



import Helper.Config;
import Pages.Loginpage;
import io.cucumber.java.en.Given;

public class Commun {
	
	@Given("utilisateur est bien connecte avec nom correct {string} et mdp coorect {string} et rederiger vers la page home page")
	public void utilisateur_est_bien_connecte_avec_nom_correct_et_mdp_coorect_et_rederiger_vers_la_page_home_page(String nom, String mdp) {
		Config.driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Loginpage page = new Loginpage();
	 page.connexion(nom, mdp);
	}

}
