package com.adaming.ladate;



import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;



/**
 * Handles requests for the application home page.
 */
@Controller

public class HomeController {
	
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */


	@RequestMapping("/")
	  public String redirectPage() {
	    return "index";
	  }


	  
}
