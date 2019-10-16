package Repository;

import Domain.Movie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieRepository<M extends Movie> {           //aici M mosteneste clasa Movie

    private Map<String, M> listMovies = new HashMap<> ();      //aici am initializat o lista de filme



    public void addOrUpdateMovie(M entity) {                //adaugare sau modificare movie

    listMovies.put(entity.getId (),entity);
    }


public M findById(String id){
        return listMovies.get(id);
}

    public void removeMovie(String id){                     //stergere film dupa id


        if( !listMovies.containsKey ( id )) {                            //aici am pus conditie in cazul in care nu gaseste filmul
            System.out.println ("The movie ist not in the list");         //cu id-ul x sa dea mesaj
        }else
            {
            listMovies.remove ( id );
        }

    }

    public List<M> getAllMovies( ){                                  //aici ne afiseaza lista de filme

        return  new ArrayList<M>( listMovies.values() );
    }


}
