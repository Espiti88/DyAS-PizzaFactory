package edu.unisabana.pizzafactory.model;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MoldeadorPizzaIntegral implements Moldear{

    public void moldearPizzaPequena() {
        Logger.getLogger(MoldeadorPizzaDelgada.class.getName())
                .log(Level.INFO, "[O] Moldeando pizza pequena de masa integral.");

        //CODIGO DE LLAMADO AL MICROCONTROLADOR

    }

    public void moldearPizzaMediana() {
        Logger.getLogger(MoldeadorPizzaDelgada.class.getName())
                .log(Level.INFO, "[O] Moldeando pizza mediana de masa integral.");

        //CODIGO DE LLAMADO AL MICROCONTROLADOR
    }

}
