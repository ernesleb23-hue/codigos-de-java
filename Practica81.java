/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg8.pkg1;

import java.util.Scanner;
public class Practica81 {

    public static void main(String[] args) {
        String nombre;
        String correo;
        String num;
        Scanner leer = new Scanner(System.in);
        System.out.println("como te llamas");
        nombre = leer.nextLine();
        System.out.println("cual es tu correo electronico");
        correo = leer.nextLine();
        System.out.println("cual es tu numero de telefono");
        num = leer.nextLine();
        System.out.println("Hola " + nombre + ", un gusto");
        System.out.println("tu correo es: "+ correo);
        System.out.println("tu numero de telefono es: "+ num);
    }
    
}
