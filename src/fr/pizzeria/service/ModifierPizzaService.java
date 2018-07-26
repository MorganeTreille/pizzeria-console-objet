package fr.pizzeria.service;

import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.exception.UpdatePizzaException;
import fr.pizzeria.model.Pizza;

public class ModifierPizzaService extends MenuService{

	@Override
	public void executeUC(Scanner questionUser, IPizzaDao dao) throws UpdatePizzaException{
		// TODO Auto-generated method stub
		questionUser.nextLine();
		
		System.out.println("Mise à jour d'une pizza");
		for (Pizza p : dao.findAllPizzas()) {
			System.out.println(p.getCode() + " -> " + p.getLibelle() + "("+p.getPrix() + "€)");
		}
		
		System.out.println("Veuillez choisir le code de la pizza à modifier");
		String codeModif = questionUser.nextLine();
		
		// exception si le code donnée n'existe pas
		if(dao.findPizzaByCode(codeModif) == null){
			throw new UpdatePizzaException("Ce code n'existe pas !");
		}
		
		System.out.println("Veuillez saisir le code :");
		String newCode = questionUser.nextLine();
		
		if(dao.pizzaExists(newCode)){
			throw new UpdatePizzaException("Ce code existe déjà !");
		}
		
		System.out.println("Veuillez saisir le nom (sans espace)"+ " :");
		String newLibelle = questionUser.nextLine();
		
		System.out.println("Veuillez saisir le prix");
		double newPrice = Double.parseDouble(questionUser.nextLine());
		Pizza pizzaModif = new Pizza(newCode,newLibelle,newPrice);
		dao.updatePizza(codeModif, pizzaModif);
	}

	
	
}
