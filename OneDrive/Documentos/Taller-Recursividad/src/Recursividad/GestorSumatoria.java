import java.util.Scanner;

public class GestorSumatoria {
    private int limite;
    private CalculadorAritmetico calculador;
    private Scanner teclado;

    public GestorSumatoria() {
        this.calculador = new CalculadorAritmetico();
        this.teclado = new Scanner(System.in);
    }

    public void capturarLimite() {
        System.out.print("Ingrese el numero limite para la sumatoria: ");
        this.limite = teclado.nextInt();
    }

    public void mostrarResultado() {
        if (this.limite < 1) {
            System.out.println("Error: El numero debe ser mayor o igual a 1.");
        } else {
            int resultado = calculador.sumatoriaLineal(this.limite);
            System.out.println("La sumatoria total es: " + resultado);
        }
    }
}