package com.LLD.Decorator_design_pattern_PizzaCost.model.decorator;

import com.LLD.Decorator_design_pattern_PizzaCost.model.basePizza.BasePizza;

public class Mushroom extends ToppingDecorator {

	BasePizza basePizza;
	public Mushroom(BasePizza basePizza) {
		this.basePizza = basePizza;
	}

	@Override
	public int cost() {
		return this.basePizza.cost() + 20;
	}

}
