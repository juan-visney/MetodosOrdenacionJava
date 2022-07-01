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
}
