import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Solicitar al usuario que ingrese un número
        String input = JOptionPane.showInputDialog("Ingrese un número entero positivo:");

        // Convertir la entrada a un entero
        int entrada = Integer.parseInt(input);

        // Obtener la salida llamando al método fooBar
        String salida = fooBar(entrada);

        // Mostrar el resultado en una ventana de diálogo
        JOptionPane.showMessageDialog(null, "Salida: " + salida);
    }

    public static String fooBar(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FooBar";
        } else if (n % 3 == 0) {
            return "Foo";
        } else if (n % 5 == 0) {
            return "Bar";
        } else {
            return String.valueOf(n);
        }
    }
}
