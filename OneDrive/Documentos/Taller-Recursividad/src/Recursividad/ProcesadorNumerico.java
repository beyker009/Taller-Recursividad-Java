public class ProcesadorNumerico {

    // Método recursivo para invertir el número matemáticamente
    public int invertir(int n, int acumulado) {
        if (n == 0) {
            return acumulado;
        }
        // reducimos n y aumentamos el acumulado
        return invertir(n / 10, acumulado * 10 + (n % 10));
    }
}