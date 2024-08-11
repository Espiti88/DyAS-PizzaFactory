package edu.unisabana.pizzafactory.consoleview;

import edu.unisabana.pizzafactory.model.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class PreparadorPizza {

    public static void main(String args[]){

        //Pizza mediana gruesa
        ArrayList<Ingrediente> ingredientesGruesaMediana = new ArrayList<>(Arrays.asList(
                new Ingrediente("Queso", 1),
                new Ingrediente("Jamon", 2)
        ));
        PizzaGruesa gruesa = new PizzaGruesa("MEDIANA", ingredientesGruesaMediana);
        gruesa.aplicarIngredientes();
        gruesa.crearAmasador();
        gruesa.crearMoldeador();
        gruesa.crearHorneador();

        //Pizza pequeña delgada
        ArrayList<Ingrediente> ingredientesDelgadaPequena = new ArrayList<>(Arrays.asList(
                new Ingrediente("Tomate", 1),
                new Ingrediente("Peperoni", 2),
                new Ingrediente("Cebolla", 1)
        ));
        PizzaDelgada delgada = new PizzaDelgada("PEQUEÑA", ingredientesDelgadaPequena);
        delgada.aplicarIngredientes();
        delgada.crearAmasador();
        delgada.crearMoldeador();
        delgada.crearHorneador();

        //Pizza mediana integral
        ArrayList<Ingrediente> ingredientesIntegralMediana = new ArrayList<>(Arrays.asList(
                new Ingrediente("Lechuga", 1),
                new Ingrediente("Quinua", 2)
        ));
        PizzaIntegral integral = new PizzaIntegral("MEDIANA", ingredientesIntegralMediana);
        integral.aplicarIngredientes();
        integral.crearAmasador();
        integral.crearMoldeador();
        integral.crearHorneador();
    }
}
