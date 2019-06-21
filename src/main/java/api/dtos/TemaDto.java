package api.dtos;

public class TemaDto {
    private String id;
    private String name;

    public TemaDto(String id,String name){
        this.id = id;
        this.name =name;
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

}
