import java.util.List;

public interface IMetierProduit {
    public Produit add(Produit p);
    public List<Produit> getAll();
    public List<Produit> findByNom(String motCle);
    public Produit findById(Long id);
    public void delete(Long id);
}
