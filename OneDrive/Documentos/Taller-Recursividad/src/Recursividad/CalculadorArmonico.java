public class CalculadorArmonico {

    // Método recursivo para calcular la suma de la serie
    public double sumarSerie(int n) {
        if (n == 1) {
            return 1.0;
        }
        // Caso recursivo: 1/n + suma de los términos anteriores
        return (1.0 / n) + sumarSerie(n - 1);
    }
}