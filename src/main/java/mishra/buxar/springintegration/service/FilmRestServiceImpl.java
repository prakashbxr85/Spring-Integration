package mishra.buxar.springintegration.service;

import java.math.BigInteger;

import org.springframework.stereotype.Service;

import mishra.buxar.springintegration.model.Film;

@Service
public class FilmRestServiceImpl implements FilmRestService {

    public Film[] getFilms() {
        Film[] films = new Film[2];
        films[0]=new Film();
        films[0].setId(new BigInteger(("1")));
        films[0].setName("The Good, the Bad and the Uggly");
        films[0].setShowTime("6pm");
        
        films[1]=new Film();
        films[1] .setId(new BigInteger(("2")));
        films[1] .setName("The Empire strikes back");
        films[1] .setShowTime("8pm");
        
        return films;
    }
}