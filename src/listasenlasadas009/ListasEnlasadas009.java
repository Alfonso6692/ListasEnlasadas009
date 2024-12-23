/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listasenlasadas009;

/**
 *
 * @author ASUS-VASQUEZ
 */
public class ListasEnlasadas009 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaNodo lista = new ListaNodo();
        
        Nodo e1 = new Nodo(); //instancia un objeto
        
        e1.nombre = "pepe";
        
        lista.agregarAlInicio(e1);
        Nodo e2 = new Nodo();
        e2.nombre="Alfonso";
        lista.agregarAlInicio(e2);
        
        Nodo e3 = new Nodo();
        
        e3.nombre ="coco";
        
        lista.agregarAlInicio(e3);
        
        Nodo e4 = new Nodo();
        e4.nombre="Ecmias";
        
        lista.agregarAlFinal(e4);
        lista.ListarNodo();
        
        
        
    }
}
    

