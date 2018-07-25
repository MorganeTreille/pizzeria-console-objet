package fr.pizzeria.service;

import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;

abstract public class MenuService {

	public abstract void executeUC(Scanner questionUser,IPizzaDao dao);
		
}

