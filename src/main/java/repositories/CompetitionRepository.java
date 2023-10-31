package repositories;

import entities.Competition;
import org.springframework.data.repository.CrudRepository;

public interface CompetitionRepository extends CrudRepository<Competition, Integer> {
}
