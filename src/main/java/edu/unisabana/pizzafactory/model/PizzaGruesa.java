package edu.unisabana.pizzafactory.model;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PizzaGruesa extends Pizza{

    public PizzaGruesa(String tamano, ArrayList<Ingrediente> ingredientes) {
        super(tamano, ingredientes);
    }

    @Override
    public void crearAmasador() {
        AmasadorPizzaGruesa amasador = new AmasadorPizzaGruesa();
        amasador.amasar();
    }

    @Override
    public void crearMoldeador() {
        MoldeadorPizzaGruesa moldeador = new MoldeadorPizzaGruesa();

        if (super.getTamano().equals("PEQUEÑA")) {
            moldeador.moldearPizzaPequena();

        } else if (super.getTamano().equals("MEDIANA")) {
            moldeador.moldearPizzaMediana();
        }
    }

    @Override
    public void crearHorneador() {
        HorneadorPizzaGruesa horneador = new HorneadorPizzaGruesa();
        horneador.hornear();
    }
}