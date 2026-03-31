

public class Lista {
    Nodo cabeza; // primer nodo de la lista

    // método para insertar un número al final de la lista
    public void insertar(int dato) {

        Nodo nuevo = new Nodo(dato); // se crea un nuevo nodo con el valor

        if (cabeza == null) { // si la lista está vacía
            cabeza = nuevo; // el nuevo nodo se vuelve la cabeza
        } else {

            Nodo aux = cabeza; // nodo auxiliar para recorrer la lista

            while (aux.siguiente != null) { // recorrer hasta el último nodo
                aux = aux.siguiente; // avanzar al siguiente nodo
            }

        
        }
        
    }
    public void ordenar() {
    
    
    Nodo actual = cabeza; // nodo que recorrerá la lista

    while (actual != null) { // mientras existan nodos

        Nodo siguiente = actual.siguiente; // nodo siguiente

        while (siguiente != null) { // recorrer los demás nodos

            if (actual.dato > siguiente.dato) { // si están desordenados

                int temp = actual.dato; // guardar valor temporal
                actual.dato = siguiente.dato; // intercambiar valores
                siguiente.dato = temp; // completar intercambio
            }

            siguiente = siguiente.siguiente; // avanzar
        }

        actual = actual.siguiente; // pasar al siguiente nodo
    }
}
}


