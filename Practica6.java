
package practica6;

public class Practica6 {

    public static void main(String[] args) {
        int a;
        int x = 10;
        int y = 30;
        int c = 50;
        int b = 40;
        a = 50;
        
        System.out.println(a + " " + (a + 20) + " " + (a - 20));
        System.out.println((a * 20) + " " + (a / 20) + " " + (a % 20));
        
        
        int sum = x+y;
        System.out.println("la suma de las variables es: " + sum);
        int mul = x*y;
        System.out.println("la multiplicacion de la variables es: " + mul);
        
        
        double division;
        division = (double)c / (double)b;
        System.out.println("el resultado de la division es: " + division);
        System.out.println("==========================================================");
        
    }
    
}
