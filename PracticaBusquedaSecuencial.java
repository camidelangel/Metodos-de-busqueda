package MetodosDeBusqueda;


public class PracticaBusquedaSecuencial {

    public static int busquedaSecuencial(int[] arr, int clave) {

        // TODO 1: Recorre todo el arreglo
        for (int i = 0; i < arr.length; i++) {

            // TODO 2: Compara el elemento actual con la clave buscada
            if (arr[i] == clave) {

                // TODO 3: Regresa el indice si se encuentra
                return i;
            }
        }

        // TODO 4: Regresa -1 si el elemento no esta en el arreglo
        return -1;
    }

    public static void main(String[] args) {

        int[] calificaciones = {78, 92, 65, 88, 95, 70};

        int pos1 = busquedaSecuencial(calificaciones, 88); // Esperado: 3
        int pos2 = busquedaSecuencial(calificaciones, 100); // Esperado: -1

        System.out.println("Posicion de 88: " + pos1);
        System.out.println("Posicion de 100: " + pos2);
    }
}
