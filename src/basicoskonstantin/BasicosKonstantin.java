package basicoskonstantin;

public class BasicosKonstantin {

    //Método para mostrar ejemplo de tipo String.
    public static void cadenas() {

        //Variable de tipo string
        String v;

        //Asignamos valor a la variable
        v = "Esto es el contenido de la variable tipo String";

        //Mostrar en pantalla el contendido de la variable.
        System.out.println(v);
    }

    // Método para mostrar ejemplos de tipos lógicos
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
        if (a > b) {
            System.out.println("VERDAD");
        } else {
            System.out.println("FALSO");
        }

        System.out.println("Si b es igual a h, imprimira \"verdad\", de lo contrario \"falso\" : ");
        if (b == h) {
            System.out.println("VERDAD");
        } else {
            System.out.println("FALSO");
        }

        System.out.println("Si e es distinto a f, imprimira \"verdad\", de lo contrario \"falso\" : ");
        if (e != f) {
            System.out.println("VERDAD");
        } else {
            System.out.println("FALSO");
        }

        System.out.println("Si g es menor que c , imprimira \"verdad\", de lo contrario \"falso\" : ");
        if (g < c) {
            System.out.println("VERDAD");
        } else {
            System.out.println("FALSO");
        }
    }

    // Método para mostrar ejemplos de tipos numericos.
    public static void numericos() {

        //Estos son los tipos básicos
        byte elMasPeque;
        short chiquitin;
        int entero;
        long duplicaEntero;
        float grande;
        double doble;

        //Ejemplos de asignación de valores a las variables de tipos básicos
        entero = 10;
        doble = 5.6;

        //Mostrar en pantalla el contendido de las variables de tipos básicos.
        System.err.println("Valor entero");
        System.out.println(entero);
        System.out.println("Valor doble");
        System.out.println(doble);
    }

    public static void main(String[] args) {

        numericos();  // Llamada al método
        System.out.println(); 
        cadenas();  // Llamada al método
        System.out.println("\n");
        logicos();  // Llamada al método
        System.out.println("\n");
         
    }

}
