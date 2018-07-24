package fr.pizzeria.console;

import java.util.Scanner;

import fr.pizzeria.model.Pizza;

public class PizzeriaAdminConsoleApp {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza [] listePizza = new Pizza[8];
		listePizza[0] = new Pizza(0,"PEP","Pépéroni",12.50);
		listePizza[1] = new Pizza(1,"MAR","Marguerita",14.00);
		listePizza[2] = new Pizza(2,"REIN","La Reine",11.50);
		listePizza[3] = new Pizza(3,"FRO","La 4 fromages",12.00);
		listePizza[4] = new Pizza(4,"CAN","La cannibale",12.50);
		listePizza[5] = new Pizza(5,"SAV","La savoyarde",13.00);
		listePizza[6] = new Pizza(6,"ORI","L'orientale",13.50);
		listePizza[7] = new Pizza(7,"IND","L'indienne",14.00);
		
		Scanner questionUser = new Scanner(System.in) ;
		int a = 0;
			while (a != 99) {
				System.out.println("***** Pizzeria Administration *****");
				System.out.println("1. Lister les pizzas");
				System.out.println("2. Ajouter une nouvelle pizza");
				System.out.println("3. Mettre à jour une pizza");
				System.out.println("4. Supprimer une pizza");
				System.out.println("99. sortir");
			a = questionUser.nextInt();
			
			switch (a){
				case 1 :
					System.out.println("Liste des pizzas");
					for (int i=0;i<listePizza.length;i++){
						System.out.println(listePizza[i].code + " -> " + listePizza[i].libelle +" (" + listePizza[i].prix +"€)" );
					}
				break;
				
				case 2 :
					questionUser.nextLine();
					System.out.println("Ajout d'une nouvelle pizza");
					System.out.println("Veuillez saisir le code :");
					String code = questionUser.nextLine();
					System.out.println("Veuillez saisir le nom (sans espace)"+ " :");
					String libelle = questionUser.nextLine();
					System.out.println("Veuillez saisir le prix");
					double price = Double.parseDouble(questionUser.nextLine());
					Pizza [] newListePizza = new Pizza[listePizza.length+1];
					for(int i=0;i<listePizza.length;i++){
						newListePizza[i] = listePizza[i];
					}
					newListePizza[newListePizza.length-1] = new Pizza(code,libelle,price);
					listePizza = newListePizza;
					
				break;
				
				case 3 :
					questionUser.nextLine();
					System.out.println("Mise à jour d'une pizza");
					for (int i=0;i<listePizza.length;i++){
						System.out.println(listePizza[i].code + " -> " + listePizza[i].libelle +" (" + listePizza[i].prix +"€)" );
					}
					System.out.println("Veuillez choisir le code de la pizza à modifier");
					String codeModif = questionUser.nextLine();
					System.out.println("Veuillez saisir le code :");
					String newCode = questionUser.nextLine();
					System.out.println("Veuillez saisir le nom (sans espace)"+ " :");
					String newLibelle = questionUser.nextLine();
					System.out.println("Veuillez saisir le prix");
					double newPrice = Double.parseDouble(questionUser.nextLine());
					for (int i=0;i<listePizza.length;i++){
						if(listePizza[i].code.equals(codeModif)){
							listePizza[i]= new Pizza(newCode, newLibelle, newPrice);
						}
					}
				break;
				
				case 4 :
					questionUser.nextLine();
					System.out.println("Suppression d'une pizza");
					for (int i=0;i<listePizza.length;i++){
						System.out.println(listePizza[i].code + " -> " + listePizza[i].libelle +" (" + listePizza[i].prix +"€)" );
					}
					System.out.println("Veuillez choisir le code de la pizza à supprimer :");
					String codeDelete = questionUser.nextLine();
					Pizza [] newListe = new Pizza[listePizza.length - 1];
					int j = 0;
					for (int i = 0;i<listePizza.length;i++){
						if(!listePizza[i].code.equals(codeDelete)){
							newListe[j]=listePizza[i];
							j++;
						}
					}
					listePizza = newListe;
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
