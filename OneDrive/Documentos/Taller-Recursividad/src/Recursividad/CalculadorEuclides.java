public class CalculadorEuclides {

    // Método recursivo para encontrar el M.C.D. (Algoritmo de Euclides)
    public int obtenerMCD(int m, int n) {
        if (n == 0) {
            return m;
        }
        return obtenerMCD(n, m % n);
    }
}