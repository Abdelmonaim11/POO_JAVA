import java.io.IOException;
import java.util.List;

public interface IMetier <T>{
    public T add(T o);
    public List<T> getAll();
    public T findByName(String name);
    public void delete(String name);
    public void saveAll() throws IOException;
}
