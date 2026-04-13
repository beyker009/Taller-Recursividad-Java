import java.util.Scanner;

public class GestorSucesion {
    private int limite;
    private CalculadorArmonico calculador;
    private Scanner teclado;

    public GestorSucesion() {
        this.calculador = new CalculadorArmonico();
        this.teclado = new Scanner(System.in);
    }

    public void capturarLimite() {
        System.out.print("Ingrese el limite n para la serie armonica: ");
        this.limite = teclado.nextInt();
    }

    public void mostrarResultado() {
        if (this.limite < 1) {
            System.out.println("Error: El numero debe ser mayor o igual a 1.");
        } else {
            double total = calculador.sumarSerie(this.limite);
            System.out.println("El resultado de la sumatoria es: " + total);
        }
    }
}