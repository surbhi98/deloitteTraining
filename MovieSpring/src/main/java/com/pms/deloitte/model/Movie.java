package com.pms.deloitte.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(schema ="hr" , name = "Movie100")

public class Movie {

	@Id
	private int movieId;
	
	@Column
	private String movieName;
	
	@Column
	private String directorName;
	
	@Column
	private int budget;
	
	
	
	
	public Movie(int movieId, String movieName, String directorName, int budget) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.directorName = directorName;
		this.budget = budget;
	}




	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", directorName=" + directorName + ", budget="
				+ budget + "]";
	}




	public int getMovieId() {
		return movieId;
	}




	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}




	public String getMovieName() {
		return movieName;
	}




	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}




	public String getDirectorName() {
		return directorName;
	}




	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}




	public int getBudget() {
		return budget;
	}




	public void setBudget(int budget) {
		this.budget = budget;
	}




	public Movie() {
		// TODO Auto-generated constructor stub
	}

}
