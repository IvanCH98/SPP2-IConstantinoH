/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.iconstantinoh.a03.pkg2;

import java.util.Scanner;
 //*
 //* @author alumno
 //*/
public class SPP2IconstantinoHA032 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Redondeo de números");
       
//Paso1.  Declaración de variables
     double nar, nr; //nar= numero a redodear nr=numero redondeado
     Scanner teclado=new Scanner (System.in);
     
     //Paso 2. Pedir datos
        System.out.println("Introduzca el numero a redondear: ");
        nar= teclado.nextDouble(); 
        //Paso 3. Redondear el número
        nr= Math.round (nar); 
        //Paso 4.- Mostrar el resultado
        System.out.println("El número redondeado es: "+nr);
        
               
        
    }
    
}
