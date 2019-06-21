package api.businessController;

import api.daos.DaoFactory;
import api.dtos.ArticuloCreationDto;
import api.dtos.ArticuloIdNameDto;
import api.entities.Articulo;
import api.entities.Category;
import api.entities.Escritor;
import api.entities.Tema;
import api.exceptions.NotFoundException;

import java.util.List;
import java.util.stream.Collectors;

public class ArticuloBusinessController {
    public String create(ArticuloCreationDto articuloCreationDto) {
        Tema tema = null;
        if (articuloCreationDto.getTemaId() != null) {
            tema = DaoFactory.getFactory().getTemaDao().read(articuloCreationDto.getTemaId())
                    .orElseThrow(() -> new NotFoundException("User (" + articuloCreationDto.getTemaId() + ")"));
        }
        Articulo articulo = Articulo.builder(articuloCreationDto.getName()).tema(tema).category(articuloCreationDto.getCategory()).build();
        DaoFactory.getFactory().articuloDao().save(articulo);
        return articulo.getId();
    }

    public List<ArticuloIdNameDto> readAll() {
        return DaoFactory.getFactory().articuloDao().findAll()
                .stream().map(ArticuloIdNameDto::new)
                .collect(Collectors.toList());
    }

    public void updateCategory(String id, Category category) {
        Articulo articulo = DaoFactory.getFactory().articuloDao().read(id)
                .orElseThrow(() -> new NotFoundException("Articulo (" + id + ")"));
        articulo.setCategory(category);
        DaoFactory.getFactory().articuloDao().save(articulo);
    }

    public List<ArticuloIdNameDto> findByAverageGreaterThanEqual(Double value) {
        return DaoFactory.getFactory().articuloDao().findByEscritoresNotEmpty().stream()
                .map(ArticuloIdNameDto::new)
                .collect(Collectors.toList());
    }
}
