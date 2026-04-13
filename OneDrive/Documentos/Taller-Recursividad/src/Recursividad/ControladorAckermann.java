import java.util.Scanner;

public class ControladorAckermann {
    private int valM;
    private int valN;
    private AlgoritmoAckermann motor;
    private Scanner teclado;

    public ControladorAckermann() {
        this.motor = new AlgoritmoAckermann();
        this.teclado = new Scanner(System.in);
    }

    public void solicitarParametros() {
        System.out.println("Funcion de Ackermann");
        System.out.print("Ingrese valor para m: ");
        this.valM = teclado.nextInt();
        System.out.print("Ingrese valor para n: ");
        this.valN = teclado.nextInt();
    }

    public void ejecutarYMostrar() {
        System.out.println("Calculando...");
        try {
            int resultado = motor.calcular(this.valM, this.valN);
            System.out.println("El resultado de Ackerman(" + valM + ", " + valN + ") es: " + resultado);
        } catch (StackOverflowError e) {
            System.out.println("Error: La recursion es demasiado profunda para estos valores.");
        }
    }
}