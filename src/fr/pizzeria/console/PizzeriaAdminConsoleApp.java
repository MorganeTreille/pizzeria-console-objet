package fr.pizzeria.console;

import java.util.Scanner;

public class PizzeriaAdminConsoleApp {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner questionUser = new Scanner(System.in) ;
		int a = 0;
			while (a != 99) {
				System.out.println("***** Pizzeria Administration *****");
				System.out.println("1. Lister les pizzas");
				System.out.println("2. Ajouter une nouvelle pizza");
				System.out.println("3. Mettre à jour une pizza");
				System.out.println("4. Supprimer une pizza");
				System.out.println("99. sortir");
			a = questionUser.nextInt() ;
			switch (a){
				case 1 :
					System.out.println("Liste des pizzas");
				break;
				case 2 :
					System.out.println("Ajout d'une nouvelle pizza");
				break;
				case 3 :
					System.out.println("Mise à jour d'une pizza");
				break;
				case 4 :
					System.out.println("Suppression d'une pizza");
				break;
				case 99 :
					System.out.println("Au revoir");
				break;
				default :
					System.out.println("Recommencez !");
				break;
			}
		}
		
		
	}

}
