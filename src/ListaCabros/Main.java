package ListaCabros;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Lista lista = new Lista();

        String in;
        char caracter;
        boolean continuar = true;

        while(continuar) {
            System.out.println("Ingresa un caracter: ");
            in = read.nextLine();
            if (in.isEmpty()) {
                continuar = false;
                break;
            }
            caracter = in.charAt(0);
            lista.agregar(caracter);
        }
        lista.imprimir();
        lista.eliminar('b');
        lista.imprimir();
    }
}
