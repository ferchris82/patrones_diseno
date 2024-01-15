package org.chrisferdev.patrones.decorator.decorador;

import org.chrisferdev.patrones.decorator.Formateable;

public class ReemplazarEspacioDecorador extends TextoDecorador{
    public ReemplazarEspacioDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        return texto.darFormato().replace(" ", "_");
    }
}
