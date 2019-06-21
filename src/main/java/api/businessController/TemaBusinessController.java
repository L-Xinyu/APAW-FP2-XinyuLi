package api.businessController;

import api.daos.DaoFactory;
import api.dtos.TemaDto;
import api.entities.Tema;
import api.exceptions.NotFoundException;

public class TemaBusinessController {
    public String create(TemaDto temaDto) {
        Tema tema = new Tema(temaDto.getId(), temaDto.getName());
        DaoFactory.getFactory().getTemaDao().save(tema);
        return tema.getId();
    }

    public void update(String id, TemaDto temaDto) {
        Tema tema = DaoFactory.getFactory().getTemaDao().read(id)
                .orElseThrow(() -> new NotFoundException("Tema id: " + id));
        tema.setId(temaDto.getId());
        tema.setName(temaDto.getName());
        DaoFactory.getFactory().getTemaDao().save(tema);
    }


}
