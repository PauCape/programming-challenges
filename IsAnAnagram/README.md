## Descripción

Escribe una función que reciba dos palabras (String) y retorne verdadero o falso (Bool) según sean o no anagramas.
- Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
- NO hace falta comprobar que ambas palabras existan.
- Dos palabras exactamente iguales no son anagrama.

## Solución propuesta 

```java
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

        // Check if the words are the same
        if (firstWord.equals(secondWord)) {
            System.out.println("These words are the same.");
        } else {
            System.out.println(anagramCheck(firstWord, secondWord));
        }
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
```
## Reflexión

Es problable que mi solución tenga demasiado pasos, pero creo que est bastante elegante y clara. Con este ejercicio es interesante entender el comporamiento de las palabras mediante los "String" y lo que es más interesante, la transformación de "String" a un "Array" de tipo char, utilizando el método correcto "Arrays.toString" y no "toString" direcamente.