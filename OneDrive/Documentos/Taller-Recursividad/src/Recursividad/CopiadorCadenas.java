public class CopiadorCadenas {

    // Método recursivo para copiar cadena
    public String duplicar(String original, int indice) {
        // cuando llegamos al final de la cadena
        if (indice == original.length()) {
            return "";
        }
        return original.charAt(indice) + duplicar(original, indice + 1);
    }
}