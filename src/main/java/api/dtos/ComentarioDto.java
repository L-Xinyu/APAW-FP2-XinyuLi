package api.dtos;

import java.time.LocalDateTime;

public class ComentarioDto {
    private Boolean negative;
    private String descripcion;
    private LocalDateTime momentoComentario;

    public ComentarioDto(Boolean negative,String descripcion){
        this.negative = negative;
        this.descripcion = descripcion;
    }


    public Boolean getNegative() {
        return negative;
    }

    public void setNegative(Boolean negative) {
        this.negative = negative;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDateTime getMomentoComentario() {
        return momentoComentario;
    }
}
