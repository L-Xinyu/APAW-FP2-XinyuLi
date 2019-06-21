package api;

import api.apiControllers.ArticuloApiController;
import api.apiControllers.ComentarioApiController;
import api.apiControllers.TemaApiController;
import api.daos.DaoFactory;
import api.daos.memory.DaoMemoryFactory;
import api.dtos.ArticuloCreationDto;
import api.dtos.TemaDto;
import api.entities.Category;
import api.exceptions.ArgumentNotValidException;
import api.exceptions.NotFoundException;
import api.exceptions.RequestInvalidException;
import http.HttpRequest;
import http.HttpResponse;
import http.HttpStatus;

public class Dispatcher {

    static {
        DaoFactory.setFactory(new DaoMemoryFactory());
    }

    private TemaApiController temaApiController = new TemaApiController();

    private ComentarioApiController comentarioApiController = new ComentarioApiController();

    private ArticuloApiController articuloApiController = new ArticuloApiController();

    public void submit(HttpRequest request, HttpResponse response) {
        String ERROR_MESSAGE = "{'error':'%S'}";
        try {
            switch (request.getMethod()) {
                case POST:
                    this.doPost(request, response);
                    break;
                case PUT:
                    this.doPut(request);
                    break;
                default: // Unexpected
                    throw new RequestInvalidException("method error: " + request.getMethod());
            }
        } catch (ArgumentNotValidException | RequestInvalidException exception) {
            response.setBody(String.format(ERROR_MESSAGE, exception.getMessage()));
            response.setStatus(HttpStatus.BAD_REQUEST);
        } catch (NotFoundException exception) {
            response.setBody(String.format(ERROR_MESSAGE, exception.getMessage()));
            response.setStatus(HttpStatus.NOT_FOUND);
        } catch (Exception exception) {  // Unexpected
            exception.printStackTrace();
            response.setBody(String.format(ERROR_MESSAGE, exception));
            response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    private void doPost(HttpRequest request, HttpResponse response) {
        if (request.isEqualsPath(TemaApiController.TEMAS)) {
            response.setBody(this.temaApiController.create((TemaDto) request.getBody()));
        } else if (request.isEqualsPath(TemaApiController.TEMAS)) {
            this.temaApiController.create((TemaDto) request.getBody());
        } else if (request.isEqualsPath(ArticuloApiController.ARTICULOS)) {
            response.setBody(this.articuloApiController.create((ArticuloCreationDto) request.getBody()));
        } else {
            throw new RequestInvalidException("request error: " + request.getMethod() + ' ' + request.getPath());
        }
    }

    private void doPut(HttpRequest request) {
        if (request.isEqualsPath(TemaApiController.TEMAS + TemaApiController.ID_ID)) {
            this.temaApiController.update(request.getPath(1), (TemaDto) request.getBody());
        } else {
            throw new RequestInvalidException("request error: " + request.getMethod() + ' ' + request.getPath());
        }
    }
}
