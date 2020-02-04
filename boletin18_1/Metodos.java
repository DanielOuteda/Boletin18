/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18_1;

import java.util.Arrays;

/**
 *
 * @author doutedasolla
 */
public class Metodos {

    int[] numero = new int[6];

    public void crearArray() {
        for (int i = 0; i < numero.length; i++) {
            int numAleatorio = (int) (Math.random() * 50 + 1);
            numero[i] = numAleatorio;
        }
        System.out.println(Arrays.toString(numero));
    }

    public void reves() {
        for (int i = 5; i >= 0; i--) {
            int numeroalcontrario = numero[i];
            System.out.println(numeroalcontrario);

        }
    }
}
