/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

/**
 *
 * @author Jeyson Diez
 */
public abstract class Cuenta {
    
    private int NumeroCuenta;
    private String TipoCuenta;
    private double balance;
    private int pin;

    public void setNumeroCuenta(int NumeroCuenta) {
        this.NumeroCuenta = NumeroCuenta;
    }

    public void setTipoCuenta(String TipoCuenta) {
        this.TipoCuenta = TipoCuenta;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getNumeroCuenta() {
        return NumeroCuenta;
    }

    public String getTipoCuenta() {
        return TipoCuenta;
    }

    public double getBalance() {
        return balance;
    }

    public int getPin() {
        return pin;
    }

    
    public abstract void Verificar_Balance();
    public abstract void Realizar_transferencia();
    public abstract void Ver_Historial();
    
    
}
