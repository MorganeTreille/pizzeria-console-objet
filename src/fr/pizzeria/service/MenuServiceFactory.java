package fr.pizzeria.service;

public class MenuServiceFactory {

	public static MenuService getService(int choice){
		
		switch (choice){
		case 1 : //liste des pizzas
			return new ListerPizzasService();
			
		case 2 : // ajout d'une pizza
			return new AjouterPizzaService();
			
		case 3 : // modification d'une pizza
			return new ModifierPizzaService();
			
		case 4 : //suppression d'une pizza
			return new SupprimerPizzaService();
			
		default :
			return null;
		}
		
	}
}
