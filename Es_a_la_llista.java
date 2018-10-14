package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        Random aleatori = new Random();
        int numero = teclat.nextInt();
        int[] nombres = new int[700000];
        for (int i = 0; i <nombres.length ; i++) {
            int nombre = aleatori.nextInt(500);
            nombres[i]=nombre;
        }
        boolean hi_es=false;
        int contador=0;
        while (contador<nombres.length) {
	    if (nombres[contador]%2==0) {
	            if (nombres[contador]==numero) {
        	        hi_es=true;
	                contador=nombres.length;
		    }
            } else {
                hi_es=false;
            }
            contador++;
        }
        if (hi_es==true) {
            System.out.println("El número hi es.");
        } else {
            System.out.println("El número no es dins la llista");
        }
    }
}
