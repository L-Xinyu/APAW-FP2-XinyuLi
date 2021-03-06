package api.apiControllers;

import api.businessController.ArticuloBusinessController;
import api.dtos.ArticuloCreationDto;
import api.dtos.ArticuloIdNameDto;
import api.entities.Category;
import api.exceptions.ArgumentNotValidException;

import java.util.List;

public class ArticuloApiController {

    public static final String ARTICULOS = "/articulos";

    public static final String ID_ID = "/{id}";

    public static final String ESCRITORES = "/escritores";

    public static final String CATEGORY = "/category";

    public static final String SEARCH = "/search";

    private ArticuloBusinessController articuloBusinessController = new ArticuloBusinessController();

    public String create(ArticuloCreationDto articuloDto){
        this.validate(articuloDto,"articuloDto");
        this.validate(articuloDto.getName(),"articuloDto name");
        return this.articuloBusinessController.create(articuloDto);
    }

    public List<ArticuloIdNameDto> readAll() {
        return this.articuloBusinessController.readAll();
    }

    public void delete(String id) {
        this.articuloBusinessController.delete(id);
    }

    public void updateCategory(String articuloId, Category category) {
        this.validate(category, "category");
        this.articuloBusinessController.updateCategory(articuloId, category);
    }

    private void validate(Object property, String message) {
        if (property == null) {
            throw new ArgumentNotValidException(message + " is missing");
        }
    }

    public List<ArticuloIdNameDto> find(String query) {
        this.validate(query, "query param q");
        if (!"average".equals(query.split(":>=")[0])) {
            throw new ArgumentNotValidException("query param q is incorrect, missing 'average:>='");
        }
        return this.articuloBusinessController.findByAverageGreaterThanEqual(Double.valueOf(query.split(":>=")[1]));
    }
}

