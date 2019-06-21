import api.apiControllers.ArticuloApiController;
import http.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GETFindArticuloTest {

    @Test
    void findByIdArticuloTest(){
        String subpath = ArticuloApiController.ARTICULOS + ArticuloApiController.ID_ID + "/1";
        HttpRequest request = new HttpRequest().builder(subpath).get();
        HttpException exception = new HttpException(HttpStatus.BAD_REQUEST, "Excepción HTTP Bad");
        HttpResponse response = new Client().submit(request);
        assertEquals(HttpStatus.OK, response.getStatus());
    }

}
