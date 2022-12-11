// Задача 3. Реализовать алгоритм пирамидальной сортировки (HeapSort).

public class PyramidSortingAlgorithm {

    public void sort(int arr[]) {
        int count = arr.length;

        for (int i = count / 2 - 1; i >= 0; i--)
            heapify(arr, count, i);

        for (int i = count - 1; i > 0; i--) {

            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    void heapify(int arr[], int count, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < count && arr[l] > arr[largest])
            largest = l;

        if (r < count && arr[r] > arr[largest])
            largest = r;

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, count, largest);
        }
    }

    static void printArray(int arr[]) {
        int count = arr.length;

        for (int i = 0; i < count; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {5, 7, 15, 11, 9, 25};
        int count = arr.length;

        PyramidSortingAlgorithm ob = new PyramidSortingAlgorithm();
        ob.sort(arr);

        printArray(arr);
    }
}
