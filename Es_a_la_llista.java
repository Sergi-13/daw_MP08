package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        Random aleatori = new Random();
        int numero = teclat.nextInt();
        int[] nombres = new int[500000];
        for (int i = 0; i <nombres.length ; i++) {
            int nombre = aleatori.nextInt(500);
            nombres[i]=nombre;
        }
        boolean hi_es=false;
        int contador=0;
        long stime = System.nanoTime();
        while (contador<nombres.length) {
            if (nombres[contador]==numero) {
                hi_es=true;
                contador=nombres.length;
            } else {
                hi_es=false;
            }
            contador++;
        }
        long etime = System.nanoTime() -stime;
        if (hi_es==true) {
            System.out.println("El número hi es. Ha tardat "+etime+" nanosegons en trobar-lo.");
        } else {
            System.out.println("El número no es dins la llista");
        }
    }
}
