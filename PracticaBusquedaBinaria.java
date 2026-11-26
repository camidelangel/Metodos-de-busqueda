package MetodosDeBusqueda;

public class PracticaBusquedaBinaria {

    public static int busquedaBinaria(int[] arr, int clave) {

        int izq = 0;

        // TODO 1: Inicializa el limite derecho
        int der = arr.length - 1;

        // TODO 2: Revisa mientras existan elementos por buscar
        while (izq <= der) {

            // TODO 3: Calcula el punto medio
            int mid = (izq + der) / 2;

            if (arr[mid] == clave) {
                return mid; // Elemento encontrado

            } else if (arr[mid] < clave) {

                // TODO 4: La clave esta a la derecha
                izq = mid + 1;

            } else {

                // TODO 5: La clave esta a la izquierda
                der = mid - 1;
            }
        }

        // TODO 6: Regresa -1 si no se encuentra la clave
        return -1;
    }

    public static void main(String[] args) {

        // Arreglo previamente ordenado de menor a mayor
        int[] folios = {102, 115, 128, 140, 156, 173, 190, 205};

        int res1 = busquedaBinaria(folios, 173); // Esperado: 5
        int res2 = busquedaBinaria(folios, 130); // Esperado: -1

        System.out.println("Indice de 173: " + res1);
        System.out.println("Indice de 130: " + res2);
    }
}
