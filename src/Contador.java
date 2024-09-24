public class Contador {
    public static void contador(double n1, double n2) throws ParametrosInvalidosException {
    if (n2 < n1){
        throw new ParametrosInvalidosException();
    }
    else {
        for(double i = n1; i <= n2; i++){
            System.out.println("Imprimindo valor: " + i);
            }
        }
    };
}
