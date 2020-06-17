/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad3.colecciones.cordoba.juan;

import java.util.Objects;

/**
 *
 * @author Usuario
 */
public class Cliente implements Comparable<Cliente>{
   
/*se crea un constructor que reciba parametro o argumento de tipo string*/
    
    public Cliente(String nombre, String nro_cuenta, double saldo){
        
        this.nombre=nombre;
        
        this.nro_cuenta=nro_cuenta;
        
        this.saldo=saldo;
    
    }

    
    
    /*se crean los dato encapsulados de la clase*/
    
    private String nombre;
    
    private String nro_cuenta;
    
    private double saldo;
    
    
    /* se crean los getters y setters para cada unos de los campos de la clase*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNro_cuenta() {
        return nro_cuenta;
    }

    public void setNro_cuenta(String nro_cuenta) {
        this.nro_cuenta = nro_cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", nro_cuenta=" + nro_cuenta + ", saldo=" + saldo + '}';
    }

    
    /*
    se crea el metodo compareTo que me permitira compara los cliente a partir del saldo
    asignado a cada uno
    */
    @Override
    public int compareTo(Cliente o) {
        
        if (this.getSaldo() <o.getSaldo())
            
            return -1;
        
        else if (this.getSaldo() >o.getSaldo() )
            
            return 1;
        
        else 
            
            return 0;
   
    }

    
    /*se crean los metodos equals y hashcode para que me permita no mostrar
    los cliente repetidos a partir del nro_cuenta
    */
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + Objects.hashCode(this.nro_cuenta);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.nro_cuenta, other.nro_cuenta)) {
            return false;
        }
        return true;
    }

   
    
    
    

    
    
    
    
} 
    


