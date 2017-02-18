/*Maythe Portales Barrios IIS
A01411461 Actividad 6, problema 2
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.mportalesb.a06.p2;

import java.util.Scanner;

/**
 *
 * @author may37
 */
public class SPP2MPortalesBA06P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dato, i, fact = 1;
        boolean flag;
        System.out.println("Calculadora de numeros factoriales");
        do {
            dato = solicitarDatos();
            if ((dato <= 10) & (dato >= 1)) {
                for (i = 1; i <= dato; i++) {
                    fact = (fact * i);
                }
                System.out.println("El numero factorial es " + fact);
                flag = false;
            } else {
                System.out.println("NO ESTA DENTRO DEL RANGO 1 A 10");
                flag = true;
            }
        } while (flag);
    }

    static int solicitarDatos() {
        Scanner teclado = new Scanner(System.in);
        int num = 0;
        boolean flag;
        do {
            try {
                System.out.println("Introduce un numero");
                num = teclado.nextInt();
                flag = false;
            } catch (Exception ex) {
                System.out.println("NO ES UN NUMERO");
                flag = true;
                teclado.next();
            }
        } while (flag);
        return num;
    }
}
