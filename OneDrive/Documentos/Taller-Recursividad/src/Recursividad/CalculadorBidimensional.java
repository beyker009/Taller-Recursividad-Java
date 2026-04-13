public class CalculadorBidimensional {

    // Método recursivo para sumar elementos de una matriz
    public int sumarRecursivo(int[][] m, int f, int c) {
        // Si ya recorrimos todas las filas
        if (f == m.length) {
            return 0;
        }
        // Si llegamos al final de la columna, saltamos a la siguiente fila
        if (c == m[f].length) {
            return sumarRecursivo(m, f + 1, 0);
        }
        return m[f][c] + sumarRecursivo(m, f, c + 1);
    }
}