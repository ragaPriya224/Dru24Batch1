package com.dru24batch.movieCatalogService;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieCatalogController {

	//hardcoded list of movie +ratings info
	@GetMapping("/catalog/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable String userId){
		return Collections.singletonList(
				new CatalogItem("jamesbond","investigation" ,4)
				);
	}
}
