package it.valeriotrinca.bootmongo.repository;

import it.valeriotrinca.bootmongo.model.CityInspection;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CityInspectionRepository extends MongoRepository<CityInspection, String> {
}
