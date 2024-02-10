public class FizzBuzz {
    public static void main(String[] args) throws Exception {
        System.out.println("FizzBuzz Exercise:");

        // Its important to use the equal symbol to take all 100 numbers
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                // Not forget the last else statement because the normal numbers
                System.out.println(i);
            }
        }
    }
}