package com.dru24batch.movieCatalogService;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieCatalogController {

	//hardcoded list of movie +ratings info
	@GetMapping("/catalog/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable String userId){
//		return Collections.singletonList(
//				new CatalogItem("jamesbond","investigation" ,4)
//				);
		
		List<Rating> ratingsList = Arrays.asList(
				new Rating("123",4),
				new Rating("456",3));  // assume this the response we got from ratingsdata api 
		
		return 	ratingsList.stream().map(ratings ->{
				return new CatalogItem("transformer","automobiles" ,4);// must come from api 
			}).collect(Collectors.toList());
	}
}
