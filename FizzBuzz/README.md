## Descripción

Escribe un programa que muestre por consola (con un print) los números de 1 a 100 (ambos incluidos y con un salto de línea entre cada impresión), sustituyendo los siguientes:
- Múltiplos de 3 por la palabra "fizz".
- Múltiplos de 5 por la palabra "buzz".
- Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".

## Solución propuesta

```java
public class App {
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
```
## Reflexión

En un principio puede parecer un problema muy sencillo, y lo és, pero la clave está en darse cuenta de las prioridades de los filtros. En el caso de que hubieramos empezado a aplicar los "ifs" empezando con los números planos 3 y 5, habría resultado en una solución incorrecta ya que el caso más restrictivo debe tratarse primero. Ese caso resulta ser la combinación de 3 y 5.
