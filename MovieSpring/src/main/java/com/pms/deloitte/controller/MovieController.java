package com.pms.deloitte.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pms.deloitte.dao.MovieDAO;
import com.pms.deloitte.model.Movie;


@RestController
public class MovieController {

	@Autowired
	MovieDAO movieDAO;
	
	
	public MovieController() {
		// TODO Auto-generated constructor stub
	}
	

	@RequestMapping("/getMovie")
	public String getMovie()
	{	return "Getting Movie!!";
		
	}
	
	@RequestMapping("/saveMovie")
	public String saveMovie()
	{	
		Movie movie = new Movie(11, "Ironman", "...", 249009);
		movieDAO.save(movie);
		return "saved movie!";
		
	}

}
