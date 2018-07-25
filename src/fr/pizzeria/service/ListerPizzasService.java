package fr.pizzeria.service;

import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.model.Pizza;

public class ListerPizzasService extends MenuService {

	@Override
	public void executeUC(Scanner questionUser, IPizzaDao dao) {
		// TODO Auto-generated method stub
		System.out.println("Liste des pizzas");
		
		for (Pizza p : dao.findAllPizzas()) {
			System.out.println(p.getCode() + " -> " + p.getLibelle() + "("+p.getPrix() + "€)");
		}
	}

	

}
