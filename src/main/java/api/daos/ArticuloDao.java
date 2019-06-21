package api.daos;

import api.entities.Articulo;

import java.util.List;

public interface ArticuloDao extends GenericDao<Articulo,String>{
    List<Articulo> getArticuloLista();
    void setArticulo(String id,Articulo articulo);
}
