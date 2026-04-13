public class CalculadorVectores {

    // Método recursivo para sumar los elementos de un arreglo
    public int sumarArreglo(int[] vector, int indice) {
        // cuando el índice llega al tamaño del arreglo
        if (indice == vector.length) {
            return 0;
        }
        return vector[indice] + sumarArreglo(vector, indice + 1);
    }
}