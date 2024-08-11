package edu.unisabana.pizzafactory.model;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HorneadorPizzaIntegral implements Hornear{

    @Override
    public void hornear() {
        Logger.getLogger(AmasadorPizzaDelgada.class.getName())
                .log(Level.INFO, "[~~] Horneando la pizza con masa integral.");

        //CODIGO DE LLAMADO AL MICROCONTROLADOR
    }

}
