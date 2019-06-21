package api.daos.memory;

import api.daos.ComentarioDao;
import api.entities.Comentario;

public class ComentarioDaoMemory extends GenericDaoMemory<Comentario> implements ComentarioDao {

    @Override
    public void addComentario(Comentario comentario) {

    }

    @Override
    public String getId(Comentario comentario) {
        return comentario.getIdComentario();
    }

    @Override
    public void setId(Comentario comentario, String id) {
        comentario.setIdComentario(id);

    }
}
