package fr.pizzeria.service;

import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.exception.StockageException;

abstract public class MenuService {

	public abstract void executeUC(Scanner questionUser,IPizzaDao dao)throws StockageException;
		
}

