public class Principal {
    public static void main(String args[]) {
        Ordenacion array = new Ordenacion();
        array.create();
        System.out.println(array.toString());
        // array.burbuja();
        // array.intercambio();
        // array.seleccion();
        // array.insercion();
        array.quickSort();
        System.out.println(array.toString());
    }
}