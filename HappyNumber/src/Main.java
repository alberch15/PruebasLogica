import javax.swing.*;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Solicitar al usuario que ingrese un número
        String input = JOptionPane.showInputDialog("Ingrese un número entero positivo:");

        // Convertir la entrada a un entero
        int number = Integer.parseInt(input);

        // Verificar si el número es feliz
        boolean isHappy = isHappyNumber(number);

        // Mostrar el resultado en una ventana de diálogo
        String message = "El número " + number + " es " + (isHappy ? "feliz" : "no feliz");
        JOptionPane.showMessageDialog(null, message);
    }

    public static boolean isHappyNumber(int n) {
        Set<Integer> vistos = new HashSet<>();

        while (n != 1 && !vistos.contains(n)) {
            vistos.add(n);
            n = obtenerSiguienteNumero(n);
        }

        return n == 1;
    }

    private static int obtenerSiguienteNumero(int num) {
        int sumSquare = 0;

        while (num > 0) {
            int digito = num % 10;
            sumSquare += digito * digito;
            num /= 10;
        }

        return sumSquare;
    }
}

