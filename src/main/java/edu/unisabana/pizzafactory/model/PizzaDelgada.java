package edu.unisabana.pizzafactory.model;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PizzaDelgada extends Pizza{

    public PizzaDelgada(String tamano, ArrayList<Ingrediente> ingredientes) {
        super(tamano, ingredientes);
    }

    @Override
    public void crearAmasador() {
        AmasadorPizzaDelgada amasador = new AmasadorPizzaDelgada();
        amasador.amasar();
    }

    @Override
    public void crearMoldeador() {
        MoldeadorPizzaDelgada moldeador = new MoldeadorPizzaDelgada();

        if (super.getTamano().equals("PEQUEÑA")) {
            moldeador.moldearPizzaPequena();

        } else if (super.getTamano().equals("MEDIANA")) {
            moldeador.moldearPizzaMediana();
        }
    }

    @Override
    public void crearHorneador() {
            HorneadorPizzaDelgada horneador = new HorneadorPizzaDelgada();
            horneador.hornear();
    }
}
