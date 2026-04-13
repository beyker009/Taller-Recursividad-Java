import java.util.Scanner;

public class GestorCadenas {
    private String textoOriginal;
    private CopiadorCadenas motor;
    private Scanner teclado;

    public GestorCadenas() {
        this.motor = new CopiadorCadenas();
        this.teclado = new Scanner(System.in);
    }

    public void capturarTexto() {
        System.out.print("Ingrese una palabra o frase para copiar: ");
        this.textoOriginal = teclado.nextLine();
    }

    public void ejecutarCopia() {
        // Empezamos desde el índice 0
        String copia = motor.duplicar(this.textoOriginal, 0);
        System.out.println("Texto original: " + this.textoOriginal);
        System.out.println("Texto copiado: " + copia);
        System.out.println("¿Son iguales?: " + (this.textoOriginal.equals(copia) ? "Si" : "No"));
    }
}