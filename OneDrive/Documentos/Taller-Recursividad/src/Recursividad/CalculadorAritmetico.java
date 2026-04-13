public class CalculadorAritmetico {

    public int sumatoriaLineal(int n) {
        if (n == 1) {
            return 1;
        }
        // Caso recursivo: n + suma de los anteriores
        return n + sumatoriaLineal(n - 1);
    }
}