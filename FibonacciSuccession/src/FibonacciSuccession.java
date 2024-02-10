public class FibonacciSuccession {
    public static void main(String[] args) throws Exception {
        System.out.println("Fibonacci succession Exercise: \n");

        // Initializad like the first iteration
        long auxInitial = 1;
        long auxSecond = 1;
        long auxResult = 1;

        // This is not required but like this the result is better
        System.out.print(0);

        for (int i = 1; i <= 50; i++) {

                System.out.print(", " + auxInitial);

                auxResult = auxInitial + auxSecond;
    
                auxInitial = auxSecond;
                
                auxSecond = auxResult;
        }
    }
}
