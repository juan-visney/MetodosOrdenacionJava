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
}
