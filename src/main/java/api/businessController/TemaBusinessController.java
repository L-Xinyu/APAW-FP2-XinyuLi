package api.businessController;

import api.daos.DaoFactory;
import api.dtos.TemaDto;
import api.entities.Tema;

public class TemaBusinessController {
    public String create(TemaDto temaDto) {
        Tema tema = new Tema(temaDto.getId(), temaDto.getName());
        DaoFactory.getFactory().getTemaDao().save(tema);
        return tema.getId();
    }


}
