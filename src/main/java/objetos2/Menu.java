/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author fer
 */
public class Menu {

    public static void main(String[] args) {

        int opcion = 0;
        boolean repetir = false;

        Scanner teclado = new Scanner(System.in);

        do {

            do {

                try {

                    System.out.println("""
                           Selecciona una de estas opciones por favor:
                           1.
                           2.
                           3.
                           4.
                           5.
                           """);

                    opcion = teclado.nextInt();
                    

                } catch (InputMismatchException ime) {

                    System.out.println("Introduce una de las opciones del menu por favor");

                }
                

            } while (false);

            switch (opcion) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;

                default:

            }

        } while (opcion != 0);

    }

}
