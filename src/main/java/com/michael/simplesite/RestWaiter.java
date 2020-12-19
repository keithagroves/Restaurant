package com.michael.simplesite;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class RestWaiter {
	@GetMapping("/special")
	String returnString () {
		System.out.println("Order taken!");
		ChefService chef = new ChefService();
		return chef.makeChefSpecial();
	}
	@GetMapping("/drink")
	String returnDrink () {
		ChefService chef = new ChefService();
		return chef.giveRandomDrink();
	}
}
