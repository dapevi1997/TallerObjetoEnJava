package org.sokfa.tallerpractico1;

/**
 * Creación de la clase llamada Guitar.
 *
 * @author DANIEL PEREZ VITOLA
 */
public class Guitar {

    /**
     * Representa el número de cuerdas de la guitarra.
     */
    public int stringsNumber;
    /**
     * Representa la marca de la guitarra.
     */
    private String brand;
    /**
     * Representa el tipo de guitarra: eléctrica o acústica.
     */
    private String guitarType;
    /**
     * Representa el tiempo en días del último mantenimiento realizado a la
     * guitarra.
     */
    protected int lastMaintenance;

    /**
     * Contructor para la clase Guitar. Crea una instancia de la clase Guitar.
     *
     * @param stringsNumber Número de cuerdas que tiene la guitarra.
     * @param brand Marca de la guitarra.
     * @param guitarType Tipo de guitarra: elétrica o acústica.
     * @param lastMaintenance Último mantenimiento en días.
     */
    public Guitar(int stringsNumber, String brand, String guitarType, int lastMaintenance) {
        this.stringsNumber = stringsNumber;
        this.brand = brand;
        this.guitarType = guitarType;
        this.lastMaintenance = lastMaintenance;
    }

    /**
     * Método get del atributo "Brand".
     *
     * @return Marca de la guitarra.
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Método set del atributo "Brand".
     *
     * @param brand Nueva marca que se le va a asignar a la guitarra.
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Método get del atributo "GuitarType".
     *
     * @return Tipo de guitarra.
     */
    public String getGuitarType() {
        return guitarType;
    }

    /**
     * Método set del atributo "guitarType".
     *
     * @param guitarType Nuevo tipo de guitarra.
     */
    public void setGuitarType(String guitarType) {
        this.guitarType = guitarType;
    }

    /**
     * Método para determinar si la guitarra requiere mantenimiento.
     *
     * @return True o false si la guitarra requiere o no, respectivamente,
     * mantenimiento.
     */
    private boolean maintenanceRequired() {
        /**
         * Variable booleana para almacenar si se requiere mantenimiento.
         */
        boolean maintenance;
        /**
         * Estructura condicional para establecer si es necesario el
         * mantenimiento.
         */
        if (lastMaintenance >= 60) {
            maintenance = true;
        } else {
            maintenance = false;
        }
        return maintenance;
    }

    /**
     * Método para determinar la ciudad en donde está disponible el
     * mantenimiento.
     *
     * @return Ciudad en donde el mantenimiento está disponible.
     */
    protected String cityMaintenance() {
        /**
         * Variable para almacenar el nombre de la ciudad.
         */
        String city;
        /**
         * Estructura lógica para asignar el nombre de la ciudad.
         */
        if (maintenanceRequired() && guitarType.equals("acústica")) {
            city = "Medellín";
        } else if (maintenanceRequired() && guitarType.equals("eléctrica")) {
            city = "no hay ciudades disponibles";
        } else {
            city = "La guitarra no requiere mantenimiento";
        }
        return city;
    }

}
