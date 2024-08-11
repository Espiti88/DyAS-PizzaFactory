package edu.unisabana.pizzafactory.model;

import java.util.logging.Level;
import java.util.logging.Logger;

public class AmasadorPizzaGruesa implements Amasar{

    @Override
    public void amasar() {
        Logger.getLogger(AmasadorPizzaDelgada.class.getName())
                .log(Level.INFO, "[@@] Amasando la pizza gruesa con masa convencional.");

        //CODIGO DE LLAMADO AL MICROCONTROLADOR

    }

}
