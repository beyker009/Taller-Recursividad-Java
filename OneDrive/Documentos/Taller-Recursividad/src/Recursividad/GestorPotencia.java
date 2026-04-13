import java.util.Scanner;

public class GestorPotencia {
    private int base;
    private int exponente;
    private CalculadorPotencia calculador;
    private Scanner teclado;

    public GestorPotencia() {
        this.calculador = new CalculadorPotencia();
        this.teclado = new Scanner(System.in);
    }

    public void capturarDatos() {
        System.out.print("Ingrese la base (numero entero): ");
        this.base = teclado.nextInt();
        System.out.print("Ingrese el exponente (entero positivo): ");
        this.exponente = teclado.nextInt();
    }

    public void mostrarResultado() {
        if (this.exponente < 0) {
            System.out.println("Error: Este programa solo maneja exponentes positivos.");
        } else {
            long resultado = calculador.calcularExponente(this.base, this.exponente);
            System.out.println("El resultado de " + base + "^" + exponente + " es: " + resultado);
        }
    }
}