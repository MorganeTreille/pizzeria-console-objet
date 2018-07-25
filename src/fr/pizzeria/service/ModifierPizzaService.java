package fr.pizzeria.service;

import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.model.Pizza;

public class ModifierPizzaService extends MenuService{

	@Override
	public void executeUC(Scanner questionUser, IPizzaDao dao) {
		// TODO Auto-generated method stub
		questionUser.nextLine();
		System.out.println("Mise à jour d'une pizza");
		for (Pizza p : dao.findAllPizzas()) {
			System.out.println(p.code + " -> " + p.libelle + "("+p.prix + "€)");
		}
		System.out.println("Veuillez choisir le code de la pizza à modifier");
		String codeModif = questionUser.nextLine();
		System.out.println("Veuillez saisir le code :");
		String newCode = questionUser.nextLine();
		System.out.println("Veuillez saisir le nom (sans espace)"+ " :");
		String newLibelle = questionUser.nextLine();
		System.out.println("Veuillez saisir le prix");
		double newPrice = Double.parseDouble(questionUser.nextLine());
		Pizza pizzaModif = new Pizza(newCode,newLibelle,newPrice);
		dao.updatePizza(codeModif, pizzaModif);
	}

	
	
}
