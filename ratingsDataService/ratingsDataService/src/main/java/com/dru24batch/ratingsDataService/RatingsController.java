package com.dru24batch.ratingsDataService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RatingsController {

	
	@GetMapping("/ratingsdata/{id}")
	public Rating getRating(@PathVariable String id) {
		return new Rating(id, 4);
	}
}
