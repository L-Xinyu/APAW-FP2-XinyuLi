package api.daos.memory;

import api.daos.*;

public class DaoMemoryFactory extends DaoFactory {
    private TemaDao temaDao;
    private ComentarioDao comentarioDao;
    private ArticuloDao articuloDao;
    private EscritorDao escritorDao;


    @Override
    public TemaDao getTemaDao() {
        if (this.temaDao == null) {
            this.temaDao = new TemaDaoMemory();
        }
        return this.temaDao;
    }

    @Override
    public ComentarioDao getComentarioDao() {
        if (this.comentarioDao == null) {
            this.comentarioDao = new ComentarioDaoMemory();
        }
        return this.comentarioDao;
    }

    @Override
    public ArticuloDao articuloDao() {
        if (this.articuloDao == null) {
            this.articuloDao = new ArticuloDaoMemory();
        }
        return this.articuloDao;
    }

    @Override
    public EscritorDao getEscritorDao() {
        if(this.escritorDao == null){
            this.escritorDao = new EscritorDaoMemory();
        }
        return this.escritorDao;
    }
}
