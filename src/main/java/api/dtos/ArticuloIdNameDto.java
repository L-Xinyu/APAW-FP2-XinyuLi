package api.dtos;

import api.entities.Articulo;

import java.time.LocalDateTime;

public class ArticuloIdNameDto {
    private String id;

    private String name;

    private LocalDateTime writeTime;

    public ArticuloIdNameDto(Articulo articulo) {
        this.id = articulo.getId();
        this.name = articulo.getName();
    }

    public ArticuloIdNameDto(String id, String name) {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getWriteTime() {
        return writeTime;
    }

    public void setWriteTime(LocalDateTime writeTime) {
        this.writeTime = writeTime;
    }
}
