package ListaCabros;

public class Lista {
    private class Nodo {
        public char caracter;
        public Nodo siguiente = null;

        public Nodo(char caracter) {
            this.caracter = caracter;
        }
    }

    private Nodo cabeza = null;

    public void agregar(char caracter) {
        Nodo nodo = new Nodo(caracter);
        if(cabeza == null) {
            cabeza = nodo;
        } else {
            Nodo puntero = cabeza;
            while(puntero.siguiente != null) {
                puntero = puntero.siguiente;
            }
            puntero.siguiente = nodo;
        }
    }

    public void imprimir() {
        if(cabeza == null) {
            System.out.println("La lista está vacía");
        } else {
            Nodo puntero = cabeza;
            System.out.print("[");
            while(puntero.siguiente != null) {
                System.out.print(puntero.caracter + ", ");
                puntero = puntero.siguiente;
            }
            System.out.print(puntero.caracter);
            System.out.println("]");
        }
    }

    public void eliminar(char caracter) {
        if(cabeza == null) {
            System.out.println("La lista está vacía");
        } else {
            Nodo puntero = cabeza;
            while(puntero.siguiente != null) {
                if(caracter != puntero.siguiente.caracter) {
                    puntero = puntero.siguiente;
                } else {
                    break;
                }
            }
            if(puntero.siguiente == null) {
                System.out.println("No existe el caracter buscado");
            } else {
                if(puntero.siguiente.siguiente == null) {
                    System.out.println(puntero.siguiente.caracter + " eliminado");
                    puntero.siguiente = null;
                } else {
                    Nodo auxiliar = puntero.siguiente.siguiente;
                    System.out.println(puntero.siguiente.caracter + " eliminado");
                    puntero.siguiente = auxiliar;
                }
            }
        }
    }
}
