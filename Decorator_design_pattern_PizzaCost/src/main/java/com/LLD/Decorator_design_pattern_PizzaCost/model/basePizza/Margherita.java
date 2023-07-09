package com.LLD.Decorator_design_pattern_PizzaCost.model.basePizza;

public class Margherita extends BasePizza {
	private int pizzaCost = 200;
	
	@Override
	public int cost() {
		return pizzaCost;
	}

}
