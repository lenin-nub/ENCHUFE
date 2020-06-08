/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class EJERCICIO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
       float  nota1,nota2,nota3,resultado;
        System.out.println("INGRESE LA NOTA1:");
        nota1= entrada.nextFloat();
        System.out.println("INGRESE LA NOTA2:");
        nota2= entrada.nextFloat();
        System.out.println("INGRESE LA NOTA3:");
        nota3= entrada.nextFloat();

        resultado =nota1+nota2+nota3;
        System.out.println("LA CALIFICACION ES :"+resultado);


    }

}
