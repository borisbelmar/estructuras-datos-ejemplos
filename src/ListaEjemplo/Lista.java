package ListaEjemplo;

public class Lista {

    private Nodo cabeza; // Referencia a cabeza de la lista (Nodo especial)
    private int length = 0; // Variable para almacenar el largo de la lista

    private class Nodo {
        public Juego juego; // Referencia al juego
        public Nodo siguiente = null; // Referencia al siguiente nodo

        // Constructor
        public Nodo(Juego juego) {
            this.juego = juego;
        }
    }

    // Insertar al principio de la lista (Prepend)
    public void prepend(Juego juego) {
        Nodo nodo = new Nodo(juego); // Instanciamos el juego
        nodo.siguiente = cabeza; // Lo que era cabeza, se vuelve cola
        cabeza = nodo; // El nodo creado se vuelve la cabeza actual de la lista
        length++;
    }

    // Insertar al final de la lista (Append)
    public void append(Juego juego) {
        Nodo nodo = new Nodo(juego); // Instanciamos el juego
        if (cabeza == null) {
            cabeza = nodo; // Si la lista está vacía, entonces insertamos en la cabeza
        } else { // Si la lista NO está vacía
            Nodo puntero = cabeza; // Creamos un nodo puntero que debe ir avanzando a través de la lista
            // Recorremos la lista mientras el nodo siguiente al puntero no sea null
            while (puntero.siguiente != null) {
                // En cada iteración el puntero avanza 1
                puntero = puntero.siguiente;
            }
            puntero.siguiente = nodo; // El siguiente del puntero (El último) vale el nodo que acabamos de crear
        }
        length++;
    }

    // Insertar después de un nodo determinado (Insert)
    public void insert(int n, Juego juego) {
        Nodo nodo = new Nodo(juego); // Instanciamos el juego
        if (cabeza == null) {
            cabeza = nodo; // Si la lista está vacía, entonces insertamos en la cabeza
        } else { // Si la lista NO está vacía
            Nodo puntero = cabeza; // Creamos un puntero y lo ponemos en la cabeza
            int contador = 0; // Creamos un contador con valor 0 en la posición de la cabeza
            while (contador < n && puntero.siguiente != null) {
                // Mientras el contador no alcance el índice solicitado (n)
                // y el Nodo siguiente del puntero no sea null
                puntero = puntero.siguiente; // Avanzamos por los nodos
                contador++; // Aumentamos el contador por cada avance
            }
            nodo.siguiente = puntero.siguiente;
            puntero.siguiente = nodo;
        }
        length++;
    }

    // Obtener el libro 'n' de nuestra lista
    public Juego get(int n) {
        // Comprobamos si la lista está vacía (Cabeza = null)
        if(cabeza == null) {
            return null;
        } else { // Si la lista NO está vacía
            Nodo puntero = cabeza; // Creamos un puntero y lo ponemos en la cabeza
            int contador = 0; // Creamos un contador con valor 0 en la posición de la cabeza
            while (contador < n && puntero.siguiente != null) {
                // Mientras el contador no alcance el índice solicitado (n)
                // y el Nodo siguiente del puntero no sea null
                puntero = puntero.siguiente; // Avanzamos por los nodos
                contador++; // Aumentamos el contador por cada avance
            }
            // Si el contador no vale lo que vale 'n', el juego vale null
            if (contador != n) {
                return null;
            } else {
                // Devolvemos el juego en la posición 'n'
                return puntero.juego;
            }
        }
    }

    // Retornamos el largo que hemos estado incrementando y decrementando
    public int count() {
        return length;
    }

    // Retornamos true si la lista está vacía y retornamos false si tiene elementos
    public boolean isEmpty() {
        return cabeza == null;
    }

    // Eliminamos el primer
    public void deleteFirst() {
        if(cabeza != null) { // Si la lista está vacía, no hacemos nada
            Nodo primer = cabeza; // Creamos un nodo temporal para tomar el valor de la cabeza
            cabeza = cabeza.siguiente; // Hacemos que la cabeza ahora tome el valor de su siguiente
            primer.siguiente = null; // Hacemos que el nodo temporal apunte a nada y está eliminado
            length--; // Decrementamos la longitud de la lista
        }
    }

    // Eliminar el último elemento o nodo
    public void deleteLast() {
        if(cabeza != null) { // Si la lista está vacía, no hacemos nada
            if(cabeza.siguiente == null) {
                cabeza = null;
            } else {
                Nodo puntero = cabeza; // Creamos un puntero y lo ponemos en la cabeza
                while (puntero.siguiente.siguiente != null) { // Mientras no lleguemos al penúltimo
                    puntero = puntero.siguiente; // Recorre hasta el penúltimo
                }
                puntero.siguiente = null; // Como no hay siguiente en el penúltimo, ahora es el nuevo último
            }
        }
    }

    // Eliminar un nodo en específico
    public void delete(int n) {
        if(n == 0) { // Si se quiere eliminar el primero en la lista
            Nodo primer = cabeza; // Creamos un nodo temporal para tomar el valor de la cabeza
            cabeza = cabeza.siguiente; // Hacemos que la cabeza ahora tome el valor de su siguiente
            primer.siguiente = null; // Hacemos que el nodo temporal apunte a nada y está eliminado
            length--; // Decrementamos la longitud de la lista
        } else if (n < length){ // Comprueba que el nodo a eliminar esté dentro de los parametros
            if(cabeza != null) {
                Nodo puntero = cabeza; // Creamos un puntero y lo ponemos en la cabeza
                int contador = 0; // Creamos un contador y lo inicializamos con índice 0
                while (contador < (n - 1)) { // Itera hasta posicionarse en el nodo anterior
                    puntero = puntero.siguiente; // Recorre cada nodo
                    contador++; // Aumenta con cada nodo recorrido para indicar la posición
                }
                Nodo temp = puntero.siguiente; // Marcamos el nodo a eliminar
                puntero.siguiente = temp.siguiente; // El anterior toma como siguiente al que está después del eliminado
                temp.siguiente = null; // Se borra el puntero
                length--; // Registramos un decremento del largo por el nodo eliminado
            }
        }
    }
}