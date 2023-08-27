package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class Loginpage {
	
	@FindBy(name="username")
	WebElement username;
	
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	WebElement submit;
	@FindBy (xpath="/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")
	WebElement messageerreru;
	
	public Loginpage() {
		PageFactory.initElements(Config.driver, this);
	}
	public void connexion(String nom ,String motpass ) {
	Config.attend(15);
		username.sendKeys(nom);
		password.sendKeys(motpass);
		submit.click();
		
	}
	
	public String verifmessage() {
		String actuelmessage= messageerreru.getText();
		return actuelmessage; 
		}
	
	

}
