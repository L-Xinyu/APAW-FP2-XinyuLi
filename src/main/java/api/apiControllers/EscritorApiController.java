package api.apiControllers;

import api.businessController.EscritorBusinessController;
import api.dtos.EscritorDto;
import api.exceptions.ArgumentNotValidException;

public class EscritorApiController {
    public static final String Escritores = "/escritores";
    public static final String id = "/{id}";

    private EscritorBusinessController escritorBusinessController= new EscritorBusinessController();

    public String create(EscritorDto escritorDto){
        this.validate(escritorDto,"escritorDto");
        this.validate(escritorDto.getNumero(),"EscritorDto Name");
        return this.escritorBusinessController.create(escritorDto);
    }

    public void update(String id, EscritorDto escritorDto) {
        this.validate(escritorDto, "escritorDto");
        this.validate(escritorDto.getNumero(), "EscritorDto Numero");
        this.escritorBusinessController.update(id, escritorDto);
    }



    private void validate(Object property,String message) {
        if (property == null) {
            throw new ArgumentNotValidException(message + " is missing");
        }
    }
}
