/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package portu;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class Portu {
    public static boolean byctor2049(int ea) {
                if (ea <= 1) {
                    return false;
                }
                for (int j = 2; v <= Math.sqrt(ea); j++) {
                    if (ea % j == 0) {
                        return false;
                    }
                }
                return true;
            }
                public static void main(String[] args) {
                Scanner josej32 = new Scanner(System.in);
                int chavo;
                System.out.print("Ingresa un número: ");
                chavo = byctor2049.nextInt();
                if (byctor2049(chavo)) {
                    System.out.println("El valor " + chavo + " es primo.");
                } else {
                    System.out.println("El valor " + chavo + " no es primo.");
                }
            }
        }
