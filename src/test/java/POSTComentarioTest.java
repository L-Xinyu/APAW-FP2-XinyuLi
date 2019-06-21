import api.apiControllers.ComentarioApiController;
import api.dtos.ComentarioDto;
import http.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class POSTComentarioTest {
    @Test
    void addComentarioTest(){
        ComentarioDto comentarioDto = new ComentarioDto(false,"my project");
        String subpath = ComentarioApiController.Comentarios ;
        HttpRequest request = new HttpRequest().
                builder(subpath).
                body(comentarioDto).
                post();
        HttpException exception = new HttpException(HttpStatus.BAD_REQUEST, "Excepción HTTP Bad");
        HttpResponse response = new Client().submit(request);
        assertEquals(HttpStatus.OK, response.getStatus());
    }

}
