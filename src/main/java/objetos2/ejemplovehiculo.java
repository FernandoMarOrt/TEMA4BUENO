/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos2;

/**
 *
 * @author fer
 */
public class ejemplovehiculo {
    
    public static void main(String[] args) {
       Modelo aleatorio = Modelo.getAleatorio(); 
       
        System.out.println("El modelo aleatorio de  es " + aleatorio.getModelo());
        
        
        System.out.println("Color " + Color.getAleatorio());
        
        
        
        
        Vehiculo v = new Vehiculo();
        
        System.out.println(v);
        
        
        
        CatalogoVehiculos catalogo = new CatalogoVehiculos(10);
        Vehiculo[] array = catalogo.getListaVehiculos();
        array[0].setBastidor("123A");
        System.out.println("------------------------------------------------");
        catalogo.mostrarCatalogo();
        
        int pos = catalogo.buscarVehiculo(v);
        System.out.println("posicion " + pos);
        
        catalogo.borrarVehiculo(catalogo.getListaVehiculos()[4]);
        System.out.println("----------------- DESPUES DE BORRAR ---------------------");
        
        catalogo.mostrarCatalogo();

    }
   
    
}
