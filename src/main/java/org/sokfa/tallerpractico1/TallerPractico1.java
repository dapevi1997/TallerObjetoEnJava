package org.sokfa.tallerpractico1;

import java.util.ArrayList;

/**
 * Creación de la clase que contiene el método main.
 *
 * @author DANIEL PEREZ VITOLA
 */
public class TallerPractico1 {

    public static void main(String[] args) {
        /**
         * Creación de una colección para almacenar colores.
         */
        ArrayList colorList = new ArrayList();
        /**
         * Agregar colores a la lista.
         */
        colorList.add("Red");
        colorList.add("Blue");
        /**
         * Creación de un objeto de tipo Fruta asignando los argumentos
         * necesarios.
         */
        Fruta fruta = new Fruta("apple", 1.0f, colorList);
        /**
         * Prueba del método que imprime en consola los colores de la fruta.
         */
        fruta.showColorFruit();
    }
}
