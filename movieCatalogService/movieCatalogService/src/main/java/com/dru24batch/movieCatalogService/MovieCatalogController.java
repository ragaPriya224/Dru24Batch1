package com.dru24batch.movieCatalogService;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieCatalogController {
	@Autowired
	private RestTemplate rt;
	
	//hardcoded list of movie +ratings info
	@GetMapping("/catalog/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable String userId){

	UserRating userRating = 	rt.getForObject("http://ratingsDataService/ratingsdata/users/"+userId, UserRating.class);
		
		return 	userRating.getUserRating().stream().map(ratings ->{
			Movie movie =rt.getForObject("http://movieInfoService/movie/"+ratings.getMovieId(), Movie.class);
			return new CatalogItem(movie.getName(),"  " ,ratings.getRating());

		}).collect(Collectors.toList());
	}
}
