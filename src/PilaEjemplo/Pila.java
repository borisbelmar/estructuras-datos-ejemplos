package PilaEjemplo;

// Creamos la clase Pila e implementamos la interfaz iStack con los metodos abstractos
public class Pila implements iStack {

    // Creamos la clase nodo donde almacenaremos los registros
    private class Nodo {
        private URL url;
        private Nodo siguiente = null;

        public Nodo(URL url) {
            this.url = url;
        }
    }

    // Variable usada para medir la longitud
    private int length = 0;

    // Creamos el nodo cabeza, cima o Top Of Stack el cual es null en una pila vacía
    private Nodo tos = null;

    // Implementamos el método Apilar (Push)
    @Override
    public void push(URL url) {
        Nodo nodo = new Nodo(url); // Instanciamos el nodo
        nodo.siguiente = tos; // Ponemos al nodo recién creado apuntando a tos (Desplazandolo)
        tos = nodo; // Reemplazamos tos por el nodo creado (El nuevo tos)
        length++;
    }

    // Implementamos el método Desapilar (Pop)
    @Override
    public void pop() {
        if(tos != null) { // Comprobamos que la pila no esté vacía
            Nodo delete = tos; // Creamos un nodo temporal y le asignamos el valor actual de TOS
            tos = tos.siguiente; // Le asignamos a TOS el nodo siguiente en la pila
            delete.siguiente = null; // Eliminamos el puntero del nodo temporal
            length--;
        }
    }

    // Implementamos el método obtener
    @Override
    public URL get() {
        if (tos == null) {
            return null; // Si el Top of Stack es null, entonces retornamos null
        } else {
            return tos.url; // En el caso contrario, devolvemos el elemento almacenado en el nodo
        }
    }

    // Implementamos el método longitud
    @Override
    public int length() {
        return length;
    }

    // Implementamos el método para saber si la pila está vacía
    @Override
    public boolean isEmpty() {
        return tos == null;
    }
}
