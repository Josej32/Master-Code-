/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.raiz_cuadrada;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class Raiz_Cuadrada {

    public static void main(String[] args) {
        Scanner Verstappen = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        double Hamilton = Verstappen.nextDouble();

        double raiz = Math.sqrt(Hamilton);

        System.out.println("La raíz cuadrada de " + Hamilton + " es: " + raiz);
    }
}