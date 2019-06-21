package api.entities;

public class Tema {
    private String id;
    private String name;

    public Tema(String id,String name){
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
