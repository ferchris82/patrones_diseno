package org.chrisferdev.patrones.singleton;

public class ConexionBDSingleton {
    private static ConexionBDSingleton instancia;

    //Primera regla del Singleton *Constructor privado
    private ConexionBDSingleton(){
        System.out.println("Conectando algún motor de base de datos");
    }

    //Segunda regla del Singleton *Método estático que nos devuelva la instancia
    public static ConexionBDSingleton getInstancia(){
        if(instancia == null){
            instancia = new ConexionBDSingleton();
        }
        return instancia;
    }
}
