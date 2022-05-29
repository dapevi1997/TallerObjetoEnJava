package org.sokfa.tallerpractico1;

/**
 * Creación de la clase llamada Phone.
 *
 * @author DANIEL PEREZ VITOLA
 */
public class Phone {

    /**
     * Representa la marca del celular.
     */
    private String brand;
    /**
     * Representa el color del celular.
     */
    public String color;
    /**
     * Representa el IMEI del celular.
     */
    protected final int IMEI;
    /**
     * Representa si el celular está apagado o encendido.
     */
    protected boolean powered;

    /**
     * Contructor de la clase Phone.Crea una instancia de la clase Phone.
     *
     * @param brand Marca del celular.
     * @param color Color del celular.
     * @param IMEI IMEI del celular.
     * @param powered Estado del celular: encendido o apagado.
     */
    public Phone(String brand, String color, int IMEI, boolean powered) {
        this.brand = brand;
        this.color = color;
        this.IMEI = IMEI;
        this.powered = powered;
    }

    /**
     * Método get para el atributo brand.
     *
     * @return Marca del celular.
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Método set para el atributo brand.
     *
     * @param brand Nueva marca que se le va a asignar al celular.
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Método para establecer el sistema operativo del celular.
     *
     * @return Sistema Operativo con el que trabaja el celular.
     */
    private String oS(String brand) {
        /**
         * Representa la variable en donde se almacena el nombre del sistema
         * operativo.
         */
        String oS;
        /**
         * Estructura condicional para establecer el sistema operativo del
         * celular.
         */
        if (brand.equals("Iphone")) {
            oS = "iOS";
        } else {
            oS = "Android";
        }
        return oS;
    }

    /**
     * Método para verificar si el celular está encendido o apagado.
     *
     * @return Cadena de caracteres "Si" o "No" indicando si el celular está
     * encendido o apagado, respectivamente.
     */
    protected String isPowered() {
        /**
         * Estructura condicional para establecer el estado del celular.
         */
        if (powered) {
            return "Si";
        } else {
            return "No";
        }
    }

    /**
     * Método para mostrar en consola el sistema opertivo del celular y, además,
     * si se encuentra encendido o apagado.
     */
    public void showOSandState() {
        /**
         * Representa la variable para almacenar el sistema operativo del
         * celular.
         */
        String oS;
        /**
         * Asignación de la variable oS por medio del método oS.
         */
        oS = oS(brand);
        /**
         * Imprimir en consola el estado del celular.
         */
        System.out.println("El sistema operativo del celular es: " + oS);
        System.out.println("¿El celular está encendido? " + isPowered());
    }

}
