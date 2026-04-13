public class CalculadorDivision {

    public int calcularCociente(int dividendo, int divisor) {
        if (dividendo < divisor) {
            return 0;
        }
        // Caso recursivo: 1 + el resultado de seguir restando el divisor
        return 1 + calcularCociente(dividendo - divisor, divisor);
    }
}