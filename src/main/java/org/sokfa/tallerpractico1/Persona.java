package org.sokfa.tallerpractico1;

import java.util.Date;

/**
 * Creación de la clase llamada Persona.
 *
 * @author DANIEL PEREZ VITOLA
 */
public class Persona {

    /**
     * Representa el nombre de una persona. Nota: en el diagrama sugiere que sea
     * una variable pública, sin embargo, el mismo diagrama también sugiere
     * métodos get y set para este atributo, por tanto, es pertinente cambiar el
     * modificador de acceso a privado para que los métodos antes mencionados
     * tengan sentido.
     */
    private String name;
    /**
     * Representa el primer apellido de la persona.
     */
    public String lastName1;
    /**
     * Representa el segundo apellido de la persona.
     */
    public String lastName2;
    /**
     * Representa la fecha de nacimiento de la persona.
     */
    public Date dateBirth;
    /**
     * Representa la altura de la persona.
     */
    public float height;

    /**
     * Creación del contructor para la clase Persona. Crea una instancia de la
     * clase Persona.
     *
     * @param name Nombre que se le va a asignar a la persona.
     * @param lastName1 Primer apellido que se le va a asignar a la persona.
     * @param lastName2 Segundo apellido que se le va a asignar a la persona.
     * @param dateBirth Fecha de nacimiento de la persona.
     * @param height Altura en cm de la persona.
     */
    public Persona(String name, String lastName1, String lastName2, Date dateBirth, float height) {
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.dateBirth = dateBirth;
        this.height = height;
    }

    /**
     * Obtener el nombre de la persona.
     *
     * @return Nombre de la persona.
     */
    public String getName() {
        return name;
    }

    /**
     * Cambio de nombre de la persona.
     *
     * @param name Nombre que se le va a asignar a la persona.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Método que muestra en consola el nombre completo de la persona.
     */
    public void showFullName() {
        System.out.println("El nombre completo de la persona es: " + name + lastName1 + lastName2);
    }

}
