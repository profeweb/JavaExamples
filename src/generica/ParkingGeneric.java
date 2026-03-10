package generica;

public class ParkingGeneric<E> {

    E[] places;
    int numVehicles = 0;

    ParkingGeneric(int numPlaces){
        this.places = (E[]) new Object[numPlaces];
    }

    void entrada(E c){
        if(numVehicles <places.length) {
            for(int i=0; i<places.length; i++){
                if(places[i]==null){
                    this.places[i] = c;
                    this.numVehicles++;
                    break;
                }
            }
        }
    }

    void sortida(E c){
        for(int i=0; i<places.length; i++){
            if(places[i]==c){
                places[i]=null;
                numVehicles--;
                break;
            }
        }
    }

    int getNumPlacesLliures(){
        return this.places.length - this.numVehicles;
    }

    void print(){
        for(int i=0; i<places.length; i++){
            if(places[i]==null){
                System.out.printf("Plaça %d : lliure.\n", i);
            }
            else {
                System.out.printf("Plaça %d : ocupada (%s).\n", i, places[i].toString());
            }
        }
    }


}
