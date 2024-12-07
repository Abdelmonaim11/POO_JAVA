import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MetierProduitImpl implements IMetier<Produit>{
   private List<Produit> produitList = new ArrayList<>();

    public List<Produit> getProduitList() {
        return produitList;
    }

    public void setProduitList(List<Produit> produitList) {
        this.produitList = produitList;
    }

    @Override
    public Produit add(Produit produit) {
        produitList.add(produit);
        try {
            saveAll();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return produit;
    }


    @Override
    public List<Produit> getAll() {
        List<Produit> produits = new ArrayList<>();
        File produitFile = new File("E:\\D\\Master_SDIA\\POO_JAVA\\POO_JAVA_TPS\\TP6\\ProduitFile.dat");

        if (produitFile.exists()) {
            try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(produitFile))) {
                produits = (List<Produit>) objectInputStream.readObject();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return produits;
    }

    @Override
    public Produit findByName(String name) {
        Produit produitByName = null;
        File file = new File("E:\\D\\Master_SDIA\\POO_JAVA\\POO_JAVA_TPS\\TP6\\ProduitFile.dat");

        if (file.exists()) {
            try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
                List<Produit> produits = (List<Produit>) objectInputStream.readObject();
                for (Produit produit : produits) {
                    if (produit.getNom().equals(name)) {
                        produitByName = produit;
                        break;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Fichier introuvable.");
        }

        return produitByName;
    }

    @Override
    public void delete(String name) {
        File file = new File("E:\\D\\Master_SDIA\\POO_JAVA\\POO_JAVA_TPS\\TP6\\ProduitFile.dat");

        if (file.exists()) {
            try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
                // Lire la liste des produits
                List<Produit> produits = (List<Produit>) objectInputStream.readObject();

                // Filtrer les produits pour exclure celui avec le nom donné
                List<Produit> produitsMisAJour = new ArrayList<>();
                boolean produitSupprime = false;

                for (Produit produit : produits) {
                    if (!produit.getNom().equals(name)) {
                        produitsMisAJour.add(produit);
                    } else {
                        produitSupprime = true;
                    }
                }
                if (produitSupprime) {
                    try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
                        objectOutputStream.writeObject(produitsMisAJour);
                    }
                    System.out.println("Produit supprimé avec succès.");
                } else {
                    System.out.println("Produit non trouvé.");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Fichier introuvable.");
        }
    }

    @Override
    public void saveAll() throws IOException {
        File produitFile = new File("E:\\D\\Master_SDIA\\POO_JAVA\\POO_JAVA_TPS\\TP6\\ProduitFile.dat");
        List<Produit> produitsExistants = new ArrayList<>();

        // Charger les produits existants depuis le fichier si le fichier existe
        if (produitFile.exists()) {
            try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(produitFile))) {
                produitsExistants = (List<Produit>) objectInputStream.readObject();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // Ajouter les produits de produitList aux produits existants
        produitsExistants.addAll(produitList);

        // Sauvegarder la liste mise à jour dans le fichier
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(produitFile))) {
            objectOutputStream.writeObject(produitsExistants);
        }

        System.out.println("Produits ajoutés avec succès dans le fichier.");
    }

}
