import api.apiControllers.TemaApiController;
import api.dtos.TemaDto;
import http.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class POSTTemaTest {

    @Test
    void addTemaTest(){
        TemaDto temaDto = new TemaDto("9627","Xinyu");
        String subpath = TemaApiController.TEMAS ;
        HttpRequest request = new HttpRequest().
                builder(subpath).
                body(temaDto).
                post();
        HttpException exception = new HttpException(HttpStatus.BAD_REQUEST, "Excepción HTTP Bad");
        HttpResponse response = new Client().submit(request);
        assertEquals(HttpStatus.OK, response.getStatus());
    }



}
