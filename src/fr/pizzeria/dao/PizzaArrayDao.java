package fr.pizzeria.dao;

import java.util.Scanner;

import fr.pizzeria.model.Pizza;

public class PizzaArrayDao implements IPizzaDao{
	
	
	Scanner questionUser = new Scanner(System.in) ;
	Pizza [] listePizza = new Pizza[8];

	
	public PizzaArrayDao(){
		listePizza[0] = new Pizza(0,"PEP","Pépéroni",12.50);
		listePizza[1] = new Pizza(1,"MAR","Marguerita",14.00);
		listePizza[2] = new Pizza(2,"REIN","La Reine",11.50);
		listePizza[3] = new Pizza(3,"FRO","La 4 fromages",12.00);
		listePizza[4] = new Pizza(4,"CAN","La cannibale",12.50);
		listePizza[5] = new Pizza(5,"SAV","La savoyarde",13.00);
		listePizza[6] = new Pizza(6,"ORI","L'orientale",13.50);
		listePizza[7] = new Pizza(7,"IND","L'indienne",14.00);
	}
	
	@Override
	public Pizza[] findAllPizzas() {
		// TODO Auto-generated method stub
		return listePizza;
	}

	@Override
	public void saveNewPizza(Pizza pizza) {
		// TODO Auto-generated method stub
		Pizza [] newListePizza = new Pizza[listePizza.length+1];
		for(int i=0;i<listePizza.length;i++){
			newListePizza[i] = listePizza[i];
		}
		newListePizza[newListePizza.length-1] = pizza;
		listePizza = newListePizza;
	}

	@Override
	public void updatePizza(String codePizza, Pizza pizza) {
		// TODO Auto-generated method stub
		for (int i=0;i<listePizza.length;i++){
			if(listePizza[i].code.equals(codePizza)){
				listePizza[i]= pizza;
			}
		}
	}

	@Override
	public void deletePizza(String codePizza) {
		// TODO Auto-generated method stub
		Pizza [] newListe = new Pizza[listePizza.length - 1];
		int j = 0;
		for (int i = 0;i<listePizza.length;i++){
			if(!listePizza[i].code.equals(codePizza)){
				newListe[j]=listePizza[i];
				j++;
			}
		}
		listePizza = newListe;
	}

	@Override
	public Pizza findPizzaByCode(String codePizza) {
		// TODO Auto-generated method stub
		for (int i=0;i<listePizza.length;i++){
			if (listePizza[i].code.equals(codePizza)){
				return listePizza[i];
			}
		}
		return null;
	}

	@Override
	public boolean pizzaExists(String codePizza) {
		// TODO Auto-generated method stub
		for (int i=0;i<listePizza.length;i++){
			if (listePizza[i].code.equals(codePizza)){
				return true;
			}
		}
		return false;
	}
}

	
	


	
