package com.example.demo.controller;


import com.example.demo.model.Movie;
import com.example.demo.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movie")
@RequiredArgsConstructor
public class MovieController {
	
	private final MovieService movieService;
	
	@PostMapping("/create")
	@ResponseStatus(HttpStatus.CREATED)
	public Movie create(@RequestBody Movie movie) {
		return movieService.save(movie);
	}
	
	@GetMapping("/all")
	@ResponseStatus(HttpStatus.OK)
	public List<Movie> read() {
		return movieService.getAllMovies();
	}
	
	@GetMapping("/read/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Movie read(@PathVariable Long id) {
		return movieService.getMovieById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		movieService.deleteMovie(id);
	}
	
	@ResponseStatus(HttpStatus.OK)
	@PutMapping("/update/{id}")
	public Movie update(@PathVariable Long id, @RequestBody Movie movie) {
		return movieService.updateMovie(movie, id);
	}
}
























