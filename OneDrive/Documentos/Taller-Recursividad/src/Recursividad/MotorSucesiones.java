public class MotorSucesiones {

    // Método recursivo puro para hallar el valor en una posición dada
    public int obtenerTermino(int posicion) {
        if (posicion == 0) {
            return 0;
        }
        if (posicion == 1) {
            return 1;
        }
        // Aplicamos la fórmula del taller
        return obtenerTermino(posicion - 1) + obtenerTermino(posicion - 2);
    }
}