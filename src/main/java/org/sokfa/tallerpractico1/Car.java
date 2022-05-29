package org.sokfa.tallerpractico1;

/**
 * Creación de la clase llamada Car.
 *
 * @author DANIEL PEREZ VITOLA
 */
public class Car {

    /**
     * Representa el color del carro.
     */
    private String color;
    /**
     * Representa la marca del carro.
     */
    public String brand;
    /**
     * Representa si el vehículo está asegurado.
     */
    protected boolean insured;
    /**
     * Representa el consumo de combustible en galones por kilometro.
     */
    private double fuelConsumption;

    /**
     * Constructor para la clase Car. Crea una instancia de la clase Car.
     *
     * @param color Asignación del color del carro.
     * @param brand Asignación de la marca del carro.
     * @param insured Establecer si el carro está o no asegurado.
     * @param fuelConsumption Ingresar consumo de combustible en galones por
     * kilometro.
     */
    public Car(String color, String brand, boolean insured, double fuelConsumption) {
        this.color = color;
        this.brand = brand;
        this.insured = insured;
        this.fuelConsumption = fuelConsumption;
    }

    /**
     * Método get para el atributo "color".
     *
     * @return Color del carro.
     */
    public String getColor() {
        return color;
    }

    /**
     * Método set para el atributo "color".
     *
     * @param color Nuevo color que se le va a asignar al carro.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Método get para el atributo "fuelConsumption".
     *
     * @return Consumo de combustible del carro.
     */
    public double getFuelConsumption() {
        return fuelConsumption;
    }

    /**
     * Método set para el atributo "fuelConsumption".
     *
     * @param fuelConsumption Nuevo consumo de combustible.
     */
    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    /**
     * Método para establecer si el consumo de combustible es alto o bajo.
     *
     * @return Cadena de caracteres "bajo" o "alto" indicando si el consumo de
     * combustible del carro es bajo o alto, respectivamente.
     */
    private String consumptionLevel() {
        /**
         * Representa la variable en donde se almacenará la cadena de retorno.
         */
        String level;
        /**
         * Estructura condicional para asignar el nivel de consumo de
         * combustible a la variable local "level".
         */
        if (fuelConsumption <= 50) {
            level = "bajo";
        } else {
            level = "alto";
        }
        return level;
    }

    /**
     * Método que indica si el carro es recomendado para ciudad.
     *
     * @return Cadena de caracteres "recomendado" o "no recomendado" indicando
     * si el carro es recomendado o no, respectivamente, para el uso en el casco
     * urbano.
     */
    protected String recommendedForCity() {
        /**
         * Representa la variable en donde se almacena el nivel de consumo.
         */
        String level;
        /**
         * Asignación del nivel de consumo a la variable "level" por medio del
         * método consumptionLevel().
         */
        level = consumptionLevel();
        /**
         * Estructura condicional para establecer si el carro es recomendado o
         * no.
         */
        if (level.equals("bajo")) {
            return "recomendado";
        } else {
            return "no recomendado";
        }
    }

}
