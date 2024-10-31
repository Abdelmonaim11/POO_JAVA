import java.util.ArrayList;
import java.util.List;

public class MetierProduitImpl implements IMetierProduit{
    private List<Produit> produitList = new ArrayList<>();
    @Override
    public Produit add(Produit p) {
        if(produitList.contains(p)) throw new RuntimeException("Le produit est deja existe!");
        else {
            produitList.add(p);
        }
        return p;
    }

    @Override
    public List<Produit> getAll() {
        return produitList;
    }

    @Override
    public List<Produit> findByNom(String motCle) {
        List<Produit> produitListByName = new ArrayList<>();
        if (produitList != null) {
            produitList.forEach(produit -> {
                if (produit.getNom().contains(motCle)) {
                    produitListByName.add(produit);
                }
            });
        }
        return produitListByName;
    }

    @Override
    public Produit findById(Long id) {
        for (Produit p: produitList){
            if (p.getId().equals(id)){
                return p;
            }
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        Produit produit = findById(id);
        if(produit == null) throw new RuntimeException("Le produit n'existe pas!!!");
        else{
            produitList.remove(produit);
        }
    }
}
