package api.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Articulo {
    private String id;
    private String name;
    private LocalDateTime writeTime;
    private Category category;
    private Tema tema;
    private List<Escritor> escritors;

    public Articulo(String id){
        this.id = id;
        this.name = name;
        this.writeTime = LocalDateTime.now();
        this.escritors = new ArrayList<>();
    }

    public static Builder builder(String name) {
        return new Builder(name);
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public LocalDateTime getWriteTime() { return writeTime; }
    public void setWriteTime(LocalDateTime writeTime) { this.writeTime = writeTime; }

    public Category getCategory() { return category; }
    public void setCategory(Category category) { this.category = category; }

    public Tema getTema() { return tema; }
    public void setTema(Tema tema) { this.tema = tema; }

    public List<Escritor> getEscritors() { return escritors; }
    public void setEscritors(List<Escritor> escritors) { this.escritors = escritors; }

    public static class Builder{
        private final Articulo name;
        private Articulo articulo;

        public Builder(String name) {
            this.name = new Articulo(name);
        }

        public Builder id(String id){
            this.articulo.id = id;
            return this;
        }

        public Builder category(Category category){
            this.articulo.category = category;
            return this;
        }

        public Builder tema(Tema tema){
            this.articulo.tema = tema;
            return this;
        }

        public Builder escritor(Escritor escritor){
            this.articulo.escritors.add(escritor);
            return this;
        }

        public Articulo build(){ return this.articulo;}
    }
}
