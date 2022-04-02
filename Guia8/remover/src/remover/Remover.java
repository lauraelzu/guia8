/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remover;

import java.util.ArrayList;

/**
 *
 * @author TIC-Laura
 */
public class Remover {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> numeros = new ArrayList();
String num = "4";
String num1 = "3";
String num2= "2";
String num3 = "1";
String num4= "0";

numeros.add(num); // Este numero se encuentra en el índice 0
numeros.add(num1); // Este numero se encuentra en el índice 0
numeros.add(num2); // Este numero se encuentra en el índice 0
numeros.add(num3); // Este numero se encuentra en el índice 0
numeros.add(num4); // Este numero se encuentra en el índice 0
System.out.println(numeros.toString());
numeros.remove(0); // Eliminamos el numero que esté en el índice 0
System.out.println(numeros.toString());
    }
    
}
