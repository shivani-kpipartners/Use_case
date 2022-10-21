package com.Assignment_20oct.Insurance;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@Autowired
	private ClientRepo cr;
	
	@GetMapping("/d")
	public List<Client_entity> joincol1(){
		return cr.getdetails(1);
	}
	
@GetMapping("/client_discount/{tenure}/{premium}")
public int discount(@PathVariable String tenure, @PathVariable int premium) {
	if (tenure.equals("morethan5")) {
		premium = (int) (premium - (premium * 0.12));
		return premium;
	}

	if (tenure.equals("equalto5")) {

		premium = (int) (premium - (premium * 0.1));
		return premium;
	}

	if (tenure.equals("lessthan5")) {

		return premium;
	}

	else {
		return 0;
	}

}}