import java.util.Scanner;

public class GestorAnalisis {
    private int numeroEvaluar;
    private AnalizadorDigitos analizador;
    private Scanner teclado;

    public GestorAnalisis() {
        this.analizador = new AnalizadorDigitos();
        this.teclado = new Scanner(System.in);
    }

    public void capturarNumero() {
        System.out.print("Ingrese el numero para sumar sus digitos: ");
        this.numeroEvaluar = teclado.nextInt();
    }

    public void mostrarResultado() {
        // Convertimos a positivo por si el usuario ingresa un negativo
        int numeroAbs = Math.abs(this.numeroEvaluar);
        int suma = analizador.sumarDigitos(numeroAbs);
        System.out.println("La suma de los digitos es: " + suma);
    }
}