package org.chrisferdev.patrones.abstractFactory.ejemplo;

import org.chrisferdev.patrones.abstractFactory.PizzaNewYorkFactory;
import org.chrisferdev.patrones.abstractFactory.PizzaProducto;
import org.chrisferdev.patrones.abstractFactory.PizzeriaCaliforniaFactory;
import org.chrisferdev.patrones.abstractFactory.PizzeriaZonaAbstractFactory;

public class EjemploFactory {
    public static void main(String[] args) {
        PizzeriaZonaAbstractFactory ny = new PizzaNewYorkFactory();
        PizzeriaZonaAbstractFactory califorinia = new PizzeriaCaliforniaFactory();

        PizzaProducto pizza = califorinia.ordenarPizza("queso");
        System.out.println("Bruce ordena la pizza " + pizza.getNombre());

        pizza = ny.ordenarPizza("pepperoni");
        System.out.println("Andrés ordena una " + pizza.getNombre());

        pizza = califorinia.ordenarPizza("vegetariana");
        System.out.println("James ordena " + pizza.getNombre());

        pizza = ny.ordenarPizza("vegetariana");
        System.out.println("Linus ordena la pizza " + pizza.getNombre());

        pizza = califorinia.ordenarPizza("pepperoni");
        System.out.println("John ordena la pizza " + pizza.getNombre());

        System.out.println("pizza = " + pizza);
    }
}
