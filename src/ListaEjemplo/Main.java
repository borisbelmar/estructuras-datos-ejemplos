package ListaEjemplo;

import ListaEjemplo.Juego;
import ListaEjemplo.Lista;

public class Main {

    public static void main(String[] args) {
        int id = 0;
        Lista juegos = new Lista();

        juegos.append(new Juego(id++,"Mario Bros"));
        juegos.prepend(new Juego(id++,"Contra"));

        System.out.println("El juego " + juegos.get(0).getName() + " corresponde al id " + juegos.get(0).getId());
        System.out.println("El juego " + juegos.get(1).getName() + " corresponde al id " + juegos.get(1).getId());
    }
}
