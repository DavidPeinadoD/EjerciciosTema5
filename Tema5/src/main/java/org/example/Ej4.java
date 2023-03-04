package org.example;

import java.util.Scanner;

public class Ej4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] votos = new int[100];
        int voto = 0;
        int i = 0;
        int contador = 0;
        while (voto != 68753421) {
            System.out.println("Introduce un voto entre 0 y 3.");
            System.out.println("1. Candidato 1" + "\n" + "2. Candidato 2" + "\n" + "3. Candidato 3");
            voto = sc.nextInt();
            if (voto >= 0 && voto <= 3) {
                votos[i] = voto;
                i++;
                contador++;
            } else if (voto != 68753421) {
                System.out.println("Voto no válido. Introduce un voto entre 0 y 3.");
            }

        }

        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;
        for (int j = 0; j < votos.length; j++) {
            if (votos[j] == 1) {
                candidato1++;
            } else if (votos[j] == 2) {
                candidato2++;
            } else if (votos[j] == 3) {
                candidato3++;
            }
        }
        System.out.println("El candidato 1 ha obtenido " + candidato1 + " votos." + "un " + (candidato1 * 100) / contador + "% de los votos");
        System.out.println("El candidato 2 ha obtenido " + candidato2 + " votos." + "un " + (candidato2 * 100) / contador + "% de los votos");
        System.out.println("El candidato 3 ha obtenido " + candidato3 + " votos." + "un " + (candidato3 * 100) / contador + "% de los votos");


    }
}

