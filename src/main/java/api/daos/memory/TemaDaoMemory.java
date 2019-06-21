package api.daos.memory;

import api.daos.TemaDao;
import api.entities.Tema;

public class TemaDaoMemory extends GenericDaoMemory<Tema> implements TemaDao {


    @Override
    public String getId(Tema tema) {
        return tema.getId();
    }

    @Override
    public void setId(Tema tema, String id) {
        tema.setId(id);
    }
}
