package com.LLD.Decorator_design_pattern_PizzaCost.model.basePizza;

public class VegDelight extends BasePizza {

	int pizzaCost = 300;
	
	@Override
	public int cost() {
		return pizzaCost;
	}

}
