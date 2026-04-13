import java.util.Scanner;

public class GestorInversion {
    private int valorOriginal;
    private ProcesadorNumerico procesador;
    private Scanner lector;

    public GestorInversion() {
        this.procesador = new ProcesadorNumerico();
        this.lector = new Scanner(System.in);
    }

    public void capturarNumero() {
        System.out.print("Ingrese el numero entero que desea invertir: ");
        this.valorOriginal = lector.nextInt();
    }

    public void realizarProceso() {
        int resultado = procesador.invertir(this.valorOriginal, 0);
        System.out.println("El numero invertido es: " + resultado);
    }
}