import api.apiControllers.EscritorApiController;
import api.dtos.EscritorDto;
import http.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class POSTEscritorTest {
    @Test
    void addEscritorTest(){
        EscritorDto escritorDto = new EscritorDto("1960",2,"Una novela sobre Amor");
        String subpath = EscritorApiController.Escritores ;
        HttpRequest request = new HttpRequest().
                builder(subpath).
                body(escritorDto).
                post();
        HttpException exception = new HttpException(HttpStatus.BAD_REQUEST, "Excepción HTTP Bad");
        HttpResponse response = new Client().submit(request);
        assertEquals(HttpStatus.OK, response.getStatus());
    }
}
