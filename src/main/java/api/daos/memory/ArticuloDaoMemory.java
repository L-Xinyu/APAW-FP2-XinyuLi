package api.daos.memory;

import api.daos.ArticuloDao;
import api.entities.Articulo;

import java.util.List;

public class ArticuloDaoMemory extends GenericDaoMemory<Articulo> implements ArticuloDao {

    private List<Articulo> listaArticulos;

    @Override
    public List<Articulo> getArticuloLista() {
        return listaArticulos;
    }

    @Override
    public void setArticulo(String id, Articulo articulo) {

    }

    @Override
    public String getId(Articulo articulo) {
        return articulo.getId();
    }

    @Override
    public void setId(Articulo articulo, String id) {
        articulo.setId(id);
    }
}
