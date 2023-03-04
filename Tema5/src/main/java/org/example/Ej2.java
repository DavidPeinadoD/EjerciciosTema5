package org.example;
import java.util.Scanner;
public class Ej2 {

    public static void main(String[] args) {
            int[] contadorDigitos = new int[10]; // creamos un array para contar los dígitos

            Scanner sc = new Scanner(System.in);

            System.out.println("Introduce una serie de números entre 0 y 9. Para terminar, introduce -1.");

            int numero = sc.nextInt();

            while(numero != -1) { // mientras el número introducido no sea -1


                if(numero >= 0 && numero <= 9) { // si el número introducido es un dígito válido
                    contadorDigitos[numero]++; // incrementamos el contador para ese dígito
                    System.out.println("Introduce una serie de números entre 0 y 9. Para terminar, introduce -1.");
                } else { // si el número introducido no es un dígito válido
                    System.out.println("Número no válido. Introduce un número entre 0 y 9.");
                }

                numero = sc.nextInt(); // le pedimos otro número al usuario
            }

            System.out.println("Resumen de la serie introducida:");
            for(int i=0; i<10; i++) { // mostramos el contador para cada dígito
                System.out.println(i + ": " + contadorDigitos[i] + " veces");
            }
        }
    }
