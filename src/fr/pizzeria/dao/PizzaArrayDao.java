package fr.pizzeria.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import fr.pizzeria.model.Pizza;

public class PizzaArrayDao implements IPizzaDao{
	
	
	Scanner questionUser = new Scanner(System.in) ;
	private List<Pizza> listePizza = new ArrayList();

	
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
		// TODO Auto-generated method stub
		listePizza.add (pizza);
		}

	@Override
	public void updatePizza(String codePizza, Pizza pizza) {
		// TODO Auto-generated method stub
		for (int i=0;i<listePizza.size();i++){
			if(listePizza.get(i).getCode().equals(codePizza)){
				listePizza.get(i).setCode(pizza.getCode());
				listePizza.get(i).setLibelle(pizza.getLibelle());
				listePizza.get(i).setPrix(pizza.getPrix());
			}
		}
	}

	@Override
	public void deletePizza(String codePizza) {
		// TODO Auto-generated method stub
		for(int i=0;i<listePizza.size();i++){
			if(listePizza.get(i).getCode().equals(codePizza)){
			listePizza.remove(i).toString();
			}
		}
	}

	@Override
	public Pizza findPizzaByCode(String codePizza) {
		// TODO Auto-generated method stub
		for(int i=0;i<listePizza.size();i++){
			if(listePizza.get(i).getCode().equals(codePizza)){
				return listePizza.get(i);
			}
		}
		return null;
	}

	@Override
	public boolean pizzaExists(String codePizza) {
		return this.findPizzaByCode(codePizza) != null;
		
	}
}

	
	


	
