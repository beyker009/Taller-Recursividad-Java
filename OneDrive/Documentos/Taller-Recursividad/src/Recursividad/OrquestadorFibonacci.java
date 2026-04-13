import java.util.Scanner;

public class OrquestadorFibonacci {
    private int cantidadTerminos;
    private MotorSucesiones motor;
    private Scanner lector;

    public OrquestadorFibonacci() {
        this.motor = new MotorSucesiones();
        this.lector = new Scanner(System.in);
    }

    public void definirLimite() {
        System.out.print("¿Cuantos terminos de la serie Fibonacci desea ver?: ");
        this.cantidadTerminos = lector.nextInt();
    }

    public void generarReporte() {
        System.out.println("--- Resultado de la Serie ---");
        for (int i = 0; i < this.cantidadTerminos; i++) {
            // Llamamos al motor para cada posición
            System.out.print(motor.obtenerTermino(i) + " ");
        }
        System.out.println("\n--------");
    }
}