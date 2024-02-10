import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Is an anagram? Exercise:");
        
        // To get the worlds we can use the Scanner class
        Scanner scannerObj = new Scanner(System.in);

        String firstWord = scannerObj.nextLine();
        String secondWord = scannerObj.nextLine();

        // Remember to close it
        scannerObj.close();

        System.out.println(anagramCheck(firstWord, secondWord));
    }

    public static boolean anagramCheck(String firstWord, String secondWord) {

        char[] arrayFWord = firstWord.toCharArray();
        char[] arraySWord = secondWord.toCharArray();

        // If I don't sort the arrays equals will not work
        Arrays.sort(arrayFWord);
        Arrays.sort(arraySWord);

        firstWord = Arrays.toString(arrayFWord);
        secondWord = Arrays.toString(arraySWord);

        if (firstWord.equals(secondWord)) {
            return true;
        } else {
            return false;
        }
    }
}