package api.daos;

public abstract class DaoFactory {
    private static DaoFactory factory = null;

    public static DaoFactory getFactory() {
        assert factory != null;
        return factory;
    }

    public static void setFactory(DaoFactory factory) {
        DaoFactory.factory = factory;
    }

    public abstract TemaDao getTemaDao();

    public abstract ComentarioDao getComentarioDao();

    public abstract ArticuloDao articuloDao();

}
