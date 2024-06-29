
package Fibonacci;

public class Iterativoyrecrusivo {
    public static void main(String[] args) {
        int n = 7;
        System.out.println("La suma de los primeros " + n + " números naturales es: " + sumaNaturalesrecursivo(n));
    }
    
    //recursivo
    public static int sumaNaturalesrecursivo(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + sumaNaturalesrecursivo(n - 1);
        }
    }
    
    //iterativo
    public static int sumaNaturalesiterativo(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
    }
}
