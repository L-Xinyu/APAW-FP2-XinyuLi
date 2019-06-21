import api.apiControllers.ArticuloApiController;
import api.apiControllers.TemaApiController;
import api.dtos.ArticuloIdNameDto;
import api.dtos.TemaDto;
import http.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class POSTArticuloTest {
    @Test
    void addArticuloTest(){
        ArticuloIdNameDto articuloIdNameDto = new ArticuloIdNameDto("5566","Alberto");
        String subpath = ArticuloApiController.ARTICULOS ;
        HttpRequest request = new HttpRequest().
                builder(subpath).
                body(articuloIdNameDto).
                post();
        HttpException exception = new HttpException(HttpStatus.BAD_REQUEST, "Excepción HTTP Bad");
        HttpResponse response = new Client().submit(request);
        assertEquals(HttpStatus.OK, response.getStatus());
    }
}
