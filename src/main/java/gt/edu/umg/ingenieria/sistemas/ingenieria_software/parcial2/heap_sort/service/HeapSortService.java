package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.heap_sort.service;

public class HeapSortService {
    private static int x = -1;

    // Predefining the heap array
    static String []heap = new String[1000];

    // Defining formation of the heap
    public static void heapForm(String k)
    {
        x++;
        heap[x] = k;
        int child = x;
        String tmp;
        int index = x / 2;

        while (index >= 0) {
            if (heap[index].compareTo(heap[child]) > 0) {
                tmp = heap[index];
                heap[index] = heap[child];
                heap[child] = tmp;
                child = index;
                index = index / 2;
            }
            else
            {
                break;
            }
        }
    }

    /**
     * Si el nodo padre se almacena en el índice I, el hijo izquierdo se puede calcular con 2 * I + 1 y el hijo derecho con 2 * I + 2 (asumiendo que la indexación comienza en 0).
     */
    public static void heapSort()
    {
        int left1, right1;

        while (x >= 0)
        {
            String k,tmp;
            int index = 0;
            int length = x;

            k = heap[0];
            System.out.print(k + " ");
            heap[0] = heap[x];
            x = x - 1;
            left1 = 1;
            right1 = left1 + 1;

            while (left1 <= length) {
                if (heap[index].compareTo(heap[left1]) <= 0 && heap[index].compareTo(heap[right1]) <= 0)
                { break;
                }
                else {
                    if (heap[left1].compareTo(heap[right1])< 0) {
                        tmp = heap[index];
                        heap[index] = heap[left1];
                        heap[left1] = tmp;
                        index = left1; }
                    else {
                        tmp = heap[index];
                        heap[index] = heap[right1];
                        heap[right1] = tmp;
                        index = right1;
                    }
                }
                left1 = 2 * left1;
                right1 = left1 + 1;
            }
        }
    }

    public void sort(String k[]) {
            int n = k.length;
        for (int i = 0; i < n; i++)
        {
            heapForm(k[i]);
        }
        heapSort();
    }
}
