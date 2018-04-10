package mishra.buxar.springintegration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mishra.buxar.springintegration.model.Film;
import mishra.buxar.springintegration.service.FilmRestService;

@RestController
@RequestMapping(value="/films")
public class FilmController {
	FilmRestService filmRestService;

    @Autowired
    public FilmController(FilmRestService filmRestService) {
        this.filmRestService = filmRestService;
    }

    @RequestMapping(method=RequestMethod.GET)
    public Film[] getFilms() {
        return filmRestService.getFilms();
    }
}