import java.util.Scanner;

public class GestorMaximoComun {
    private int numeroM;
    private int numeroN;
    private CalculadorEuclides calculador;
    private Scanner teclado;

    public GestorMaximoComun() {
        this.calculador = new CalculadorEuclides();
        this.teclado = new Scanner(System.in);
    }

    public void capturarDatos() {
        System.out.print("Ingrese el primer numero (M): ");
        this.numeroM = teclado.nextInt();
        System.out.print("Ingrese el segundo numero (N): ");
        this.numeroN = teclado.nextInt();
    }

    public void mostrarResultado() {
        // El algoritmo requiere que el mayor sea M por orden, 
        int resultado = calculador.obtenerMCD(this.numeroM, this.numeroN);
        System.out.println("El M.C.D. entre " + numeroM + " y " + numeroN + " es: " + resultado);
    }
}