import api.apiControllers.ArticuloApiController;
import http.HttpRequest;
import org.junit.jupiter.api.Test;

public class PATCHArticuloCategory {
    @Test
    void testPatchArticuloOK() {
        HttpRequest request = new HttpRequest().
                builder("")
                .path(ArticuloApiController.CATEGORY)
                .patch();
        request.addQueryParam("idArticulo", "5");
        request.addQueryParam("newCategory", "LUGAR");
    }
}
