package fr.pizzeria.service;

import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.model.Pizza;

public class AjouterPizzaService extends MenuService {

	@Override
	public void executeUC(Scanner questionUser, IPizzaDao dao) {
		// TODO Auto-generated method stub
		questionUser.nextLine();
		System.out.println("Ajout d'une nouvelle pizza");
		System.out.println("Veuillez saisir le code :");
		String code = questionUser.nextLine();
		System.out.println("Veuillez saisir le nom (sans espace)"+ " :");
		String libelle = questionUser.nextLine();
		System.out.println("Veuillez saisir le prix");
		double price = Double.parseDouble(questionUser.nextLine());
		Pizza pizza = new Pizza(code,libelle,price);
		dao.saveNewPizza(pizza); //lié la classe
	}

	
	
}
