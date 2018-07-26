package fr.pizzeria.console;

import java.util.Scanner;

import fr.pizzeria.dao.PizzaArrayDao;
import fr.pizzeria.exception.StockageException;
import fr.pizzeria.service.MenuService;
import fr.pizzeria.service.MenuServiceFactory;


public class PizzeriaAdminConsoleApp {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PizzaArrayDao dao = new PizzaArrayDao();
		
		Scanner questionUser = new Scanner(System.in) ;
		int a = 0;
			while (a != 99) {
				System.out.println("***** Pizzeria Administration *****");
				System.out.println("1. Lister les pizzas");
				System.out.println("2. Ajouter une nouvelle pizza");
				System.out.println("3. Mettre � jour une pizza");
				System.out.println("4. Supprimer une pizza");
				System.out.println("99. sortir");
			a = questionUser.nextInt();
			
			if (a != 99){
				MenuServiceFactory option = new MenuServiceFactory();
				MenuService menuService = option.getService(a);
				try {
					menuService.executeUC(questionUser,dao);
				} catch (StockageException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else {	
				System.out.println("Au revoir");
			}
		}
		
		
	}

}
