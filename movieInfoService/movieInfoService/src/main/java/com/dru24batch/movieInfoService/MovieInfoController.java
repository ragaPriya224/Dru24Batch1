package com.dru24batch.movieInfoService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieInfoController {

	
	@GetMapping("/movie/{movieId}")
	public Movie getMovieInfo(@PathVariable int movieId) {
		return new Movie(movieId,"testname");
	}
}
