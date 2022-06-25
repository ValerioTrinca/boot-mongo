package it.valeriotrinca.bootmongo.service;

import it.valeriotrinca.bootmongo.model.Cover;
import it.valeriotrinca.bootmongo.repository.CoverRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoverService {

    private final CoverRepository coverRepository;

    public CoverService(CoverRepository coverRepository) {
        this.coverRepository = coverRepository;
    }

    public List<Cover> fetchAll() {
        return this.coverRepository.findAll();
    }

    public List<Cover> getByBookId(Integer id) {
        return this.coverRepository.findByBookId(id);
    }
}
