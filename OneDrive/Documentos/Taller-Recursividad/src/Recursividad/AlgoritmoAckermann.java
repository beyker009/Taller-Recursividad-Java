public class AlgoritmoAckermann {

    public int calcular(int m, int n) {
        
        if (m == 0) {
            return n + 1;
        }
       
        if (m > 0 && n == 0) {
            return calcular(m - 1, 1);
        }
        
        // Ackerman(m - 1, Ackerman(m, n - 1))
        return calcular(m - 1, calcular(m, n - 1));
    }
}