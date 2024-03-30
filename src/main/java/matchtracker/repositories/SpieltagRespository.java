package matchtracker.repositories;

import matchtracker.entities.Spieltag;
import org.springframework.data.repository.CrudRepository;

public interface SpieltagRespository extends CrudRepository<Spieltag, Integer> {
}
