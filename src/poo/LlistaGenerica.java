package poo;

public class LlistaGenerica {

    public static void main(String[] args) {
        Llista<String> llistaNoms;
        Llista<Integer> llistaSencers;
        Llista<Float> llistaDecimals;

        llistaNoms = new Llista<String>();
        llistaNoms.append("Paco");
        llistaNoms.prepend("Bel");

        System.out.println(llistaNoms);
    }

    public static class Llista<E> {

        E[] array;
        int tail = -1;

        public Llista(){
            array = (E[]) new Object [10];
        }

        void prepend(E n){
            for(int i=tail; i>=0; i--){
                array[i+1] = array[i];
            }
            array[0] = n;
            tail++;
        }

        void append(E n){
            tail++;
            array[tail] = n;
        }

        boolean isEmpty(){
            return tail==-1;
        }

        boolean isFull(){
            return tail==array.length-1;
        }

        int numElements(){
            return tail+1;
        }

        E getElementAt(int i){
            return array[i];
        }

        E getFirst(){
            if(!isEmpty()){
                return array[0];
            }
            else {
                return null;
            }
        }

        E getLast(){
            if(!isEmpty()){
                return array[tail];
            }
            else {
                return null;
            }
        }

        E removeAt(int p){
            E temp = array[p];
            for(int i=p; i<tail; i++){
                array[i] = array[i+1];
            }
            tail--;
            return temp;
        }

        void insertAt(int p, E v){
            for(int i=tail+1; i>p; i--){
                array[i] = array[i-1];
            }
            array[p] = v;
            tail++;
        }

        public String toString(){
            String s = "";
            for(int i=0; i<=tail; i++){
                s += array[i].toString()+"\t";
            }
            return s;
        }

    }
}
