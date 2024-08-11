package edu.unisabana.pizzafactory.model;

import java.util.ArrayList;

public class Pizza {
    private float tamano;
    private ArrayList<Ingrediente> ingredientes;

    public Pizza(float tamano, ArrayList<Ingrediente> ingredientes) {
        this.tamano = tamano;
        this.ingredientes = ingredientes;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
        System.out.println("Agregando ingredientes...");
    }

    public float getTamano() {
        return tamano;
    }

    public void setTamano(float tamano) {
        this.tamano = tamano;
    }
}
