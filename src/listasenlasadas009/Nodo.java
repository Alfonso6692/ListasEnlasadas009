/*
 * Clase Nodo para representar un elemento de una lista doblemente enlazada.
 * Cada nodo contiene un nombre (dato) y referencias al siguiente y al anterior nodo.
 */
package listasenlasadas009;

/**
 * Clase Nodo para una lista doblemente enlazada.
 * Diseñada para almacenar un valor (nombre) y referencias al nodo anterior y al nodo siguiente.
 * Puede ser utilizada como parte de una estructura de datos como listas doblemente enlazadas.
 * 
 * @author ASUS-VASQUEZ
 */
public class Nodo {
    // Campo para almacenar el dato del nodo
    public String nombre;
    
    // Referencia al nodo siguiente en la lista
    public Nodo sig;
    
    // Referencia al nodo anterior en la lista
    public Nodo ant;

    /**
     * Constructor vacío.
     * Crea un nodo sin inicializar su valor ni sus referencias.
     */
    public Nodo() {
    }

    /**
     * Obtiene el valor almacenado en el nodo.
     * 
     * @return El nombre almacenado en el nodo.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el valor del nodo.
     * 
     * @param nombre El valor que se almacenará en el nodo.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la referencia al nodo siguiente.
     * 
     * @return El nodo siguiente en la lista o null si no hay ninguno.
     */
    public Nodo getSig() {
        return sig;
    }

    /**
     * Establece la referencia al nodo siguiente.
     * 
     * @param sig El nodo que será el siguiente en la lista.
     */
    public void setSig(Nodo sig) {
        this.sig = sig;
    }

    /**
     * Obtiene la referencia al nodo anterior.
     * 
     * @return El nodo anterior en la lista o null si no hay ninguno.
     */
    public Nodo getAnt() {
        return ant;
    }

    /**
     * Establece la referencia al nodo anterior.
     * 
     * @param ant El nodo que será el anterior en la lista.
     */
    public void setAnt(Nodo ant) {
        this.ant = ant;
    }
}
