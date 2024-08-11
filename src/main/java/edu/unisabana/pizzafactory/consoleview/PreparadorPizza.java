package edu.unisabana.pizzafactory.consoleview;

import edu.unisabana.pizzafactory.model.Ingrediente;
import edu.unisabana.pizzafactory.model.PizzaDelgada;
import edu.unisabana.pizzafactory.model.PizzaGruesa;
import edu.unisabana.pizzafactory.model.PizzaIntegral;

import java.util.ArrayList;
import java.util.Scanner;


public class PreparadorPizza {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        while(true){
            System.out.println("¡Bienvenido! Elige el tipo de masa de tu preferencia:");
            System.out.println("1) Delgada\n2) Gruesa\n3) Integral\n4) Salir");
            opcion = sc.nextInt();
            switch (opcion){
                case 1: {
                    PizzaDelgada delgada = cocinarDelgada();
                    break;
                }case 2: {
                    PizzaGruesa gruesa = cocinarGruesa();
                    break;
                }case 3: {
                    PizzaIntegral integral = cocinarIntegral();
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

    public static PizzaDelgada cocinarDelgada(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Ingrediente> ingredientes = new ArrayList<>();
        String nombre = "";
        int cantidad = -1;
        float tamano = -1;
        while(tamano < 0){
            System.out.println("Ingresa el tamaño (Centímetros) de tu nueva pizza DELGADA: ");
            tamano = sc.nextFloat();
            sc.nextLine();
            if(tamano > 0){
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
                PizzaDelgada delgada = new PizzaDelgada(tamano, ingredientes);
                return delgada;
            }else{
                System.out.println("¡Ingresaste un tamaño inválido!\n");
            }
        }
        return null;
    }

    public static PizzaGruesa cocinarGruesa(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Ingrediente> ingredientes = new ArrayList<>();
        String nombre = "";
        int cantidad = -1;
        float tamano = -1;
        while(tamano < 0){
            System.out.println("Ingresa el tamaño (Centímetros) de tu nueva pizza GRUESA: ");
            tamano = sc.nextFloat();
            sc.nextLine();
            if(tamano > 0){
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
                PizzaGruesa gruesa = new PizzaGruesa(tamano, ingredientes);
                return gruesa;
            }else{
                System.out.println("¡Ingresaste un tamaño inválido!\n");
            }
        }
        return null;
    }

    public static PizzaIntegral cocinarIntegral(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Ingrediente> ingredientes = new ArrayList<>();
        String nombre = "";
        int cantidad = -1;
        float tamano = -1;
        while(tamano < 0){
            System.out.println("Ingresa el tamaño (Centímetros) de tu nueva pizza INTEGRAL: ");
            tamano = sc.nextFloat();
            sc.nextLine();
            if(tamano > 0){
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
                PizzaIntegral integral = new PizzaIntegral(tamano, ingredientes);
                return integral;
            }else{
                System.out.println("¡Ingresaste un tamaño inválido!\n");
            }
        }
        return null;
    }
}
