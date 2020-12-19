package com.michael.simplesite;

import java.time.*;
import java.util.*;

public class ChefService {
	String makeChefSpecial () {
		if(LocalDate.now().getDayOfWeek() == DayOfWeek.MONDAY) {
			return "L'Manburg Special"; //if you know the reference, you know the reference
		} else if(LocalDate.now().getDayOfWeek() == DayOfWeek.TUESDAY) {
			return "Un Bun";
		} else if(LocalDate.now().getDayOfWeek() == DayOfWeek.WEDNESDAY) {
			return "La Brick";
		} else if(LocalDate.now().getDayOfWeek() == DayOfWeek.THURSDAY) {
			return "El Wall";
		} else if(LocalDate.now().getDayOfWeek() == DayOfWeek.FRIDAY) {
			return "D'Out of Ideas";
		} else if(LocalDate.now().getDayOfWeek() == DayOfWeek.SATURDAY) {
			return "L'Rat";
		} else {
			return "Closed today!";
		}
	}
	String giveRandomDrink() {
		Random drinkPicker = new Random();
		int drinkPicked = drinkPicker.nextInt(5);
		if(drinkPicked == 1) {
			return "Shirley Tmeple";
		} else if(drinkPicked == 2) {
			return "Ree Rojers";
		} else if(drinkPicked == 3) {
			return "R I C E"; 
		} else if(drinkPicked == 4) {
			return "Brandon";
		} else {
			return "monke";
		}
	}
}
