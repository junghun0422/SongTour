package com.song.tour.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
//@Controller
public class TestController
{
	@GetMapping( "/" )
	public ModelAndView goIndex( ModelAndView mv )
	{
		mv.setViewName( "index" );
		return mv;
	}
	
	@GetMapping( value = "/login/oauth2/code/google" )
	public String googleLogin() 
	{
		log.info("!FSADFASDFASDFAS");
		return "index";
	}
}
