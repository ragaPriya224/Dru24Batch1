package com.dru24batch.movieCatalogService;

import java.util.Arrays;
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


		//		RestTemplate rt = new RestTemplate(); //tight coupling 

		List<Rating> ratingsList = Arrays.asList(
				new Rating("123",4), //movie id, rating
				new Rating("456",3));  // assume this the response we got from ratingsdata api 

		return 	ratingsList.stream().map(ratings ->{
			Movie movie =rt.getForObject("http://localhost:8082/movie/"+ratings.getMovieId(), Movie.class);
			return new CatalogItem(movie.getName(),"  " ,ratings.getRating());// must come from api 
		}).collect(Collectors.toList());
	}
}
