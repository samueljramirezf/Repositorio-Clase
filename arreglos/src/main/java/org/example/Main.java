package org.example;
public class Main {
    static void main() {
        int[] nuevo = {1, 2, 3, 4, 5};
    boolean variable= identificarArreglo(nuevo);
    System.out.println(variable);
    }

    public static boolean identificarArreglo(int[]nuevo) {
        boolean mensaje= false;
        int numerodado = 9;
        for (int j = 0; j < nuevo.length; j++) {
            if (numerodado==nuevo[j]) {
                mensaje= true;
            }
                }
       return mensaje;
    }
}
