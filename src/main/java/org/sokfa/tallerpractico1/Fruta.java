package org.sokfa.tallerpractico1;

import java.util.ArrayList;

/**
 * Creación de la clase llamda Fruta.
 *
 * @author DANIEL PEREZ VITOLA
 */
public class Fruta {

    /**
     * Representa el nombre de la fruta.
     */
    public String name;
    /**
     * Representa el peso promedio de la fruta.
     */
    private final float averageWeight;
    /**
     * Representa diversos colores que puede tener la fruta. Nota: en el
     * diagrama sugiere que sea un arreglo público, sin embargo, el mismo
     * diagrama también sugiere métodos get y set para este atributo, por tanto,
     * es pertinente cambiar el modificador de accedo a privado para que los
     * métodos antes mencionados tengan sentido.
     */
    private ArrayList<String> colors;

    /**
     * Contructor para la clase Fruta. Crea una instancia de la clase Fruta.
     *
     * @param name Nombre de la fruta que se va a crear por medio de la clase.
     * @param averageWeight Peso promedio de la fruta en gramos.
     * @param colors Arreglo que contiene los diferentes colores de la fruta.
     */
    public Fruta(String name, float averageWeight, ArrayList<String> colors) {
        this.name = name;
        this.averageWeight = averageWeight;
        this.colors = colors;
    }

    /**
     * Método para obtener los colores que puede tener la fruta.
     *
     * @return Retorna el arreglo con los diferentes colores que pueden tener
     * las frutas.
     */
    public ArrayList<String> getColors() {
        return colors;
    }

    /**
     * Método set para modificar los colores que puede tener la fruta.
     *
     * @param colors Arreglo de los colores.
     */
    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }

    /**
     * Método que muestra en consola los diferentes colores que puede tomar la
     * fruta.
     */
    public void showColorFruit() {
        /**
         * Ciclo foreach para recorrer el arreglo de colores y mostrarlo en
         * consola.
         */
        for (String color : colors) {
            System.out.println("Color: " + color);
        }

    }

}
