package com.dru24batch.movieCatalogService;

public class Movie {
	private int movieId;
	private String name;


	public Movie() {
	}
	public Movie(int movieId, String name) {
		this.movieId = movieId;
		this.name = name;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


}
