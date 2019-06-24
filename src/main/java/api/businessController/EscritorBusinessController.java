package api.businessController;

import api.daos.DaoFactory;
import api.dtos.EscritorDto;
import api.entities.Escritor;
import api.exceptions.NotFoundException;

public class EscritorBusinessController {
    public String create(EscritorDto escritorDto) {
        Escritor escritor = new Escritor(escritorDto.getId(),escritorDto.getNumero(),escritorDto.getDescripcion());
        DaoFactory.getFactory().getEscritorDao().save(escritor);
        return escritor.getId();
    }

    public void update(String id, EscritorDto escritorDto) {
        Escritor escritor = DaoFactory.getFactory().getEscritorDao().read(id)
                .orElseThrow(() -> new NotFoundException("Escritor id: " + id));
        escritor.setId(escritorDto.getId());
        escritor.setNumero(escritorDto.getNumero());
        DaoFactory.getFactory().getEscritorDao().save(escritor);
    }
}
