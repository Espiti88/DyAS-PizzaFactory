package edu.unisabana.pizzafactory.consoleview;

import edu.unisabana.pizzafactory.model.*;

import java.util.ArrayList;
import java.util.Scanner;


public class PreparadorPizza {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        Informacion info = null;

        while(true){
            System.out.println("¡Bienvenido! Elige el tipo de masa de tu preferencia:");
            System.out.println("1) Delgada\n2) Gruesa\n3) Integral\n4) Salir");
            opcion = sc.nextInt();
            switch (opcion){
                case 1: {
                    info = GenerarPizza();
                    PizzaDelgada delgada = new PizzaDelgada(info.getTamano(), info.getIngredientes());
                    delgada.aplicarIngredientes();
                    delgada.crearAmasador();
                    delgada.crearMoldeador();
                    delgada.crearHorneador();
                    break;
                }case 2: {
                    info = GenerarPizza();
                    PizzaGruesa gruesa = new PizzaGruesa(info.getTamano(), info.getIngredientes());
                    gruesa.aplicarIngredientes();
                    gruesa.crearAmasador();
                    gruesa.crearMoldeador();
                    gruesa.crearHorneador();
                    break;
                }case 3: {
                    info = GenerarPizza();
                    PizzaIntegral integral = new PizzaIntegral(info.getTamano(), info.getIngredientes());
                    integral.aplicarIngredientes();
                    integral.crearAmasador();
                    integral.crearMoldeador();
                    integral.crearHorneador();
                    break;
                }case 4: {
                    break;
                }
                default: {
                    System.out.println("¡Elegiste un tipo inválido!\n");
                }
            }
        }
    }

    public static Informacion GenerarPizza(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Ingrediente> ingredientes = new ArrayList<>();
        ArrayList<Object> informacion = new ArrayList<>();

        String nombre = "";
        int cantidad = -1;
        String tamano = "";
        while(tamano.equals("")){
            System.out.println("Ingresa el tamaño (pequeña o mediana) de tu nueva pizza: ");
            tamano = sc.nextLine();
            sc.nextLine();
            if(tamano.toUpperCase().equals("PEQUEÑA") ||tamano.toUpperCase().equals("MEDIANA")){
                while(!nombre.toUpperCase().equals("SALIR")){
                    System.out.println("Ingresa el ingrediente que deseas (Escribe 'salir' para salir): ");
                    nombre = sc.nextLine();
                    if(!nombre.toUpperCase().equals("SALIR")){
                        System.out.println(nombre);
                        System.out.println("¿Cuántas unidades quieres de ese ingrediente?: ");
                        cantidad = sc.nextInt();
                        sc.nextLine();
                        if(cantidad > 0){
                            ingredientes.add(new Ingrediente(nombre, cantidad));
                        }else{
                            System.out.println("¡Ingresaste una cantidad inválida!\n");
                        }
                    }
                }
                Informacion info =  new Informacion(tamano.toUpperCase(), ingredientes);
                return info;
            }else{
                System.out.println("¡Ingresaste un tamaño inválido!\n");
            }
        }
        return null;
    }
}
