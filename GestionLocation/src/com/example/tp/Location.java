package com.example.tp;

public class Location {
private Client client ;
private Vehicule vehicule ;
private int nbJours ;

public Location ( Client client , Vehicule vehicule , int nbJours ) {
	this.client=client ;
	this.vehicule=vehicule;
	this.nbJours= nbJours;
}
public double calculerMontant() {
    return vehicule.calculerCout(nbJours);
}

public void afficherRecapitulatif() {
    System.out.println("--- RÉCAPITULATIF DE LOCATION ---");
    System.out.println(client.toString());
    vehicule.afficherDetails();
    System.out.println("Durée: " + nbJours + " jours");
    System.out.println("Montant total: " + calculerMontant() + " DH");
    System.out.println("--------------------------------");
}
}

