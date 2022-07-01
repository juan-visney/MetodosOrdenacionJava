public class Ordenacion {
    private int array[];
    private int size;

    public Ordenacion() {
        size = 10;
        array = new int[size];
    }

    public Ordenacion(int size) {
        this.size = size;
        array = new int[size];
    }

    public void create() {
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 100);
        }
    }

    public String toString() {
        String res = "";
        for (int i = 0; i < size; i++) {
            res = res + array[i] + "\t";
        }
        return res;
    }

    // Burbuja
    public void burbuja() {
        int temp;
        boolean orden = false;
        while (!orden) {
            orden = true;
            for (int j = 0; j < size - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    orden = false;
                }
            }
        }
    }

    // Intercambio
    public void intercambio() {
        int temp;
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    // Seleccion
    public void seleccion() {
        int pos, temp;
        for (int i = 0; i < size - 1; i++) {
            pos = i;
            for (int j = i + 1; j < size; j++) {
                if (array[j] < array[pos]) {
                    pos = j;
                }
            }
            if (pos != i) {
                temp = array[i];
                array[i] = array[pos];
                array[pos] = temp;
            }
        }
    }

    // insercion
    public void insercion() {
        int temp, pos;
        for (int i = 1; i < size; i++) {
            temp = array[i];
            pos = i;
            while (pos > 0 && array[pos - 1] > temp) {
                array[pos] = array[pos - 1];
                pos--;
            }
            array[pos] = temp;
        }
    }

    // Shell Sort
    public void shell() {
        int inc = size / 2, temp;
        while (inc > 0) {
            for (int i = inc + 1; i < size; i++) {
                int j = i - inc;
                while (j >= 0) {
                    if (array[j] >= array[j + inc]) {
                        temp = array[j];
                        array[j] = array[j + inc];
                        array[j + inc] = temp;
                    } else {
                        j = 0;
                    }
                    j = j - inc;
                }
            }
            inc = inc / 2;
        }
    }

    // Merge Sort
    public void merge() {
        mergeSort(0, size - 1);
    }

    private void mergeSort(int ini, int fin) {
        if (ini < fin) {
            int med = (ini + fin) / 2;
            mergeSort(ini, med);
            mergeSort(med + 1, fin);
            merge(ini, med, fin);
        }
    }

    private void merge(int ini, int med, int fin) {
        int buffer[] = new int[ini + fin + 1];
        int i = ini, j = med + 1, k = ini;
        while (i <= med && j <= fin) {
            if (array[i] <= array[j]) {
                buffer[k++] = array[i++];
            } else {
                buffer[k++] = array[j++];
            }
        }
        while (i <= med) {
            buffer[k++] = array[i++];
        }
        while (j <= fin) {
            buffer[k++] = array[j++];
        }
        for (i = ini; i <= fin; i++) {
            array[i] = buffer[i];
        }
    }

    // Quick Sort
    public void quickSort() {
        quickSort(0, size - 1);
    }

    private void quickSort(int ini, int fin) {
        int temp;
        int left = ini, right = fin;
        int pivote = array[ini];
        while (left < right) {
            while (array[left] <= pivote && left < right) {
                left++;
            }
            while (array[right] > pivote) {
                right--;
            }
            if (left < right) {
                temp = array[left];
                array[left] = array[right];
                array[right] = temp;
            }
        }
        array[ini] = array[right];
        array[right] = pivote;
        if (ini < right - 1) {
            quickSort(ini, right - 1);
        }
        if (fin > right + 1) {
            quickSort(right + 1, fin);
        }
    }
}
