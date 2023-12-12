package access.b;

import access.a.A;

public class MainB {

    public static void main(String[] args) {

        A a = new A(22, "Pepe", 'F');
        //a.print();  // private
        //a.print2();  // protected
        a.getNom(); // public
    }
}
