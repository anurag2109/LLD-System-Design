package com.LLD.Decorator_design_pattern_PizzaCost;

import com.LLD.Decorator_design_pattern_PizzaCost.model.basePizza.BasePizza;
import com.LLD.Decorator_design_pattern_PizzaCost.model.basePizza.VegDelight;
import com.LLD.Decorator_design_pattern_PizzaCost.model.decorator.ExtraCheese;
import com.LLD.Decorator_design_pattern_PizzaCost.model.decorator.Mushroom;

/**
 * Decorator Design Pattern
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BasePizza basePizza = new Mushroom(new ExtraCheese(new VegDelight()));
        System.out.println(basePizza.cost());
        
    }
}
