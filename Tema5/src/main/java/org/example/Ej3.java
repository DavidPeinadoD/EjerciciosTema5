package org.example;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] notas = new int[10]; //En este caso solo se podran introducir 10 notas ya que damos por hecho que el alumno no va a tener mas de 10 notas para una misma asignatura
        int nota = 0;
        int i = 0;
        int suma = 0;
        int media = 0;
        int contador = 0;
        while (nota != -1) {
            System.out.println("Introduce una nota entre 0 y 10. Para terminar, introduce -1.");
            nota = sc.nextInt();
            if (nota >= 0 && nota <= 10) {
                notas[i] = nota;
                i++;
                contador++;
            } else if (nota != -1) {
                System.out.println("Nota no válida. Introduce una nota entre 0 y 10.");
            }
        }
        for (int j = 0; j < notas.length; j++) {
            suma += notas[j];
        }
        media = suma / contador;
        System.out.println("La nota media es: " + media);
    }
}
