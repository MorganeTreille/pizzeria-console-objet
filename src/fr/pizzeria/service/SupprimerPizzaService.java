package fr.pizzeria.service;

import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.exception.DeletePizzaException;
import fr.pizzeria.model.Pizza;

public class SupprimerPizzaService extends MenuService {

	@Override
	public void executeUC(Scanner questionUser, IPizzaDao dao) throws DeletePizzaException{
		// TODO Auto-generated method stub
		questionUser.nextLine();
		
		System.out.println("Suppression d'une pizza");
		for (Pizza p : dao.findAllPizzas()) {
			System.out.println(p.getCode() + " -> " + p.getLibelle() + "("+p.getPrix() + "€)");
		}
		
		System.out.println("Veuillez choisir le code de la pizza à supprimer :");
		String codeDelete = questionUser.nextLine();
		
		// exception si le code donné n'existe pas
		if (dao.findPizzaByCode(codeDelete) == null){
			throw new DeletePizzaException("Ce code n'existe pas !");
		}
		
		dao.deletePizza(codeDelete);
		
	}
}


