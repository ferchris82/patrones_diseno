package org.chrisferdev.patrones.decorator.decorador;

import org.chrisferdev.patrones.decorator.Formateable;

public class SubrayadoDecorado extends TextoDecorador{
    public SubrayadoDecorado(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        int largo = texto.darFormato().length();
        StringBuilder sb = new StringBuilder(texto.darFormato());
        sb.append("\n");
        for(int i = 0; i< largo; i++){
            sb.append("_");
        }
        return sb.toString();
    }
}
