import api.apiControllers.ArticuloApiController;
import http.Client;
import http.HttpRequest;
import http.HttpResponse;
import http.HttpStatus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DELETEArticuloTest {

    @Test
    void deleteByIdArticuloOKTest() {
        HttpRequest request = new HttpRequest().
                builder("").
                path(ArticuloApiController.ARTICULOS + ArticuloApiController.ID_ID).
                delete();
        request.addQueryParam("deleteId", "1");
        HttpResponse response = new Client().submit(request);
        assertEquals(HttpStatus.OK, response.getStatus());

    }
}