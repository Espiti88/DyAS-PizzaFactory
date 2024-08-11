package edu.unisabana.pizzafactory.model;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class Pizza {
    private String tamano;
    private ArrayList<Ingrediente> ingredientes;

    public Pizza(String tamano, ArrayList<Ingrediente> ingredientes) {
        this.tamano = tamano;
        this.ingredientes = ingredientes;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public void aplicarIngredientes(){
        Logger.getLogger(Pizza.class.getName())
                .log(Level.INFO, "[~~]. Agregando ingredientes... " + this.ingredientes);

        //CODIGO DE LLAMADO AL MICROCONTROLADOR
    }

    public abstract void crearAmasador();
    public abstract void crearMoldeador();
    public abstract void crearHorneador();

}
