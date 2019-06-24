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

    public void setId(String id) {
        this.id = id;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
