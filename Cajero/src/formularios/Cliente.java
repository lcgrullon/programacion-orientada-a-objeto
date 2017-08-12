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
public class Cliente {
    
    private String Nombre;
    private String Apellido;
    private String Ciudad;
    private String Telefono;
    private int pin;
    private float balance;

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public String getTelefono() {
        return Telefono;
    }

    public int getPin() {
        return pin;
    }
    
    
    
    
}
