package org.chrisferdev.patrones.decorator2.decorador;

import org.chrisferdev.patrones.decorator2.Configurable;

abstract public class CafeDecorador implements Configurable {
    protected   Configurable cafe;

    public CafeDecorador(Configurable cafe) {
        this.cafe = cafe;
    }
}
