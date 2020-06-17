/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad3.colecciones.cordoba.juan;
import java.util.*;
/**
 *
 * @author Usuario
 */
public class ColeccionHashSet {
    
    public static void main(String[] args){
        
         /* se crean instacias perteneciente a la clase cliente */
        
        
        Cliente cl1= new Cliente ("Chavo del oio", "00001", 2);
        Cliente cl2= new Cliente ("kiko", "00002", 350000);
        Cliente cl3= new Cliente ("Don Ramon", "00003",1000);
        Cliente cl4= new Cliente ("Doña clotilde", "00004", 400000);
        /*se agrega un nuevo cliente para veridicar si el cliente cl5 es igual que cl1 atraves 
        del nro_de cuenta del cliente por lo tanto aplicando el metodo hashset no debe de mostrarmelo*/
        Cliente cl5= new Cliente ("Chavo del oio", "00001", 2);
        Cliente cl6= new Cliente ("Chilindrina", "00006", 2123414);
        Cliente cl7= new Cliente ("Don barriga", "00007", 450000);
        Cliente cl8= new Cliente ("Doña florinda", "00008",1002320);
        Cliente cl9= new Cliente ("Doña clotilde", "00009", 400230);
 
        /* se crea la coleccion hashset (no permite dupliar mis cliente - sirve para agregar los
        elementos)
        Por lo tanto quiero almacenar objetos de tipo cliente dentro de la coleccion
        y los que se repitan con el mismo nuemero de cuenta no los muestre
        */
        
       Set <Cliente> clientesBanco=new HashSet<Cliente>();
       
      
       /* se agrega objetos a la coleccion utilizando el metodo add del tipo cliente que le indicamos*/
       
       
       clientesBanco.add(cl1);
       clientesBanco.add(cl2);
       clientesBanco.add(cl3);
       clientesBanco.add(cl4);
       clientesBanco.add(cl5);
       clientesBanco.add(cl6);
       clientesBanco.add(cl7);
       clientesBanco.add(cl8);
       clientesBanco.add(cl9);
       
       
           /*se recorre la coleccion en busca de lo que hay almacenado en la misma*/
       
//       for (Cliente cliente : clientesBanco) {
//            
//            /*muestra nombre, saldo y cuenta de los clientes*/
//            
//            System.out.println(cliente.getNombre()+ " " + cliente.getNro_cuenta() + " "
//            + cliente.getSaldo());
//            
//        }
//       
       /* se crea un metodo iterator que me permita la coleccion de clienteBanco en este caso
       voy a mostrar los nombres de los clientes por lo tanto el iterador va a ir saltando de elemento 
       a elemnto  y cuando llegue al ultimo terminaria entre otras palabras me permite realizar 
       un recorrido de toda lista elemento por elemento mediante un iterador*/
       
 
       Iterator<Cliente> it = clientesBanco.iterator();
        
        while(it.hasNext()){
   
            String nombre_cliente = it.next().getNombre();
           
            System.out.println(nombre_cliente);
            
    }
        
        
    }
    
}
