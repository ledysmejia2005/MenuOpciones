package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Programa para crear un ciclo
        // y crear un menu de opciones
        Integer opcionSeleccionada=0;
        while(opcionSeleccionada != 5){
            System.out.println("Menu de opciones");
            System.out.println("****************+*");
            System.out.println("➕Digita uno para sumar");
            System.out.println("➖Digita 2 para restar");
            System.out.println("✖ Digita 3 para multiplicar");
            System.out.println("➗Digita 4 para dividir");
            System.out.println("🏃‍♀️Digita 5 para SALIR DEL PROGRAMA");
            Scanner leerTeclado= new Scanner(System.in);
            System.out.println("Selecciona una opción por favor:😊");
            opcionSeleccionada=leerTeclado.nextInt();

            //Evaluando caminos segun la opción del usuario:
            if (opcionSeleccionada==1) {
                System.out.println("SUMANDO...");
            }else if(opcionSeleccionada==2) {
                System.out.println("RESTANDO...");
            }else if(opcionSeleccionada==3) {
                System.out.println("MULTIPLICANDO...");
            } else if (opcionSeleccionada==4) {
                System.out.println("DIVIDIENDO...");
            } else if (opcionSeleccionada==5) {
                System.out.println("SALIENDO...");
            }else{
                System.out.println("OPCION INVALIDA...");

            }

        }
        }
        }
    }

}