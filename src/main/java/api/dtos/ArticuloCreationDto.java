package api.dtos;

import api.entities.Category;

public class ArticuloCreationDto {
    private String name;
    private String temaId;

    public ArticuloCreationDto(String name,Category category,String userId){
        this.name = name;
        this.temaId = userId;
    }

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public String getTemaId() {
        return temaId;
    }

    public void setTemaId(String temaId) {
        this.temaId = temaId;
    }
}
