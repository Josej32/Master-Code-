/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class Act2 {

public static int hamilton(int max, int yuki){
        int checo;
            while (yuki != 0) {
                checo = yuki;
                yuki = max % yuki;
                max = checo;
            }
            return max;
        }
        public static void main(String[] args) {
            int son,kane,sami;
            Scanner jey= new Scanner(System.in);
            System.out.println("Ingrese el primer número ");
            son=jey.nextInt();
            
            System.out.println("Ingrese el segundo número: ");
            kane=jey.nextInt();
            sami=hamilton(son, kane);

            System.out.println("El maximo comun divisior de los numeros "+ son +" y "+ kane +" es: " + sami);
        }
    }
