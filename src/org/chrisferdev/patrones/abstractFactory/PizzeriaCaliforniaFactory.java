package org.chrisferdev.patrones.abstractFactory;

import org.chrisferdev.patrones.abstractFactory.producto.PizzaCaliforniaPepperoni;
import org.chrisferdev.patrones.abstractFactory.producto.PizzaCaliforniaQueso;
import org.chrisferdev.patrones.abstractFactory.producto.PizzaCaliforniaVegetariana;

public class PizzeriaCaliforniaFactory extends PizzeriaZonaAbstractFactory{
    @Override
    PizzaProducto crearPizza(String tipo) {
        PizzaProducto producto = null;
        switch (tipo){
            case "queso":
                producto = new PizzaCaliforniaQueso();
                break;
            case "pepperoni":
                producto = new PizzaCaliforniaPepperoni();
                break;
            case "vegetariana":
                producto = new PizzaCaliforniaVegetariana();
                break;
        }
        return producto;
    }
}
