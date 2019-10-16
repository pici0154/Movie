package Service;
import Domain.Movie;
import Repository.MovieRepository;

import java.util.List;

public class MovieService {

    private MovieRepository<Movie> repository;

    public MovieService(MovieRepository mr) {
        this.repository = mr;
    }

    public void setRepository(MovieRepository<Movie> repository) {
        this.repository = repository;
    }

    public MovieRepository<Movie> getRepository() {
        return repository;
    }


    public void addOrUpdate(String id, String name, double price) {
        Movie existing = repository.findById(id);
        if (existing != null) {
            // keep unchanged fields as they were
            if (id.isEmpty()) {
                id = existing.getId();
            }
            if (name.isEmpty()) {
                name = existing.getName();
            }
            if (price == existing.getPrice()) {
                price = existing.getPrice();
            }

        }
        Movie movie = new Movie(id, name, price);
        repository.addOrUpdateMovie (movie);
    }





    public void removeMovies(String id) {
        repository.removeMovie (id);
    }

    public List<Movie> getAllMovies() {
        return repository.getAllMovies ();
    }

    }

