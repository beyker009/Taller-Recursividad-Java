import java.util.Scanner;

public class GestorMultiplicacion {
    private int numero1;
    private int numero2;
    private CalculadorSumas calculador;
    private Scanner teclado;

    public GestorMultiplicacion() {
        this.calculador = new CalculadorSumas();
        this.teclado = new Scanner(System.in);
    }

    public void capturarFactores() {
        System.out.print("Ingrese el primer factor: ");
        this.numero1 = teclado.nextInt();
        System.out.print("Ingrese el segundo factor (veces a sumar): ");
        this.numero2 = teclado.nextInt();
    }

    public void mostrarResultado() {
        // Validamos que el segundo número sea positivo para que la recursión termine
        if (this.numero2 < 0) {
            System.out.println("Error: Ingrese un segundo factor positivo.");
        } else {
            int resultado = calculador.multiplicarRecursivo(this.numero1, this.numero2);
            System.out.println("Resultado de la multiplicacion: " + resultado);
        }
    }
}