package fr.pizzeria.service;

import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.model.Pizza;

public class SupprimerPizzaService extends MenuService {

	@Override
	public void executeUC(Scanner questionUser, IPizzaDao dao) {
		// TODO Auto-generated method stub
		questionUser.nextLine();
		System.out.println("Suppression d'une pizza");
		for (Pizza p : dao.findAllPizzas()) {
			System.out.println(p.code + " -> " + p.libelle + "("+p.prix + "€)");
		}
		System.out.println("Veuillez choisir le code de la pizza à supprimer :");
		String codeDelete = questionUser.nextLine();
		dao.deletePizza(codeDelete);
	}

	

}
