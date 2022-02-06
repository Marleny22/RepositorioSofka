
package example_objects;

/**
 * Representa la clase Cuenta bancaria, sus principales identificadores y acciones relacionadas con la misma
 * @author Marleny Fernandez Sandoval
 */
public class BankAccount {
    /**
     * Representa el número de cuenta como identificación única.
     */
    private int  accountNumber;
    /**
     * Representa el estado de la cuenta, ya sea activo o inactivo.
     */
    private boolean activated = false;
    /**
     * Representa el saldo de la cuenta en pesos Colombianos.
     */
    private double accountbalance;
    
    /**
     * Crea una instancia de la clase Cuenta Bancaria con atributos definidos.
     * @param accountNumber Número de cuenta.
     * @param accountbalance Saldo disponible.
     */
    public BankAccount(int accountNumber, double accountbalance) {
        this.accountNumber = accountNumber;
        this.accountbalance = accountbalance;
    }

    /**
     * Método para verificar el estado de la cuenta.
     * @return True = Cuenta Activa, False = Cuenta inactiva
     */
    public boolean isActivated() {
        if(this.activated == true)
        {
        System.out.println("La cuenta está activa");
        }
        else
        {
         System.out.println("La cuenta está inactiva");  
        }
        return activated;
    }
    
    /**
     * Método que permite cambiar el estado de la cuenta
     * @param activated True = Cuenta Activa, False = Cuenta inactiva
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }

 
    
}
