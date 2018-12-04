
package basicoskonstantin;

public class BasicosKonstantin {

/**
     * Método para mostrar ejemplos de tipos lógicos
     */
    public static void logicos() {

        //Variables para hacer comparaciones
        int a, b, c, d, e, f, g, h;

        //Asignación de valores para las comparaciones
        a = 1;
        b = 2;
        c = 3;
        e = 4;
        f = 5;
        g = 6;
        h = 2;

        //Mostrar por pantalla el resultado de las comparaciones.
        System.out.println("Probado expresiones lógicas:");
        
        System.out.println("Si a es mayor que b, imprimira \"verdad\", de lo contrario \"falso\" : ");
        if (a > b){
            System.out.println("VERDAD");
        }
        else {
            System.out.println("FALSO");
        }
        
        System.out.println("Si b es igual a h, imprimira \"verdad\", de lo contrario \"falso\" : ");
        if (b == h){
            System.out.println("VERDAD");
        }
        else {
            System.out.println("FALSO");
        }
        
        System.out.println("Si e es distinto a f, imprimira \"verdad\", de lo contrario \"falso\" : ");
        if (e != f){
            System.out.println("VERDAD");
        }
        else {
            System.out.println("FALSO");
        }
        
        System.out.println("Si g es menor que c , imprimira \"verdad\", de lo contrario \"falso\" : ");
        if (g < c){
            System.out.println("VERDAD");
        }
        else {
            System.out.println("FALSO");
        }
    }
    public static void main(String[] args) {
        logicos();  // Llamada al método
    }
    
}
