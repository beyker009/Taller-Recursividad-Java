

import java.util.Scanner;

public class Ejercicio {
    private int numero;
    private Calculadora calc;
    private Scanner entrada;

    public Ejercicio() {
        this.calc = new Calculadora();
        this.entrada = new Scanner(System.in);
    }

    public void solicitarDatos() {
        System.out.print("Ingrese un numero para calcular el factorial: ");
        this.numero = entrada.nextInt();
    }

    public void ejecutar() {
        if (this.numero < 0) {
            System.out.println("Error: No existe factorial de numeros negativos.");
        } else {
            long resultado = calc.factorial(this.numero);
            System.out.println("El factorial es: " + resultado);
        }
    }
}