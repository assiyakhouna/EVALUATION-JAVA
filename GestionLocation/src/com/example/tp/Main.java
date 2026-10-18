package com.example.tp;

public class Main {
    public static void main(String[] args) {
        // 1. Création des deux clients
        Client c1 = new Client(1, "El Amrani", "Youssef");
        Client c2 = new Client(2, "Benali", "Sara");

        // 2. Création des véhicules selon le tableau de test du sujet
        Voiture v1 = new Voiture("11111-A-1", "Dacia", 300, 5);
        Voiture v2 = new Voiture("22222-B-1", "Mercedes", 400, 7);
        Moto m1 = new Moto("33333-C-1", "Yamaha", 150, 125);

        // 3. Stockage dans un tableau Vehicule[]
        Vehicule[] vehicules = new Vehicule[]{v1, v2, m1};

        // 4. Parcourir le tableau et afficher les détails
        System.out.println("=== LISTE DES VÉHICULES ===");
        for (Vehicule v : vehicules) {
            v.afficherDetails();
            System.out.println();
        }

        // 5. Création des trois locations
        Location loc1 = new Location(c1, v1, 3);
        Location loc2 = new Location(c2, v2, 2);
        Location loc3 = new Location(c1, m1, 6);

        // 6. Stockage dans un tableau Location[]
        Location[] locations = new Location[]{loc1, loc2, loc3};

        // 7. Parcourir et afficher le récapitulatif
        System.out.println("=== RÉCAPITULATIF DES LOCATIONS ===");
        double montantTotalGeneral = 0;
        for (Location loc : locations) {
            loc.afficherRecapitulatif();
            montantTotalGeneral += loc.calculerMontant();
        }

        // 8. Calcul et affichage du montant total de toutes les locations
        System.out.println("MONTANT TOTAL DE TOUTES LES LOCATIONS: " + montantTotalGeneral + " DH");
    }
}