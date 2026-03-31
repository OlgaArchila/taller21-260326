

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
    // método para encontrar el número faltante

    public int encontrarFaltante() {

        Nodo actual = cabeza; // empezar desde el primer nodo

        while (actual.siguiente != null) { // recorrer hasta el penúltimo nodo

            int diferencia = actual.siguiente.dato - actual.dato; // calcular la diferencia

            if (diferencia > 1) { // si el salto es mayor que 1
                return actual.dato + 1; // el número faltante está entre ellos
            }

            actual = actual.siguiente; // avanzar al siguiente nodo
        }

        return -1; // si no se encuentra ninguno
    }
}


