/*programa que imprime una frase, una palabra, y valores de numeros reales y enteros 
fecha: 18/sep/2026
Alumno: ERNESTO KALEB GASPAR LOPEZ
 */
package practica234;

public class Practica234 {

    public static void main(String[] args) {
        int x;
        double q;
        double y;
        String mipalabra = "hamburguesa";
        String mifrase = "¿donde esta mi hamnburguesa?";
        
        x = 65;
        System.out.println("el valor actual de variables es: " + x);
        x = 25;
        System.out.println("y ahora es: " + x);
        
        q = 20.9;
        y = 79.5;
        System.out.println("q vale: " + q);
        System.out.println("y vale: "+ y);
        
        System.out.println("una palabra que uso con frecuencia: " + mipalabra);
        System.out.println("una frase que uso aveves: "+ mifrase);
    }
    
}
