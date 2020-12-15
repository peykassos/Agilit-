package fr.dauphine;

import static org.junit.Assert.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;  

public class Feature3 {
	Disease ask = new Disease("a");

	Virus virus = new Virus(5,"vayrous");
	
	

	@Given("La creation virus et lui affecter la maladie {string}")
	public Virus la_creation_du_virus_et_maladie(String string) {
		ask.setNom(string);
	    Virus va = new Virus(10,"vayrous");
	    return va;
	}

	@When("creation virusDeux deux fois mechant et vol maladie")
	public void affecter_la_maldie_au_virus() {
		Virus a = new Virus(la_creation_du_virus_et_maladie("coucou").getGentillesse()*2,"virus");
		a.addMaladie(ask);
	}

	@Then("maladie {string} est bien chez virusDeux")
	public void avoir_comme_virus_de_la_maladie(String string) {
	    boolean temp = false;
	    temp = 	virus.getMaladies().contains(ask);
	    assertEquals(false,temp);
	}


}