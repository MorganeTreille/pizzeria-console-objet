package fr.pizzeria.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import fr.pizzeria.model.Pizza;

public class PizzaArrayDao implements IPizzaDao{
	
	
	Scanner questionUser = new Scanner(System.in) ;
	List<Pizza> listePizza = new ArrayList();

	
	public PizzaArrayDao(){
		listePizza.add (new Pizza(0,"PEP","Pépéroni",12.50));
		listePizza.add (new Pizza(1,"MAR","Marguerita",14.00));
		listePizza.add (new Pizza(2,"REIN","La Reine",11.50));
		listePizza.add (new Pizza(3,"FRO","La 4 fromages",12.00));
		listePizza.add (new Pizza(4,"CAN","La cannibale",12.50));
		listePizza.add (new Pizza(5,"SAV","La savoyarde",13.00));
		listePizza.add (new Pizza(6,"ORI","L'orientale",13.50));
		listePizza.add (new Pizza(7,"IND","L'indienne",14.00));
	}
	
	@Override
	public List<Pizza> findAllPizzas() {
		// TODO Auto-generated method stub
		return listePizza;
	}

	@Override
	public void saveNewPizza(Pizza pizza) {
		listePizza.add (pizza);
		// TODO Auto-generated method stub
		//Pizza [] newListePizza = new Pizza[listePizza.length+1];
		//for(int i=0;i<listePizza.length;i++){
		//	newListePizza[i] = listePizza[i];
		//}
		//newListePizza[newListePizza.length-1] = pizza;
		//listePizza = newListePizza;
	}

	@Override
	public void updatePizza(String codePizza, Pizza pizza) {
		for (int i=0;i<listePizza.size();i++){
			if(listePizza.get(i).getCode().equals(codePizza)){
				listePizza.get(i).setCode(pizza.getCode());
				listePizza.get(i).setLibelle(pizza.getLibelle());
				listePizza.get(i).setPrix(pizza.getPrix());
			}
		}
	
		// TODO Auto-generated method stub
		//for (int i=0;i<listePizza.length;i++){
		//	if(listePizza[i].code.equals(codePizza)){
		//		listePizza[i]= pizza;
		//	}
		//}
	}

	@Override
	public void deletePizza(String codePizza) {
		for(int i=0;i<listePizza.size();i++){
			if(listePizza.get(i).getCode().equals(codePizza)){
			listePizza.remove(i).toString();
			}
		}
		// TODO Auto-generated method stub
		//Pizza [] newListe = new Pizza[listePizza.length - 1];
		//int j = 0;
		//for (int i = 0;i<listePizza.length;i++){
		//	if(!listePizza[i].code.equals(codePizza)){
		//		newListe[j]=listePizza[i];
		//		j++;
		//	}
		//}
		//listePizza = newListe;
	}

	@Override
	public Pizza findPizzaByCode(String codePizza) {
			
		
		// TODO Auto-generated method stub
		//for (int i=0;i<listePizza.length;i++){
		//	if (listePizza[i].code.equals(codePizza)){
		//		return listePizza[i];
		//	}
		//}
		return null;
	}

	@Override
	public boolean pizzaExists(String codePizza) {
		if (listePizza.isEmpty()){
			return false;
		}
		return true;
		// TODO Auto-generated method stub
		//for (int i=0;i<listePizza.length;i++){
		//	if (listePizza[i].code.equals(codePizza)){
		//		return true;
		//	}
		//}
		
	}
}

	
	


	
