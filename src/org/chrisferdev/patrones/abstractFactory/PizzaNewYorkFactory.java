package org.chrisferdev.patrones.abstractFactory;

import org.chrisferdev.patrones.abstractFactory.producto.PizzaNewYorkItaliana;
import org.chrisferdev.patrones.abstractFactory.producto.PizzaNewYorkPepperoni;
import org.chrisferdev.patrones.abstractFactory.producto.PizzaNewYorkVegetariana;

public class PizzaNewYorkFactory extends PizzeriaZonaAbstractFactory{
    @Override
    PizzaProducto crearPizza(String tipo) {
        PizzaProducto producto = null;
        switch (tipo){
            case "vegetariana":
                producto = new PizzaNewYorkVegetariana();
                break;
            case "pepperoni":
                producto = new PizzaNewYorkPepperoni();
                break;
            case "italiana":
                producto = new PizzaNewYorkItaliana();
                break;
        }
        return producto;
    }
}
