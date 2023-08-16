package com.lakhan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	
	 	@GetMapping("/")
	    public String index() {
	        return "index";
	    }
	    
	    @GetMapping("/welcome")
	    public String welcome() {
	        return "welcome";
	    }
	    
	    @GetMapping("/login/facebook")
	    public String loginWithFacebook() {
	        // Implement Facebook login logic
	        return "redirect:/welcome";
	    }
	    
	    @GetMapping("/login/gmail")
	    public String loginWithGmail() {
	        // Implement Gmail login logic
	        return "redirect:/welcome";
	    }
}
