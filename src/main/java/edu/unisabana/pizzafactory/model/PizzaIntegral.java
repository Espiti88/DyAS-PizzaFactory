package edu.unisabana.pizzafactory.model;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PizzaIntegral extends Pizza{

    public PizzaIntegral(String tamano, ArrayList<Ingrediente> ingredientes) {
        super(tamano, ingredientes);
    }

    @Override
    public void crearAmasador() {
        AmasadorPizzaIntegral amasador = new AmasadorPizzaIntegral();
        amasador.amasar();
    }

    @Override
    public void crearMoldeador() {
        MoldeadorPizzaIntegral moldeador = new MoldeadorPizzaIntegral();

        if (super.getTamano().equals("PEQUEÑA")) {
            moldeador.moldearPizzaPequena();

        } else if (super.getTamano().equals("MEDIANA")) {
            moldeador.moldearPizzaMediana();
        }
    }

    @Override
    public void crearHorneador() {
        HorneadorPizzaIntegral horneador = new HorneadorPizzaIntegral();
        horneador.hornear();
    }
}