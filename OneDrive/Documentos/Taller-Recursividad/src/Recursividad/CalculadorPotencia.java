public class CalculadorPotencia {

    // Método recursivo para calcular a elevado a la b
    public long calcularExponente(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        }
        // Caso recursivo: base * base^(exponente - 1)
        return base * calcularExponente(base, exponente - 1);
    }
}