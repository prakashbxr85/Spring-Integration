package mishra.buxar.springintegration.service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import mishra.buxar.springintegration.model.Film;

@Service
public class FilmServiceImpl implements FilmService {

    public List<Film> getFilms() {
        List<Film> films = new ArrayList<Film>();
        
        Film film = new Film();
        film.setId(new BigInteger(("1")));
        film.setName("The Good, the Bad and the Uggly");
        film.setShowTime("6pm");
        films.add(film);
        
        film = new Film();
        film.setId(new BigInteger(("2")));
        film.setName("The Empire strikes back");
        film.setShowTime("8pm");
        films.add(film);
        
        return films;
    }
}