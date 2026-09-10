package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        int[][] matrizUno = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        for (int i = 0; i < matrizUno.length; i++) {
            for (int j = 0; j < matrizUno[i].length; j++) {
                System.out.print(matrizUno[i][j] + "\n");
            }
        }
        int suma = 0;
        for (int i = 0; i < matrizUno.length; i++) {
            for (int j = 0; j < matrizUno[i].length; j++) {
                suma= suma + matrizUno[i][j];
            }
        }
        System.out.print(suma+"\n");
        int sumaDiagonalPrincipal = 0;
        int sumaDiagonalSecundaria = 0;
        int n = matrizUno.length;
        for (int i = 0; i < matrizUno.length; i++) {
            sumaDiagonalPrincipal += matrizUno[i][i];
            sumaDiagonalSecundaria += matrizUno[i][n - 1 - i];
    }
        System.out.println("Suma diagonal principal: " + sumaDiagonalPrincipal);
        System.out.println("Suma diagonal secundaria: " + sumaDiagonalSecundaria);
//Codigo de claude pendiente para revisar
        int d = 3; // tamaño de la matriz (n x n)
        int[][] matriz = new int[n][n];

        int filaInicio = 0, filaFin = n - 1;
        int colInicio = 0, colFin = n - 1;
        int numero = 1;

        while (filaInicio <= filaFin && colInicio <= colFin) {

            // 1. Recorrer de izquierda a derecha (fila superior)
            for (int j = colInicio; j <= colFin; j++) {
                matriz[filaInicio][j] = numero++;
            }
            filaInicio++;

            // 2. Recorrer de arriba a abajo (columna derecha)
            for (int i = filaInicio; i <= filaFin; i++) {
                matriz[i][colFin] = numero++;
            }
            colFin--;

            // 3. Recorrer de derecha a izquierda (fila inferior)
            if (filaInicio <= filaFin) {
                for (int j = colFin; j >= colInicio; j--) {
                    matriz[filaFin][j] = numero++;
                }
                filaFin--;
            }

            // 4. Recorrer de abajo a arriba (columna izquierda)
            if (colInicio <= colFin) {
                for (int i = filaFin; i >= filaInicio; i--) {
                    matriz[i][colInicio] = numero++;
                }
                colInicio++;
            }
        }

        // Imprimir la matriz resultante
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }
    }
}

