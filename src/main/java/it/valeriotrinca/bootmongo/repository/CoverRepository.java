package it.valeriotrinca.bootmongo.repository;

import it.valeriotrinca.bootmongo.model.Cover;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CoverRepository extends MongoRepository<Cover, String> {
    public List<Cover> findByBookId(Integer id);
}
