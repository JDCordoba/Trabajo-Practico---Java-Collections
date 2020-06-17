/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad3.colecciones.cordoba.juan;

/**
 *
 * @author Usuario
 */

import java.util.*;

//public class Unidad3ColeccionesCordobaJuan {

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
        // TODO code application logic here
        
        
//        ARRAYLIST
//        ArrayList<Cliente> clientesBanco = new ArrayList<>();
     
        
        /* se crean instacias perteneciente a la clase cliente */
        
        
//        Cliente cl1= new Cliente ("Chavo del oio", "00001", 2);
//        Cliente cl2= new Cliente ("kiko", "00002", 350000);
//        Cliente cl3= new Cliente ("Don Ramon", "00003",1000);
//        Cliente cl4= new Cliente ("Doña clotilde", "00004", 400000);
//        /*se agrega un nuevo cliente para veridicar si el cliente cl5 es igual que cl1 atraves 
//        del nro_de cuenta del cliente por lo tanto aplicando el metodo hashset no debe de mostrarmelo*/
//        Cliente cl5= new Cliente ("Chavo del oio", "00001", 2);
//        
//        Cliente cl6= new Cliente ("Chilindrina", "00006", 2123414);
//        Cliente cl7= new Cliente ("Don barriga", "00007", 450000);
//        Cliente cl8= new Cliente ("Doña florinda", "00008",1002320);
//        
//        Cliente cl9= new Cliente ("Doña clotilde", "00009", 400230);
 
        /* se crea la coleccion hashset (no permite dupliar mis cliente - sirve para agregar los
        elementos)
        Por lo tanto quiero almacenar objetos de tipo cliente dentro de la coleccion
        */
        
       //Set <Cliente> clientesBanco=new HashSet<Cliente>();
        
       /* se agrega objetos a la coleccion utilizando el metodo add del tipo cliente que le indicamos*/
       
       
//       clientesBanco.add(cl1);
//       clientesBanco.add(cl2);
//       clientesBanco.add(cl3);
//       clientesBanco.add(cl4);
//       clientesBanco.add(cl5);
//       clientesBanco.add(cl6);
//       clientesBanco.add(cl7);
//       clientesBanco.add(cl8);
//       clientesBanco.add(cl9);
       
       //iterar sobre la lista
       /*for (Cliente obj : clientesBanco)
       System.out.println(obj.getNombre());
       */
      
       
       /* se crea un iterador para eliminar un respectivo nombre de la coleccion*/
//      Iterator<Cliente> it = clientesBanco.iterator();
//       
//       while (it.hasNext()){
//           
//           String name_cliente=it.next().getNombre();
//           
//           if (name_cliente.equals("kiko")){
//               
//               it.remove();
//           }
//       }
       
      /*se recorre la coleccion en busca de lo que hay almacenado en la misma*/
       
//       for (Cliente cliente : clientesBanco) {
//            
//            /*muestra nombre, saldo y cuenta de los clientes*/
//            
//            System.out.println(cliente.getNombre()+ " " + cliente.getNro_cuenta() + " "
//            + cliente.getSaldo());
//            
//        }
       
       /* el bucle for-each permite recorrer la collecion de todo los objetos de tipo cliente que tenemos 
        dentro de la coleccion clientesBanco
        */
       
       /* se crea un metodo iterator que me permita la coleccion de clienteBanco en este caso
       voy a mostrar los nombres de los clientes por lo tanto el iterador va a ir saltando de elemento 
       a elemnto  y cuando llegue al ultimo ya no se va a llamar a next por lo tanto ahi terminaria*/
       /*Iterator<Cliente> it = clientesBanco.iterator();
        
        while(it.hasNext()){
            
            String nombre_cliente = it.next().getNombre();
            
            System.out.println(nombre_cliente);
            
    }*/
      
//       LinkedList
       /*
       se crea una lista enlazada ordenada llamada staff
       */
//        LinkedList<Cliente> staff = new LinkedList<>();
//       
//        staff.add(cl6);
//        staff.add(cl7);
//        staff.add(cl8);
//       
//        System.out.println(staff);
        
        /*
        se trae in iterador de una lista para iterar sobre la lista enlazada
        */
//        ListIterator<Cliente> ite = staff.listIterator();   
        /*
        se agrega un nuevo cliente y se lo coloca en la segunda posicion de la lista
        */
//        ite.next();
//        ite.add(cl9);
        /*staff.addFirst(cl9); agrega al cliente a la primera posicion de la lista
        staff.addLast(cl9); agerga a la ultima posicion
        */
       
//        staff.forEach(obj -> System.out.println(obj));
 
       
        /*
        el treeset es similar al hash set pero con la diferencia que 
        me permite ordenar la lista a traves del metodo compareTo en este caso 
        se ordena por el saldo del cliente
        */
//        Set<Cliente> rrhh = new TreeSet<>(Comparator.reverseOrder());
//        
//        Cliente cl10= new Cliente ("Chavo Luna", "00010", 4);
//        Cliente cl11= new Cliente ("Leito Paez", "00011", 55);
// 
//        rrhh.add(cl10);
//        rrhh.add(cl11);
//        
//        rrhh.forEach(obj -> System.out.print(obj));
                
//    }
//       
//    }
//
//       
       
 
       
     

       
      
    
    
