package org.chrisferdev.patrones.decorator;

import org.chrisferdev.patrones.decorator.decorador.MayusculaDecorador;
import org.chrisferdev.patrones.decorator.decorador.ReemplazarEspacioDecorador;
import org.chrisferdev.patrones.decorator.decorador.ReversaDecorador;
import org.chrisferdev.patrones.decorator.decorador.SubrayadoDecorado;

public class EjemploDecorador {
    public static void main(String[] args) {
        Formateable texto = new Texto("Hola que tal Andrés!");

        MayusculaDecorador mayuscula = new MayusculaDecorador(texto);
        ReversaDecorador reversa = new ReversaDecorador(mayuscula);
        SubrayadoDecorado subrayar = new SubrayadoDecorado(reversa);
        ReemplazarEspacioDecorador remplazar = new ReemplazarEspacioDecorador(subrayar);

        System.out.println(remplazar.darFormato());
    }
}
