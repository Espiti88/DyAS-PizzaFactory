package edu.unisabana.pizzafactory.model;

import java.util.ArrayList;

public class Informacion {
    private String tamano;
    private ArrayList<Ingrediente> ingredientes;

    public Informacion(String tamano, ArrayList<Ingrediente> ingredientes) {
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
}
