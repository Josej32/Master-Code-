/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author Admin
 */
 import java.util.Scanner;
public class Mavenproject1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese la base del rectángulo: ");
    double base = scanner.nextDouble();

    System.out.print("Ingrese la altura del rectángulo: ");
    double altura = scanner.nextDouble();

    double area = base * altura;

    System.out.println("El área del rectángulo es: " + area);
  }
    }
  
