
package practica10;
public class Practica10 {

    public static void main(String[] args) {
        String nombre;
        String correo;
        String num;
        System.out.println("como te llamas");
        nombre = System.console().readLine();
        System.out.println("cual es tu correo electronico");
        correo = System.console().readLine();
        System.out.println("cual es tu numero de telefono");
        num = System.console().readLine();
        System.out.println("Hola " + nombre + ", un gusto");
        System.out.println("tu correo es: "+ correo);
        System.out.println("tu numero de telefono es: "+ num);


    }
    
}
