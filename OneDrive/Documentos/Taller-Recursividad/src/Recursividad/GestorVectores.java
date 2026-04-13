import java.util.Scanner;

public class GestorVectores {
    private int[] miArreglo;
    private CalculadorVectores calculador;
    private Scanner teclado;

    public GestorVectores() {
        this.calculador = new CalculadorVectores();
        this.teclado = new Scanner(System.in);
    }

    public void inicializarYLLenar() {
        System.out.print("¿Cuantos elementos tendra el arreglo?: ");
        int n = teclado.nextInt();
        this.miArreglo = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el valor para la posicion [" + i + "]: ");
            this.miArreglo[i] = teclado.nextInt();
        }
    }

    public void mostrarSumaTotal() {
        if (this.miArreglo == null || this.miArreglo.length == 0) {
            System.out.println("El arreglo esta vacio.");
        } else {
            // Empezamos la recursividad desde el indice 0
            int resultado = calculador.sumarArreglo(this.miArreglo, 0);
            System.out.println("La suma de todos los elementos es: " + resultado);
        }
    }
}