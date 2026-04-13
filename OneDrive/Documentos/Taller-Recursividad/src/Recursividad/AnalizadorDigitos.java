public class AnalizadorDigitos {

    // Método recursivo para sumar los dígitos de un número
    public int sumarDigitos(int n) {
        if (n < 10) {
            return n;
        }
        // Caso recursivo: tomamos el último dígito (n % 10) 
        return (n % 10) + sumarDigitos(n / 10);
    }
}