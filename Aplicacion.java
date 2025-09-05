import clases.Algoritmos;
public class Aplicacion {
    public static void main(String[] args) {
        System.out.println("--- Prueba de esPar ---");
        System.out.println("¿Es 4 un número par? " + Algoritmos.esPar(4));
        System.out.println("¿Es 7 un número par? " + Algoritmos.esPar(7));
        System.out.println(" ");

        System.out.println("--- Prueba de esPrimo ---");
        System.out.println("¿Es 7 un número primo? " + Algoritmos.esPrimo(7));
        System.out.println("¿Es 10 un número primo? " + Algoritmos.esPrimo(10));
        System.out.println(" ");

        System.out.println("--- Prueba de stringEnReversa ---");
        System.out.println("Reversa de 'hola': " + Algoritmos.stringEnReversa("hola"));
        System.out.println(" ");

        System.out.println("--- Prueba de esPalindromo ---");
        System.out.println("¿Es 'reconocer' un palíndromo? " + Algoritmos.esPalindromo("reconocer"));
        System.out.println("¿Es 'programar' un palíndromo? " + Algoritmos.esPalindromo("programar"));
        System.out.println(" ");

        System.out.println("--- Prueba de secuenciaFizzBuzz ---");
        Algoritmos.secuenciaFizzBuzz(15);
    }
}