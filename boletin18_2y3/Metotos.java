/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18_2y3;

import java.util.Scanner;

/**
 *
 * @author doutedasolla
 */
public class Metotos {
    Scanner sc = new Scanner(System.in);
    int notas[] = {6, 3, 5, 9};
    String[] nome = {"A","B","C","D"};
    int numero = 0;
    int aprobados=0;
    int suspensos=0;
    int Alta=0;
    
    
    
    public void notas() {
        for (int i = 0; i < notas.length; i++) {
            numero = numero + notas[i];
            if (notas[i] >= 5) {
                aprobados++;
            } else {
                suspensos++;
            }
        }
        if (numero >  ){
            
        }
        System.out.println("Nota media= "+ numero /30);
        System.out.println("Alumnos aprobados " + aprobados);
        System.out.println("Alumnos suspensos " + suspensos);
        System.out.println("Nota mas alta " + Alta);
    }
    
    public void pedirPosicion(){
        System.out.println("Posicion do alumno ");
        int num = sc.nextInt();
        System.out.println(nome [num-1] + "; nota" + notas [num-1]);
    }
   
    public void ordenarNotas() {
        int aux;
        String auxnome;
        for (int i = 0; i < notas.length - 1; i++) {
            for (int j = i + 1; j < notas.length; j++) {
                if (notas[i] > notas[j]) {
                    aux = notas[i];
                    notas[i] = notas[j];
                    notas[j] = aux;
                    auxnome = nome[i];
                    nome[i] = nome[j];
                    nome[j] = auxnome;
                }
            }
        }

    }
}
