package com.example.tp;

public abstract class Vehicule {
    protected String immatriculation;
    protected String marque;
    protected double tarifJournalier;

    public Vehicule(String immatriculation, String marque, double tarifJournalier) {
        this.immatriculation = immatriculation;
        this.marque = marque;
        this.tarifJournalier = tarifJournalier;
    }

    public double getTarifJournalier() {
        return tarifJournalier;
    }

    public abstract double calculerCout(int nbJours);

    
    public void afficherDetails() {
        System.out.println("Immatriculation: " + immatriculation + " | Marque: " + marque + " | Tarif/jour: " + tarifJournalier + " DH");
    }
}