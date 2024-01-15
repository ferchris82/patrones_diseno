package org.chrisferdev.patrones.abstractFactory;

import org.chrisferdev.patrones.abstractFactory.producto.PizzaNewYorkItaliana;
import org.chrisferdev.patrones.abstractFactory.producto.PizzaNewYorkPepperoni;
import org.chrisferdev.patrones.abstractFactory.producto.PizzaNewYorkVegetariana;

public class PizzaNewYorkFactory extends PizzeriaZonaAbstractFactory{
    @Override
    PizzaProducto crearPizza(String tipo) {
        return switch (tipo) {
            case "vegetariana" -> new PizzaNewYorkVegetariana();
            case "pepperoni" -> new PizzaNewYorkPepperoni();
            case "italiana" -> new PizzaNewYorkItaliana();
            default -> null;
        };
    }
}
