package api.daos;

import api.entities.Escritor;

public interface EscritorDao extends GenericDao<Escritor,String> {
    public void addEscritor(Escritor escritor);
}
