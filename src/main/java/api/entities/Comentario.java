package api.entities;

import java.time.LocalDateTime;

public class Comentario {
    private String idComentario;
    private Boolean negative;
    private String descripcion;
    private LocalDateTime momentoComentario;

    public Comentario(Boolean negative, String descripcion) {
        this.negative = negative;
        this.descripcion = descripcion;
    }

    public String getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(String idComentario) {
        this.idComentario = idComentario;
    }

    public Boolean getNegative() {
        return negative;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public LocalDateTime getMomentoComentario() {
        return momentoComentario;
    }
}
