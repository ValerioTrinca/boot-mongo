package it.valeriotrinca.bootmongo.controller;

import it.valeriotrinca.bootmongo.service.CoverService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/cover")
public class CoverController {

    private final CoverService coverService;

    public CoverController(CoverService coverService) {
        this.coverService = coverService;
    }

    @GetMapping
    public ResponseEntity<?> fetchAll() {
        return ResponseEntity.ok(this.coverService.fetchAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getByBookId(@PathVariable Integer id) {
        return ResponseEntity.ok(this.coverService.getByBookId(id));
    }
}
