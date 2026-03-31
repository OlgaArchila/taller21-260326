
import java.util.Scanner; // importar scanner

public class Taller21260326 {

    public static void main(String[] args) {
    
      Scanner sc = new Scanner(System.in); // crear objeto scanner

        int n = sc.nextInt(); // leer el número total esperado

        Lista lista = new Lista(); // crear la lista enlazada

        for (int i=0;i<n-1;i++) { // leer n-1 números
            int num = sc.nextInt(); // leer número
            lista.insertar(num); // insertar en la lista
        }

        lista.ordenar(); // ordenar la lista
         System.out.println("------------");
        lista.mostrar();// mostrar loista ordenada

        int faltante = lista.encontrarFaltante(); // buscar número faltante

        System.out.println(faltante); // imprimir resultado
        
        
        
    }
}

