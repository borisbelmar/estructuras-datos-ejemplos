package PilaEjemplo;

public class MainEjemplo {

    public static void printStatus(Pila pila) {
        if (pila.isEmpty()) {
            System.out.println("L=0 No hay nada en la pila");
        } else {
            System.out.println("L=" + pila.length() + " " + pila.get().getUrl());
        }
    }

    public static void main(String[] args) {
        int id = 0;

        Pila pila = new Pila();

        URL google = new URL(id++, "https://google.cl/");
        URL yahoo = new URL(id++, "https://yahoo.es/");
        URL msn = new URL(id++, "https://msn.com/");

        System.out.println("===== Apilando ====");
        printStatus(pila);
        pila.push(google);
        printStatus(pila);
        pila.push(yahoo);
        printStatus(pila);
        pila.push(msn);
        printStatus(pila);

        System.out.println("===== Desapilando ====");
        printStatus(pila);
        pila.pop();
        printStatus(pila);
        pila.pop();
        printStatus(pila);
        pila.pop();
        printStatus(pila);
    }
}
