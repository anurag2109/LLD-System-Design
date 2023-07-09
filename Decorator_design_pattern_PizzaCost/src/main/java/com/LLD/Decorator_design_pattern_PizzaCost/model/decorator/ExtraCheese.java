package com.LLD.Decorator_design_pattern_PizzaCost.model.decorator;

import com.LLD.Decorator_design_pattern_PizzaCost.model.basePizza.BasePizza;

public class ExtraCheese extends BasePizza {

	BasePizza basePizza;
	public ExtraCheese(BasePizza basePizza) {
		this.basePizza = basePizza;
	}

	@Override
	public int cost() {
		return this.basePizza.cost() + 30;
	}

}
