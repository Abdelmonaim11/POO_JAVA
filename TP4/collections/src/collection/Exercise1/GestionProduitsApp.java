package collection.Exercise1;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionProduitsApp {
    public static void main(String[] args) {
        ArrayList<Produit> produits = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
//        Ajouter des produits.
        produits.add(new Produit(1L,"DELL latitude", 3750.00));
        produits.add(new Produit(2L,"HP probook", 3000.00));
        produits.add(new Produit(3L,"Mac M2", 12345.00));
        produits.add(new Produit(4L,"DELL XRS 2020", 4560.00));
        produits.add(new Produit(5L,"Thinkpad", 3500.00));
//        List des produit avant la suppression
        System.out.println("List des produit avant la suppression");
        produits.forEach(p->{
            System.out.println("ID : "+p.getId());
            System.out.println("Nom : "+p.getNom());
            System.out.println("Prix : "+p.getPrix());
        });
//        Supprimer un produit par indice, par exemple on supprime produit d'indice 2
        produits.remove(2);
//        List des produit apres la suppression
        System.out.println("List des produit apres la suppression");
        produits.forEach(p->{
            System.out.println("ID : "+p.getId());
            System.out.println("Nom : "+p.getNom());
            System.out.println("Prix : "+p.getPrix());
        });
//        Modifier un produit par indice.
//        1- Recuperer ce produit par indice, par exemple on va modifier le produit d'indice 3
        Produit produitByIndice = produits.get(3);
        produitByIndice.setPrix(4500.00);
        produitByIndice.setNom("Lenovo Thinkpad");
        produits.remove(3);
        produits.add(produitByIndice);
//        List des produit apres la modification d'un produit
        System.out.println("List des produit apres la modification d'un produit");
        produits.forEach(p->{
            System.out.println("ID : "+p.getId());
            System.out.println("Nom : "+p.getNom());
            System.out.println("Prix : "+p.getPrix());
        });
//        Chercher un produit par le nom tape par utilisateur
        System.out.print("Saisie un nom d'un produit: ");
        String nomByuser = scanner.nextLine();
        Produit produitByNom = new Produit();
        for (Produit produit : produits) {
            if (produit.getNom().equals(nomByuser)){
                produitByNom = produit;
            }
        }
        System.out.println("Le produit ayant le nom, "+nomByuser+" est : ");
        System.out.println("ID: "+produitByNom.getId()+", Nom: "+produitByNom.getNom()+" et Prix : "+produitByNom.getPrix());

    }
}
