package com.Caio.ApiRest.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

	
	
	@GetMapping(value = "/Autor")
	public String GetAuthor() {
		
		return "Caio Pereira da Silva";
	}
		
	
	
	
}
