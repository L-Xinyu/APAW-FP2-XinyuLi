package api.entities;

public class Escritor {
    private String id;
    private Integer numero;
    private String descripcion;

    public Escritor(String id,Integer numero,String descripcion){
        this.id = id;
        this.numero = numero;
        this.descripcion = descripcion;
    }

    public String getId() {
        return id;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
