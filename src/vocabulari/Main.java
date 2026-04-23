package vocabulari;

import access.a.A;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        // Accés a propietat estàtica de la classe Vehicle
        System.out.println("NUM VEHICLES: "+ Vehicle.comptador);

        Moto v = new Moto("IB4437CL", 4, 60);
        System.out.println(v);

        // Accés a propietat no estàtica de la classe Vehicle
        System.out.println(v.matricula);

        // Accés a mètode no estàtic de la classe Vehicle
        System.out.println(v.getMatricula());

        // Accés a mètode estàtic de la classe Vehicle
        System.out.println(Vehicle.sumaRodes());

        Cotxe c = new Cotxe("OB15171XS", Cotxe.COMBUSTIBLE.ELECTRIC);

        // Polimorfisme: cridades al mateix mètode per a objectes de classes diferents
        v.print();
        c.print();

        Vehicle[] vehicles = new Vehicle[10];
        vehicles[0] = v;
        vehicles[1] = c;
        // Polimorfisme
        for(int i=0; i<2; i++){
            vehicles[i].print();
        }

        //Sense polimorfisme
        for(int i=0; i<2; i++){
            if(vehicles[i] instanceof Moto) {
                ((Moto)vehicles[i]).printMoto();
            }
            else if(vehicles[i] instanceof Cotxe) {
                ((Cotxe)vehicles[i]).printCotxe();
            }
        }


        // Instanciació de classe genèrica
        Plaça<Moto> pm = new Plaça<>();
        pm.aparcar(v);

        Plaça<Cotxe> pc = new Plaça<>();
        pc.aparcar(c);


        // TADs genèrics (ArrayList, LinkedList, Stack, ...)

        ArrayList<Vehicle> vs = new ArrayList<>();  //Constructor
        vs.add(v);  // Afegir elements
        vs.add(c);
        System.out.println(vs.get(0));  // Accedir a l'element
        System.out.println(vs.size());  // Llargada

        LinkedList<String> noms2 = new LinkedList<>();  //Constructor
        noms2.add("Paco");  // Afegir elements
        noms2.add("Pep");
        System.out.println(noms2.get(0));  // Accedir a l'element
        System.out.println(noms2.size()); // Llargada
    }
}
