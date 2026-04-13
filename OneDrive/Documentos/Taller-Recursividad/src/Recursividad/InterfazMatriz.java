import java.util.Scanner;

public class InterfazMatriz {
    private int[][] datos;
    private CalculadorBidimensional motor;
    private Scanner sc;

    public InterfazMatriz() {
        this.motor = new CalculadorBidimensional();
        this.sc = new Scanner(System.in);
    }

    public void configurarYLLenar() {
        System.out.print("Filas de la matriz: ");
        int filas = sc.nextInt();
        System.out.print("Columnas de la matriz: ");
        int cols = sc.nextInt();
        
        this.datos = new int[filas][cols];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Valor en [" + i + "][" + j + "]: ");
                this.datos[i][j] = sc.nextInt();
            }
        }
    }

    public void ejecutarCalculo() {
        if (datos != null) {
            int total = motor.sumarRecursivo(this.datos, 0, 0);
            System.out.println("Resultado final de la suma: " + total);
        }
    }
}