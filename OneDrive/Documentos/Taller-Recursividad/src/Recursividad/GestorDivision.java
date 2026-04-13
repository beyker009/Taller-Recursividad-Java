import java.util.Scanner;

public class GestorDivision {
    private int num1;
    private int num2;
    private CalculadorDivision calculador;
    private Scanner teclado;

    public GestorDivision() {
        this.calculador = new CalculadorDivision();
        this.teclado = new Scanner(System.in);
    }

    public void capturarDatos() {
        System.out.print("Ingrese el dividendo (numero a dividir): ");
        this.num1 = teclado.nextInt();
        System.out.print("Ingrese el divisor (entre cuanto): ");
        this.num2 = teclado.nextInt();
    }

    public void mostrarResultado() {
        if (this.num2 <= 0) {
            System.out.println("Error: El divisor debe ser mayor a 0.");
        } else {
            int resultado = calculador.calcularCociente(this.num1, this.num2);
            System.out.println("El cociente de la division entera es: " + resultado);
        }
    }
}