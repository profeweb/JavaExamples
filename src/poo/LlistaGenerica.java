package poo;

public class LlistaGenerica {

    public static void main(String[] args) {

        Llista<String> llista1;
        Llista<Integer> llista2;
    }


    public class Llista<E> {
        E[] array;

        public Llista(){
            array = (E[]) new Object[10];

        }

    }
}
