package com.example.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		return "index";
	}

	@RequestMapping(value = "/employee")
	public ModelAndView user(ModelMap model, HttpServletRequest request) {
		String message = "Welcome to Gain Java Knowledge Spring MVC Tutorial";
		message += "<br>You Finished it....!";
		System.out.println(message);
		model.addAttribute("message", message);
		return new ModelAndView("welcome", "message", message);
	}
}
