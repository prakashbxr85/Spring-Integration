package mishra.buxar.springintegration.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import mishra.buxar.springintegration.model.Film;
import mishra.buxar.springintegration.model.FilmResponse;
import mishra.buxar.springintegration.service.FilmService;


@Endpoint
public class FilmEndpoint {
    @Autowired
    private FilmService filmService;
    
    @PayloadRoot(localPart="filmRequest", namespace="http://com.websystique.springboot/films")
    public @ResponsePayload FilmResponse getFilms() {
        return buildResponse();
    }
    
    private FilmResponse buildResponse() {
        FilmResponse response = new FilmResponse();
        
        for (Film film : filmService.getFilms()) {
            response.getFilm().add(film);
        }
        
        return response;
    }
}