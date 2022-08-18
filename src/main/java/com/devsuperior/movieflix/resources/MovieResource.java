package com.devsuperior.movieflix.resources;

import com.devsuperior.movieflix.dto.MovieDTO;
import com.devsuperior.movieflix.entities.Movie;
import com.devsuperior.movieflix.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movies")
public class MovieResource {

    @Autowired
    private MovieService service;

    @GetMapping("/{id}")
    public ResponseEntity<MovieDTO> findById(@PathVariable Long id) {

        MovieDTO movie = service.findById(id);
        return ResponseEntity.ok().body(movie);
    }

    @GetMapping
    public ResponseEntity<Page<MovieDTO>> findByGenre(
            @RequestParam(name = "genreId", defaultValue = "0") Long genreId,
            Pageable pageable) {
        Page<MovieDTO> page = service.findByGenre(genreId, pageable);

        return ResponseEntity.ok().body(page);
    }


}
