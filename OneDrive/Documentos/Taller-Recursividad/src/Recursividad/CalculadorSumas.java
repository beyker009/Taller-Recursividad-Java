public class CalculadorSumas {

    // Método recursivo para multiplicar mediante sumas sucesivas
    public int multiplicarRecursivo(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a + multiplicarRecursivo(a, b - 1);
    }
}