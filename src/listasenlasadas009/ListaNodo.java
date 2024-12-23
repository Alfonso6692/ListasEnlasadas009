/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasenlasadas009;

/**
 *
 * @author ASUS-VASQUEZ
 */
public class ListaNodo {
    
    public Nodo cab;
    
    public ListaNodo() {
        
    }
    
    public void ListarNodo() {
        for (Nodo i = cab; i!=null; i=i.sig) {
            System.out.println(i.nombre);
        }
    }
    public void agregarAlInicio(Nodo nuevo) {
        if(cab==null) {
            cab=nuevo;
        }else {
              nuevo.sig=cab;//agregar al inicio
              cab=nuevo;//restablecer la referencia de cabecera
        }
    }
    
    public void agregarAlFinal (Nodo nuevo) {
        if(cab==null) {
            cab=nuevo;
        }else {
            for(Nodo i=cab;i!=null;i=i.sig){
                if(i.sig==null) {//saber el que es el final
                    System.out.println("El siguiente es el final");
                    i.sig=nuevo;
                    break;
                }
            }
        }
    }
    public ListaNodo(Nodo cab) {
        this.cab=cab;
    }
    
    public Nodo getCab() {
        return cab;
    }
    
    public void setCab(Nodo cab) {
        this.cab=cab;
    }
}
