package com.Assignment_20oct.Insurance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
	@Autowired
	private ClientRepo cr;
	
	@GetMapping("/d")
	public List<Client_entity> joincol1(){
		return cr.getdetails(1);
	}

}
