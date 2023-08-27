package Testsuites;



import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Pages.Homepage;
import Pages.Loginpage;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class Loginpagestepdef {
@Before
public void init() {
	Config.confChrome();
	Config.driver = new ChromeDriver();
	Config.maximalwind();
}

	@Given("administrateur sur la page authentification")
	public void administrateur_sur_la_page_authentification() {
		Config.driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    
	  }


		
	   
	    
	
	
	@When("entre le nom coorect {string} et le mot passe correct  {string}")
	public void entre_le_nom_coorect_et_le_mot_passe_correct(String nom, String mdp) {
		Loginpage pagelogin= new Loginpage();
		pagelogin.connexion(nom, mdp);
	}

	
	    
	@Then("adimibistrateur deriger vers la page accueil  contient message {string}")
	public void adimibistrateur_deriger_vers_la_page_accueil_contient_message(String exeptedmsg) {
		Homepage homepage = new Homepage();
	String actuelmessage = homepage.verifmessage();
	Assert.assertEquals(exeptedmsg, actuelmessage);
	}
	
	
	
	@When("entre le nom incoorect {string} et le mot passe incorrect  {string}")
	public void entre_le_nom_incoorect_et_le_mot_passe_incorrect(String nom, String mdp) {
		
		Loginpage pagelogin= new Loginpage();
		pagelogin.connexion(nom, mdp);
		
	}
	
	@Then("adimibistrateur reste sur la page authentification avec un message derreur {string}")
	public void adimibistrateur_reste_sur_la_page_authentification_avec_un_message_derreur(String exepectedmess) {
		
		Loginpage page = new Loginpage();
		String actuelmessage = page.verifmessage();
		Assert.assertEquals(exepectedmess, actuelmessage);
	    
	}
	   
	
	
}
