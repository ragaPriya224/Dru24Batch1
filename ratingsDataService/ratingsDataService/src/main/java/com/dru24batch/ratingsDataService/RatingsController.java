package com.dru24batch.ratingsDataService;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RatingsController {


	@GetMapping("/ratingsdata/{id}")
	public Rating getRating(@PathVariable String id) {
		return new Rating(id, 4);
	}
	//userid -? movieId's

	@GetMapping("ratingsdata/users/{userId}")
	public UserRating   getUserRating(@PathVariable String userId) {
		List<Rating> ratingsList = Arrays.asList(
				new Rating("123",4), //movie id, rating
				new Rating("456",3));  // assume this the response we got from ratingsdata api 
	
		UserRating user = new UserRating();
		user.setUserRating(ratingsList);
		return user;
	}

}
