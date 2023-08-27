package Pages;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class Homepage {
	@FindBy(tagName="h6")
	WebElement dashbordmessage;
	
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li/a")
	List<WebElement> menus;
	
	
	public Homepage() {
		PageFactory.initElements(Config.driver,this);
	}

	public String verifmessage() {
	String actuelmessage=dashbordmessage.getText();
	return actuelmessage; 
	}
	
	public void clickOnmenu(String menuName) {
		for(WebElement menu:menus) {
			if(menu.getText().contains(menuName)) {
			menu.click();
			}
			}
		
	}
	
}
