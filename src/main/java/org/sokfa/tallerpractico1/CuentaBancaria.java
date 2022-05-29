package org.sokfa.tallerpractico1;

/**
 * Creación de la clase llamada CuentaBancaria.
 *
 * @author DANIEL PEREZ VITOLA
 */
public class CuentaBancaria {

    /**
     * Representa el número de la cuenta.
     */
    private int accountNumber;
    /**
     * Representa si la cuenta está activada.
     */
    protected boolean activated;
    /**
     * Representa el tipo de cuenta: ahorros o corriente.
     */
    private String accountType;

    /**
     * Constructor para la clse CuentaBancaria. Crea una instancia de la clase
     * CuentaBancaria.
     *
     * @param accountNumber Número único de cuenta que se le será asignado.
     * @param activated Estado que se le va a asignar a la cuenta: activado o
     * desactivado.
     * @param accountType Tipo de cuenta que se desee crear: ahorros o
     * corriente.
     */
    public CuentaBancaria(int accountNumber, boolean activated, String accountType) {
        this.accountNumber = accountNumber;
        this.activated = activated;
        this.accountType = accountType;
    }

    /**
     * Método para consultar si la cuenta está activada.
     *
     * @return "True" si la cuenta está activa o "false" si la cuenta no está
     * activada.
     */
    public boolean isActivated() {
        return activated;
    }

    /**
     * Modificar el estado de la cuenta.
     *
     * @param activated Estado de la cuenta(activada o desactivada).
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    /**
     * Método para mostrar en consola el tipo de cuenta bancaria.
     */
    public void showAccountType() {
        System.out.println("La cuenta es de tipo: " + accountType);
    }

}
