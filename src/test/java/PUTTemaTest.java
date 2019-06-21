import api.apiControllers.TemaApiController;
import api.dtos.TemaDto;
import http.Client;
import http.HttpException;
import http.HttpRequest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class PUTTemaTest {
    //correcta
    @Test
    void testCreateTema() {
        TemaDto nuevoTemaDto =  new TemaDto("3085","Las practicas sobre APAW");
        HttpRequest request = HttpRequest.
                builder("").path(TemaApiController.TEMAS)
                .body(nuevoTemaDto).put();
        new Client().submit(request);
    }

    @Test
    void testFailureTema() {
        TemaDto nuevoTemaDto =  new TemaDto("0000","APAW");;
        HttpRequest request = HttpRequest.
                builder("").path(TemaApiController.TEMAS)
                .body(nuevoTemaDto).put();
        assertThrows(HttpException.class, () -> {
            new Client().submit(request); });
    }
}
