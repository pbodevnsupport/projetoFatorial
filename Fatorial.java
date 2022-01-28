public class Fatorial {
    // Versao iterativa do cálculo do fatorial
    public int CalcularFatorial(int n) {
        int resultado = 1;
        
        for (int i = 2; i <=n; i++)
            resultado*= i;
        return resultado;
    }
}