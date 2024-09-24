public class Main {
    public static void main(String[] args) {

        try {
            Contador.contador(10,20);
        } catch (ParametrosInvalidosException e) {
            throw new RuntimeException(e);
        }
    }
}