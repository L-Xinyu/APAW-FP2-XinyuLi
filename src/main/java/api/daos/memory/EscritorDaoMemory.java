package api.daos.memory;

import api.daos.EscritorDao;
import api.entities.Escritor;

public class EscritorDaoMemory extends GenericDaoMemory<Escritor> implements EscritorDao {
    @Override
    public void addEscritor(Escritor escritor) {
    }


    @Override
    public String getId(Escritor escritor) {
        return escritor.getId();
    }

    @Override
    public void setId(Escritor escritor, String id) {
        escritor.setId(id);
    }

}
