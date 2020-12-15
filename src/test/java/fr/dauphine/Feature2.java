package fr.dauphine;

import static org.junit.Assert.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;  

public class Feature2 {
	Disease a = new Disease("a");

	Virus virus = new Virus(5,"vayrous");
	
			
	@Given("La creation du virus et {string} maladies")
	public void la_creation_du_virus_et_maladies(String string) {
	    for(int i =0; i <Integer.parseInt(string);i++) {
	    	virus.addMaladie(new Disease());
	    }
	}

	@When("affecter {string} les maladies au virus")
	public void affecter_les_maladies_au_virus(String string) {

		for(int i =0; i< Integer.parseInt(string);i++) {
			virus.addMaladie(new Disease("cc"));
		}
	}

	@Then("avoir {string} dans la liste des maladies du virus")
	public void avoir_dans_la_liste_des_maladies_du_virus(String string) {
	    // Write code here that turns the phrase above into concrete actions
		boolean temp = true;
		temp = virus.getMaladies().size() == Integer.parseInt(string);
		assertEquals(false,temp);
	}

	@Given("La creation du virus {string} et maladie")
	public void la_creation_du_virus_et_maladie(String string) {
	    Virus va = new Virus(5,string);
	}

	@When("affecter la maldie au virus")
	public void affecter_la_maldie_au_virus() {
		a = new Disease();
		virus.addMaladie(a);
	}

	@Then("avoir {string} comme virus de la maladie")
	public void avoir_comme_virus_de_la_maladie(String string) {
		virus.addMaladie(a);
	    boolean temp = false;
	    temp = a.getVirus().getNom().equals(string);
	    assertEquals(true,temp);
	}


}